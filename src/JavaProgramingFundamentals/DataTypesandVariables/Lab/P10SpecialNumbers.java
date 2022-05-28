package JavaProgramingFundamentals.DataTypesandVariables.Lab;

import java.util.Scanner;

public class P10SpecialNumbers {
    public P10SpecialNumbers() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i <= n; ++i) {
            int currentNum = i;

            int sum;
            for(sum = 0; currentNum > 0; currentNum /= 10) {
                sum += currentNum % 10;
            }

            if (sum != 5 && sum != 7 && sum != 11) {
                System.out.printf("%d -> False%n", i);
            } else {
                System.out.printf("%d -> True%n", i);
            }
        }

    }
}
