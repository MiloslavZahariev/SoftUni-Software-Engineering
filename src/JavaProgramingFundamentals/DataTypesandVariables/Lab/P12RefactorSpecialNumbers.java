package JavaProgramingFundamentals.DataTypesandVariables.Lab;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public P12RefactorSpecialNumbers() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int endNumber = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i <= endNumber; ++i) {
            int sum = 0;

            for(int currentNumber = i; currentNumber > 0; currentNumber /= 10) {
                sum += currentNumber % 10;
            }

            if (sum != 5 && sum != 7 && sum != 11) {
                System.out.printf("%d -> False%n", i);
            } else {
                System.out.printf("%d -> True%n", i);
            }
        }

    }
}
