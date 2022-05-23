package JavaProgramingBasics.WhileLoop.MoreExersices;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededMoney = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int money = 0;
        int counter = 0;
        int payWithCash = 0;
        int payWithCashCounter = 0;
        int payWithCard = 0;
        int payWithCardCounter = 0;
        int totalMoney = 0;


        while (!input.equals("End")) {
            counter++;
            money = Integer.parseInt(input);

            if (counter % 2 != 0) {
                if (money > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    payWithCash += money;
                    totalMoney += money;
                    payWithCashCounter++;
                }
            } else {
                if (money < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    payWithCard += money;
                    totalMoney += money;
                    payWithCardCounter++;
                }
            }
            if (neededMoney <= totalMoney) {
                break;
            }

            input = scanner.nextLine();
        }

        double averageCS = 1.0*payWithCash / payWithCashCounter ;
        double averageCC = 1.0*payWithCard / payWithCardCounter;

        if (neededMoney <= totalMoney){
            System.out.printf("Average CS: %.2f%n",averageCS);
            System.out.printf("Average CC: %.2f%n",averageCC);
        }else {
            System.out.println("Failed to collect required money for charity.");
        }


    }
}
