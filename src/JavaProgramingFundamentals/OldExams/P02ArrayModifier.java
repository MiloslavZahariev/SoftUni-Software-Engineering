package JavaProgramingFundamentals.OldExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] commandLine = input.split(" ");

            switch (commandLine[0]) {
                case "swap":
                    swappingNumbers(numList,commandLine[1],commandLine[2]);
                    break;
                case "multiply":
                    multiplyNumbers(numList,commandLine[1],commandLine[2]);
                    break;
                case "decrease":
                    decreaseAllNumbers(numList);
                    break;
            }


            input = scanner.nextLine();
        }
        System.out.println(numList.toString().replaceAll("[\\[\\]]",""));
    }

    private static void decreaseAllNumbers(List<Integer> numList) {

        for (int i = 0; i < numList.size() ; i++) {
            numList.set(i,numList.get(i) -1);
        }
    }

    private static void multiplyNumbers(List<Integer> numList, String firstNum, String secondNum) {
        int index1 = Integer.parseInt(firstNum);
        int index2 = Integer.parseInt(secondNum);

        int sum = numList.get(index1) * numList.get(index2);
        numList.set(index1,sum);
    }

    private static void swappingNumbers(List<Integer> numList, String firstNum, String secondNum) {
        int index1 = Integer.parseInt(firstNum);
        int index2 = Integer.parseInt(secondNum);

        int tempNumber = numList.get(index2);
        numList.set(index2,numList.get(index1));
        numList.set(index1,tempNumber);
    }
}
