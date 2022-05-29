package JavaProgramingFundamentals.DataTypesandVariables.MoreExercises;

import java.util.Scanner;

public class P04RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ednNumber = Integer.parseInt(scanner.nextLine());
        for (int startNumber = 2; startNumber <= ednNumber; startNumber++) {
            boolean itIsNotPrime = true;
            for (int divider = 2; divider < startNumber; divider++) {
                if (startNumber % divider == 0) {
                    itIsNotPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", startNumber, itIsNotPrime);
        }

    }
}
