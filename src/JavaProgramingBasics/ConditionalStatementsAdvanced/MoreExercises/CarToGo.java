package JavaProgramingBasics.ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String carClass = "";
        String typeCar = "";
        double carPrice = 0.00;

        if (budget <= 100 && season.equals("Summer")) {
            typeCar = "Cabrio";
            carPrice = budget * 0.35;
            carClass = "Economy class";
        } else if (budget <= 100 && season.equals("Winter")) {
            typeCar = "Jeep";
            carPrice = budget * 0.65;
            carClass = "Economy class";
        } else if (budget <= 500 && season.equals("Summer")) {
            typeCar = "Cabrio";
            carPrice = budget * 0.45;
            carClass = "Compact class";
        } else if (budget <= 500 && season.equals("Winter")) {
            typeCar = "Jeep";
            carPrice = budget * 0.80;
            carClass = "Compact class";
        }else {
            typeCar = "Jeep";
            carPrice = budget * 0.90;
            carClass = "Luxury class";
        }

        System.out.println(carClass);
        System.out.printf("%s - %.2f",typeCar,carPrice);

    }
}
