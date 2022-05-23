package JavaProgramingFundamentals.BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String start = scanner.nextLine();
        double totalCoins = 0;

        while (!start.equals("Start")) {
            double coins = Double.parseDouble(start);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                totalCoins += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            start = scanner.nextLine();
        }

        double nutsPrice = 2.0;
        double waterPrice = 0.7;
        double crispsPrice = 1.5;
        double sodaPrice = 0.8;
        double cokePrice = 1.0;
        String product = scanner.nextLine();

        while (!product.equals("End")) {
            if (product.equals("Nuts") && totalCoins >= nutsPrice) {
                System.out.printf("Purchased %s%n", product);
                totalCoins -= nutsPrice;
            } else if (product.equals("Water") && totalCoins >= waterPrice) {
                System.out.printf("Purchased %s%n", product);
                totalCoins -= waterPrice;
            }else if (product.equals("Crisps") && totalCoins >= crispsPrice) {
                System.out.printf("Purchased %s%n", product);
                totalCoins -= crispsPrice;
            }else if (product.equals("Soda") && totalCoins >= sodaPrice) {
                System.out.printf("Purchased %s%n", product);
                totalCoins -= sodaPrice;
            }else if (product.equals("Coke") && totalCoins >= cokePrice) {
                System.out.printf("Purchased %s%n", product);
                totalCoins -= cokePrice;
            }else if (!product.equals("Nuts") && !product.equals("Water") && !product.equals("Crisps") && !product.equals("Soda") && !product.equals("Coke")){
                System.out.println("Invalid product");
            }else {
                System.out.println("Sorry, not enough money");
            }

            product = scanner.nextLine();
        }
        if (totalCoins >= 0)
        System.out.printf("Change: %.2f",totalCoins);
    }
}
