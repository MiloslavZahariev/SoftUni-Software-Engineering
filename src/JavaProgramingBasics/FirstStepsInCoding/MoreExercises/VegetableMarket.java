package JavaProgramingBasics.FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vegetablesPrice = Double.parseDouble(scanner.nextLine());
        double fruitsPrice = Double.parseDouble(scanner.nextLine());
        int vegetablesMass = Integer.parseInt(scanner.nextLine());
        int fruitsMass = Integer.parseInt(scanner.nextLine());

        double price = (vegetablesPrice * vegetablesMass + fruitsPrice * fruitsMass) / 1.94 ;

        System.out.printf("%.2f",price);

    }
}
