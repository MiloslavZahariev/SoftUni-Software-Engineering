package JavaProgramingBasics.ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String place = "";
        String destination = "";
        double price = 0.00;

        if (budget <= 1000) {
            place = "Camp";
            if (season.equals("Summer")){
                price = budget * 0.65;
            }else {
                price = budget * 0.45;
            }
        } else if (budget <= 3000) {
            place = "Hut";
            if (season.equals("Summer")){
                price = budget * 0.80;
            }else {
                price = budget * 0.60;
            }
        } else {
            place = "Hotel";
            price = budget * 0.9;
        }
        switch (season) {
            case "Summer":
                destination = "Alaska";
                break;
            case "Winter":
                destination = "Morocco";
                break;
        }

        System.out.printf("%s - %s - %.2f",destination,place,price);

    }
}
