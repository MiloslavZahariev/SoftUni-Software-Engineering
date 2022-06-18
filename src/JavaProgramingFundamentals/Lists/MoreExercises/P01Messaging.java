package JavaProgramingFundamentals.Lists.MoreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String message = scanner.nextLine();

        for (int i = 0; i < numList.size(); i++) {
            int currentNumber = numList.get(i);
            int sum = getSumOfCurrentNum(currentNumber);

            int indexOfText = 0;
            if (message.length() < sum) {
                indexOfText = sum % message.length();
            } else {
                indexOfText = sum;
            }

            message = printCodeLetterAndCutMessage(message, indexOfText);
        }

        System.out.println();
    }

    private static String printCodeLetterAndCutMessage(String message, int indexOfText) {
        System.out.print(message.charAt(indexOfText));
        String cutMessage = "";

        for (int i = 0; i < message.length(); i++) {
            if (i != indexOfText) {
                cutMessage += message.charAt(i);
            }
        }
        return cutMessage;
    }

    private static int getSumOfCurrentNum(int currentNumber) {
        int sum = 0;
        while (currentNumber > 0) {
            sum += currentNumber % 10;
            currentNumber /= 10;

        }
        return sum;
    }

}
