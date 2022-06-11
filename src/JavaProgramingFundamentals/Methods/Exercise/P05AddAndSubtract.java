package JavaProgramingFundamentals.Methods.Exercise;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
       int sum = getSumOfFirstTwoNumbers(firstNumber,secondNumber);

        System.out.println(getSubtractOfSumAndThirdNumber(sum,thirdNumber));

    }

    private static int getSumOfFirstTwoNumbers(int num1, int num2){
        return num1 + num2;
    }

    private static int getSubtractOfSumAndThirdNumber(int num1, int num2){
        return num1 - num2;
    }
}
