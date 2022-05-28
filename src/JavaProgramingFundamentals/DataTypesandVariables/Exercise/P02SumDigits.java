package JavaProgramingFundamentals.DataTypesandVariables.Exercise;

import java.util.Scanner;

public class P02SumDigits {
    public P02SumDigits() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int sum;
        int digit;
        for(sum = 0; number > 0; sum += digit) {
            digit = number % 10;
            number /= 10;
        }

        System.out.println(sum);
    }
}
