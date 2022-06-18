package JavaProgramingFundamentals.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        int bombNumber = Integer.parseInt(input.split(" ")[0]);
        int power = Integer.parseInt(input.split(" ")[1]);

        for (int i = 0; i < numList.size(); i++) {
            int index = i ;
            if (numList.get(index) == bombNumber) {
                i = -1;
                numList.remove(index);
                for (int j = 0; j < power; j++) {
                    if (index < numList.size()) {
                        numList.remove(index);
                    }
                }
                if (index - power >= 0) {
                    for (int j = 0; j < power; j++) {
                        numList.remove(index - power);
                    }
                } else {
                    for (int j = 0; j < index; j++) {
                        numList.remove(index - 1);
                    }
                }

            }
        }

        printSum(numList);
    }

    private static void printSum(List<Integer> numList) {
        int sum = 0;
        for (int element : numList) {
            sum += element;
        }
        System.out.println(sum);
    }

}
