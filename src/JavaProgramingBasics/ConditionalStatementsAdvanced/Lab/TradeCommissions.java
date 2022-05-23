package JavaProgramingBasics.ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commissions = 0;

        if (sales >= 0 && sales <= 500) {
            switch (city) {
                case "Sofia":
                    commissions = 0.05;
                    break;
                case "Varna":
                    commissions = 0.045;
                    break;
                case "Plovdiv":
                    commissions = 0.055;
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (sales <= 1000 && sales > 500) {
            switch (city) {
                case "Sofia":
                    commissions = 0.07;
                    break;
                case "Varna":
                    commissions = 0.075;
                    break;
                case "Plovdiv":
                    commissions = 0.08;
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (sales <= 10000 && sales >1000) {
            switch (city) {
                case "Sofia":
                    commissions = 0.08;
                    break;
                case "Varna":
                    commissions = 0.1;
                    break;
                case "Plovdiv":
                    commissions = 0.12;
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (sales > 10000) {
            switch (city) {
                case "Sofia":
                    commissions = 0.12;
                    break;
                case "Varna":
                    commissions = 0.13;
                    break;
                case "Plovdiv":
                    commissions = 0.145;
                    break;
                default:
                    System.out.println("error");
                    break;
            }
            } else {
              System.out.println("error");
        }
        if (commissions != 0 && sales > 0) {
            System.out.printf("%.2f", sales * commissions);

        }
    }
}
