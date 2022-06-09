package JavaProgramingFundamentals.Methods.Lab;

import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getMultiplyOfEvensAndOdds(input));

    }

    public static int getSumOfEvenDigits(int digits) {
        int evenSum = 0;
        while (digits > 0) {
            int lastDigit = digits % 10;
            if (lastDigit % 2 == 0) {
                evenSum += lastDigit;
            }
            digits /= 10;
        }
        return evenSum;
    }

    public static int getSumOfOddDigits(int digits) {
        int oddSum = 0;
        while (digits > 0) {
            int lastDigit = digits % 10;
            if (lastDigit % 2 != 0) {
                oddSum += lastDigit;
            }
            digits /= 10;
        }
        return oddSum;
    }

    private static int getMultiplyOfEvensAndOdds(int n){
    int evenSums = getSumOfEvenDigits(n);
    int oddSums = getSumOfOddDigits(n);
    return evenSums * oddSums;
    }

}
