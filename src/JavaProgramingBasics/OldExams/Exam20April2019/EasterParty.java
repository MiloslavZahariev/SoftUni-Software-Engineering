package JavaProgramingBasics.OldExams.Exam20April2019;

import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double pricePerGuest = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double discount = 1.0;

        if (guests >= 10 && guests <= 15) {
            discount = 0.85;
        } else if (guests > 15 && guests <= 20) {
            discount = 0.8;
        } else if(guests > 20) {
            discount = 0.75;
        }

        double cakePrice = budget * 0.1;
        double totalGuestsPrice = (pricePerGuest * discount) * guests;

        if (budget >= cakePrice + totalGuestsPrice) {
            System.out.printf("It is party time! %.2f leva left.", budget - (cakePrice + totalGuestsPrice));
        } else {
            System.out.printf("No party! %.2f leva needed.",(cakePrice + totalGuestsPrice) - budget);
        }
    }
}
