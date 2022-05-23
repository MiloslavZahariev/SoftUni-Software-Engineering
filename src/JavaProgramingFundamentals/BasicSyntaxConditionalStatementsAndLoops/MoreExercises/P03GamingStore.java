package JavaProgramingFundamentals.BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());

        double outFallPrice = 39.99;
        double csGoPrice = 15.99;
        double zplinterPrice = 19.99;
        double honoredPrice = 59.99;
        double roverWatchPrice = 29.99;
        double roverWatchOEPrice = 39.99;

        double totalSpend = 0.0;

        String game = scanner.nextLine();

        while (!game.equals("Game Time")) {
            if (game.equals("OutFall 4") && balance >= totalSpend + outFallPrice) {
                System.out.printf("Bought %s%n", game);
                totalSpend += outFallPrice;
            } else if (game.equals("CS: OG") && balance >= totalSpend + csGoPrice) {
                System.out.printf("Bought %s%n", game);
                totalSpend += csGoPrice;
            } else if (game.equals("Zplinter Zell") && balance >= totalSpend + zplinterPrice) {
                System.out.printf("Bought %s%n", game);
                totalSpend += zplinterPrice;
            } else if (game.equals("Honored 2") && balance >= totalSpend + honoredPrice) {
                System.out.printf("Bought %s%n", game);
                totalSpend += honoredPrice;
            } else if (game.equals("RoverWatch") && balance >= totalSpend + roverWatchPrice) {
                System.out.printf("Bought %s%n", game);
                totalSpend += roverWatchPrice;
            } else if (game.equals("RoverWatch Origins Edition") && balance >= totalSpend + roverWatchOEPrice) {
                System.out.printf("Bought %s%n", game);
                totalSpend += roverWatchOEPrice;
            } else if (balance > totalSpend) {
                if (!game.equals("OutFall 4") && !game.equals("CS: OG") && !game.equals("Zplinter Zell") && !game.equals("Honored 2") && !game.equals("RoverWatch") && !game.equals("RoverWatch Origins Edition")) {
                    System.out.println("Not Found");
                } else {
                    System.out.println("Too Expensive");
                }
            } else {
                System.out.println("Out of money!");
                return;
            }


            game = scanner.nextLine();
        }
        if (balance > totalSpend) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpend, balance - totalSpend);
        }else {
            System.out.println("Out of money!");
        }

    }
}
