package JavaProgramingBasics.ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());

        int boatSpringPrice = 3000;
        int boatSummerPrice = 4200;
        int boatAutumnPrice = 4200;
        int boatWinterPrice = 2600;
        double discount1 = 1 ;
        double price = 0;

        if (fishermen <= 6) {
            discount1 = discount1 * 0.9;
        } else if (fishermen <= 11) {
            discount1 = discount1 * 0.85;
        } else {
            discount1 = discount1 * 0.75;
        }

        if (!season.equals("Autumn") && fishermen % 2 == 0) {
            discount1 = discount1 * 0.95;
        }
        switch (season) {
            case "Spring":
                price = discount1 * boatSpringPrice;
                break;
            case "Summer":
                price = discount1 * boatSummerPrice;
                break;
            case "Autumn":
                price = discount1 * boatAutumnPrice;
                break;
            case "Winter":
                price = discount1 * boatWinterPrice;
                break;
        }

        double diff = Math.abs(price - budget);
        if (price <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}

