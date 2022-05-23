package JavaProgramingBasics.ForLoop.MoreExercises;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countNumber = Integer.parseInt(scanner.nextLine());

        double oddSum = 0.0;
        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0;
        double evenSum = 0.0;
        double evenMin = 1000000000.0;
        double evenMax = -1000000000.0;

        for (int i = 1; i <= countNumber; i++) {
            double numbers = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                evenSum += numbers;
                evenMax = Math.max(numbers, evenMax);
                evenMin = Math.min(numbers, evenMin);
            } else {
                oddSum += numbers;
                oddMax = Math.max(numbers, oddMax);
                oddMin = Math.min(numbers, oddMin);
            }

        }
        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (oddMin == 1000000000.0) {
            System.out.println("OddMin=No,");
        } else {
            System.out.printf("OddMin=%.2f,%n", oddMin);
        }
        if (oddMax == -1000000000.0) {
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMax=%.2f,%n", oddMax);
        }
        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (evenMin == 1000000000.0) {
            System.out.println("EvenMin=No,");
        } else {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
        }
        if (evenMax == -1000000000.0) {
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMax=%.2f%n", evenMax);
        }


    }

}
