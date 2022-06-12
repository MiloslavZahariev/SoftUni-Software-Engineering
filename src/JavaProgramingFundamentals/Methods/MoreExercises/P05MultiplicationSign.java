package JavaProgramingFundamentals.Methods.MoreExercises;

import java.util.Scanner;

public class P05MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zeroCounter = 0;
        int negativeCounter = 0;

        for (int i = 0; i < 3; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            zeroCounter += checkForZeros(number);
            negativeCounter += checkForNegativeNumbers(number);
        }

        if (zeroCounter > 0) {
            System.out.println("zero");
        } else if (negativeCounter % 2 != 0) {
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }

    }

    public static int checkForZeros(double num) {
        if (Math.abs(num) == 0) {
            return 1;
        }
        return 0;
    }

    public static int checkForNegativeNumbers(double num) {
        if (num < 0) {
            return 1;
        }
        return 0;
    }
}
