package JavaProgramingBasics.OldExams.Exam20April2019;

import java.util.Scanner;

public class EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBakes = Integer.parseInt(scanner.nextLine());
        double totalSugar = 0;
        double totalFlour = 0;
        int maxSugar = 0;
        int maxFlour = 0;

        for (int i = 0; i < countBakes; i++) {
            int sugar = Integer.parseInt(scanner.nextLine());
            int flour = Integer.parseInt(scanner.nextLine());

            maxSugar = Math.max(sugar,maxSugar);
            maxFlour = Math.max(flour,maxFlour);

            totalSugar += sugar;
            totalFlour += flour;

        }

        double packagesSugar = Math.ceil(totalSugar / 950);
        double packagesFlour = Math.ceil(totalFlour / 750);

        System.out.printf("Sugar: %.0f%n",packagesSugar);
        System.out.printf("Flour: %.0f%n",packagesFlour);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.",maxFlour,maxSugar);
    }
}
