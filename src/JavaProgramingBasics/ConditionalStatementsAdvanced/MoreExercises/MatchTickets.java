package JavaProgramingBasics.ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int persons = Integer.parseInt(scanner.nextLine());



        double transportPrice = 0.00;
        double ticketPrice = 0.00;
        if (persons <= 4 ) {
            transportPrice = budget * 0.75;
        }else if (persons <= 9 ) {
            transportPrice = budget * 0.6;
        }else if (persons <= 24) {
            transportPrice = budget * 0.5;
        }else if (persons <= 49) {
            transportPrice = budget * 0.4;
        }else {
            transportPrice = budget * 0.25;
        }

        switch (category) {
            case "VIP":
                ticketPrice = 499.99;
                break;
            case "Normal":
                ticketPrice = 249.99;
                break;
        }

        double diff = Math.abs((transportPrice + (ticketPrice * persons)) - budget);

        if ((transportPrice + (ticketPrice * persons)) <= budget) {
            System.out.printf("Yes! You have %.2f leva left.",diff);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.",diff);
        }


    }
}
