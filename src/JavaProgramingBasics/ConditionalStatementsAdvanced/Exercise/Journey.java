package JavaProgramingBasics.ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String place = "";

        switch (season) {
            case "winter":
                place = "Hotel";
                break;
            case "summer":
                place = "Camp";
                break;
        }

        if (budget <= 100) {
            destination = "Bulgaria";
        } else if (budget <= 1000) {
            destination = "Balkans";
        } else {
            destination = "Europe";
        }

        switch (destination) {
            case "Bulgaria":
                if (season.equals("summer")) {
                    budget = budget * 0.3;
                }else if (season.equals("winter")) {
                    budget = budget * 0.7;
                }
                break;
            case "Balkans":
                if (season.equals("summer")) {
                    budget = budget * 0.4;
                }else if (season.equals("winter")) {
                    budget = budget * 0.8;
                }

                break;
            case "Europe":
                budget = budget * 0.9;
                place = "Hotel";
                break;

        }
        System.out.printf("Somewhere in %s",destination);
        System.out.println();
        System.out.printf("%s - %.2f",place,budget);
    }

}
