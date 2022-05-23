package JavaProgramingBasics.OldExams.Exam20April2019;

import java.util.Scanner;

public class EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bakePrice = Double.parseDouble(scanner.nextLine());
        double bakeKilograms = Double.parseDouble(scanner.nextLine());
        double sugarKilograms = Double.parseDouble(scanner.nextLine());
        int eggsPackages = Integer.parseInt(scanner.nextLine());
        int yeastPackages = Integer.parseInt(scanner.nextLine());

        double sugarPrice = bakePrice * 0.75;
        double eggsPackagesPrice = bakePrice * 1.1;
        double yeastPackagesPrice = sugarPrice * 0.2;

        double totalBakePrice = bakePrice * bakeKilograms;
        double totalSugarPrice = sugarPrice * sugarKilograms;
        double totalEggsPrice = eggsPackagesPrice * eggsPackages;
        double totalYeastPrice = yeastPackagesPrice * yeastPackages;

        System.out.printf("%.2f",totalBakePrice + totalSugarPrice + totalEggsPrice + totalYeastPrice);

    }
}
