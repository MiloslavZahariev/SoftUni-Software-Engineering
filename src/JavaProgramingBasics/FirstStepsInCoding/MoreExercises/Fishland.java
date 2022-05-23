package JavaProgramingBasics.FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerelPrice = Double.parseDouble(scanner.nextLine()); // price for kg
        double spratPrice = Double.parseDouble(scanner.nextLine()); // price for kg
        double weightBonito = Double.parseDouble(scanner.nextLine()); // weight in kg
        double weightHorseMackerel  = Double.parseDouble(scanner.nextLine());// weight in kg
        int weightShells = Integer.parseInt(scanner.nextLine()); // weight in kg

        double shellsPrice = 7.5 ; // price for kg
        double bonitoPrice = mackerelPrice * 1.6 ; // price for kg
        double horseMackerelPrice = spratPrice * 1.8 ; // price for kg

        double totalShellsPrice = weightShells * shellsPrice ;
        double totalBonitoPrice = weightBonito * bonitoPrice ;
        double totalHorseMackerelPrice = weightHorseMackerel * horseMackerelPrice ;

        double totalPrice = totalShellsPrice + totalBonitoPrice + totalHorseMackerelPrice ;

        System.out.printf("%.2f",totalPrice);

    }
}
