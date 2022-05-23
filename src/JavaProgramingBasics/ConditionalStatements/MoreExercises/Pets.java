package JavaProgramingBasics.ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int food = Integer.parseInt(scanner.nextLine());
        double dogFoodPerDay = Double.parseDouble(scanner.nextLine()); // in kilograms
        double catFoodPerDay = Double.parseDouble(scanner.nextLine()); // in kilograms
        double turtleFoodPerDay = Double.parseDouble(scanner.nextLine()); // in grams
        double turtleFoodKg = turtleFoodPerDay / 1000 ;

        double neededFood = (dogFoodPerDay + catFoodPerDay +turtleFoodKg) * days;
        double diff = Math.abs(food - neededFood);

                if (food >= neededFood){
                    System.out.printf("%.0f kilos of food left.",Math.floor(diff));
                }else{
                    System.out.printf("%.0f more kilos of food are needed.",Math.ceil(diff));
                }


    }
}
