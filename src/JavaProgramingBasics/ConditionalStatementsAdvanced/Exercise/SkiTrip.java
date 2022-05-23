package JavaProgramingBasics.ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String evaluation = scanner.nextLine();

        double roomForOnePersonPrice = 18.00;
        double apartmentPrice = 25.00;
        double presidentApartmentPrice = 35.00;

        int nights = days - 1;
        double totalPrice = 0;

        switch (room) {
            case "room for one person":
                totalPrice = nights * roomForOnePersonPrice;
                break;
            case "apartment":
                if (days < 10) {
                    totalPrice = (nights * apartmentPrice) * 0.7;
                } else if (days <= 15) {
                    totalPrice = (nights * apartmentPrice) * 0.65;
                } else {
                    totalPrice = (nights * apartmentPrice) * 0.5;
                }
                break;
            case "president apartment":
                if (days < 10) {
                    totalPrice = (nights * presidentApartmentPrice) * 0.9;
                } else if (days <= 15) {
                    totalPrice = (nights * presidentApartmentPrice) * 0.85;
                } else {
                    totalPrice = (nights * presidentApartmentPrice) * 0.8;
                }
                break;
        }

        switch (evaluation) {
            case "positive":
                totalPrice = totalPrice * 1.25;
                break;
            case "negative":
                totalPrice = totalPrice * 0.9;
                break;
        }
        System.out.printf("%.2f",totalPrice);
    }
}
