package JavaProgramingBasics.ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        double taxiPrice;
        double startTaxiPrice = 0.70;
        double busPrice = 0.09;
        double trainPrice = 0.06;

            if (time.equals("day")){
                taxiPrice = 0.79;
                if (n>= 100){
                    System.out.printf("%.2f",trainPrice * n);
                }else if (n >= 20){
                    System.out.printf("%.2f",busPrice * n);
                }else {
                    System.out.printf("%.2f",taxiPrice * n + startTaxiPrice);
                }
            }else {
                taxiPrice = 0.90;
                if (n>= 100){
                    System.out.printf("%.2f",trainPrice * n);
                }else if (n >= 20){
                    System.out.printf("%.2f",busPrice * n);
                }else {
                    System.out.printf("%.2f",taxiPrice * n + startTaxiPrice);
                }

            }

    }
}
