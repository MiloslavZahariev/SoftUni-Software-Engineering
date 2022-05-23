package JavaProgramingBasics.OldExams.Exam28March2020;

import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double basketPrice = 1.50;
        double wreathPrice = 3.8;
        double bunnyPrice = 7;


        int clients = Integer.parseInt(scanner.nextLine());
        double averageBill = 0;

        for (int i = 0; i < clients; i++) {
            double discount = 1;
            String input = scanner.nextLine();
            int counterBasket = 0;
            int counterWreath = 0;
            int counterBunny = 0;
            while (!input.equals("Finish")) {
                switch (input) {
                    case "basket":
                        counterBasket++;
                        break;
                    case "wreath":
                        counterWreath++;
                        break;
                    case "chocolate bunny":
                        counterBunny++;
                        break;
                }

                input = scanner.nextLine();
            }

            int totalCounter = counterBasket + counterWreath + counterBunny;
            if (totalCounter % 2 == 0) {
                discount = 0.8;
            }

            double price = (counterBasket * basketPrice + counterWreath * wreathPrice + counterBunny * bunnyPrice) * discount;
            System.out.printf("You purchased %d items for %.2f leva.%n", totalCounter, price);
            averageBill += price;
        }
        System.out.printf("Average bill per client is: %.2f leva.", averageBill / (clients));
    }
}
