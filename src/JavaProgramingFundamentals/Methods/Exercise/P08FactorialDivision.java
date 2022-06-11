package JavaProgramingFundamentals.Methods.Exercise;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long  firstFact = calculateFactorial(firstNumber);
        long  secondFact = calculateFactorial(secondNumber);

        double result = firstFact / (secondFact *1.0);

        System.out.printf("%.2f",result);
    }

    private static long calculateFactorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
