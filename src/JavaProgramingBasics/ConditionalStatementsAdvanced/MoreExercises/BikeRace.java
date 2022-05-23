package JavaProgramingBasics.ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();

        double juniorPrice = 0.00;
        double seniorPrice = 0.00;

        switch (trace) {
            case "trail":
                juniorPrice = 5.5;
                seniorPrice = 7.0;
                break;
            case "cross-country":
                juniorPrice = 8.0;
                seniorPrice = 9.5;
                break;
            case "downhill":
                juniorPrice = 12.25;
                seniorPrice = 13.75;
                break;
            case "road":
                juniorPrice = 20;
                seniorPrice = 21.5;
                break;
        }

            double totalPrice = juniorPrice * juniors + seniorPrice * seniors;

            if(trace.equals("cross-country") && (juniors + seniors) >= 50){
                totalPrice = totalPrice *0.75;
            }
            totalPrice = totalPrice * 0.95;

        System.out.printf("%.2f",totalPrice);


    }
}
