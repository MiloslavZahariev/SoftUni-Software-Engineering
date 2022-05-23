package JavaProgramingBasics.ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemumCount = Integer.parseInt(scanner.nextLine());
        int rosesCount = Integer.parseInt(scanner.nextLine());
        int tulipCount = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double chrysanthemumPrice = 0.0;
        double rosesPrice = 0.0;
        double tulipPrice = 0.0;

        switch (season) {
            case "Spring":
            case "Summer":
                chrysanthemumPrice = 2.00;
                rosesPrice = 4.1;
                tulipPrice = 2.5;
                break;
            case "Autumn":
            case "Winter":
                chrysanthemumPrice = 3.75;
                rosesPrice = 4.5;
                tulipPrice = 4.15;
                break;
        }
        double totalPrice = chrysanthemumPrice * chrysanthemumCount + rosesPrice * rosesCount + tulipPrice * tulipCount;

        switch (holiday) {
            case "Y":
                totalPrice = totalPrice *1.15;
                break;
        }

        if (season.equals("Spring") && tulipCount > 7){
            totalPrice = totalPrice * 0.95;
        }
        if (season.equals("Winter") && rosesCount >= 10){
            totalPrice = totalPrice *0.9;
        }

        if ((chrysanthemumCount + rosesCount + tulipCount) > 20 ){
            totalPrice = totalPrice * 0.8;
        }

        totalPrice = totalPrice + 2;

        System.out.printf("%.2f",totalPrice);

    }
}
