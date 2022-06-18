package JavaProgramingFundamentals.Lists.MoreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        double firstCarTime = 0.0;
        double secondCarTime = 0.0;

        for (int i = 0; i < numList.size() / 2; i++) {
            firstCarTime += numList.get(i);
            if (numList.get(i) == 0) {
                firstCarTime *= 0.8;
            }
        }
        for (int i = numList.size() - 1; i > numList.size() / 2; i--) {
            secondCarTime += numList.get(i);
            if (numList.get(i) == 0) {
                secondCarTime *= 0.8;
            }
        }

        if (firstCarTime < secondCarTime) {
            System.out.printf("The winner is left with total time: %.1f",firstCarTime);
        }else {
            System.out.printf("The winner is right with total time: %.1f",secondCarTime);
        }
    }
}
