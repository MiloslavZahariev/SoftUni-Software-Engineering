package JavaProgramingBasics.ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kilometersPerMonth = Double.parseDouble(scanner.nextLine());
        double wage = 0.0;
        double totalWage= 0.0;

        switch (season) {
            case "Spring":
            case "Autumn":
                if(kilometersPerMonth <= 5000) {
                    wage = 0.75;
                }else if (kilometersPerMonth <= 10000){
                    wage = 0.95;
                }else {
                    wage =1.45;
                }
                break;
            case "Summer":
                if(kilometersPerMonth <= 5000) {
                    wage = 0.90;
                }else if (kilometersPerMonth <= 10000){
                    wage = 1.1;
                }else {
                    wage =1.45;
                }
                break;
            case "Winter":
                if(kilometersPerMonth <= 5000) {
                    wage = 1.05;
                }else if (kilometersPerMonth <= 10000){
                    wage = 1.25;
                }else {
                    wage =1.45;
                }
                break;
        }

         totalWage = wage * kilometersPerMonth * 4;
         totalWage = totalWage * 0.9;

        System.out.printf("%.2f",totalWage);
    }
}
