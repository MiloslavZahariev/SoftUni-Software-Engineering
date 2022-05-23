package JavaProgramingBasics.NestedLoops.Exercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int i = firstNumber; i <= secondNumber; i++) {

            int currentNumber = i;
            int evenSum = 0;
            int oddSum = 0;

            for (int j = 6; j >= 0; j--) {
                int digit = currentNumber % 10;
                if (j % 2 == 0) {
                    evenSum += digit;
                }else {
                    oddSum += digit;
                }
                currentNumber = currentNumber / 10 ;
            }

            if (evenSum == oddSum){
                System.out.printf("%d ",i);
            }
        }
    }
}
