package JavaProgramingBasics.ConditionalStatements.Exercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.1;
        double statistsClothes = statists * clothesPrice;

        if (statists > 150) {
            statistsClothes = statistsClothes * 0.9;
        }

        double totalPrice = decorPrice + statistsClothes;

        if (budget >= totalPrice) {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", budget - totalPrice);
        } else {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", totalPrice - budget);
        }

    }
}
