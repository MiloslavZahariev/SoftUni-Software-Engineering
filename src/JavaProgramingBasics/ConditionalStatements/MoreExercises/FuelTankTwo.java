package JavaProgramingBasics.ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FuelTankTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFuel = scanner.nextLine();
        double fuel = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();
        double discount;
        double totalPrice;

        double gasolinePrice = 2.22 ;
        double dieselPrice = 2.33 ;
        double gasPrice = 0.93 ;

        if (fuel > 25 ) {
            discount = 0.9;
        }else if (fuel >=20) {
            discount = 0.92;
        } else {
            discount = 1;}

        if (clubCard.equals("Yes")) {
            gasolinePrice = gasolinePrice - 0.18; // club card discount
            dieselPrice = dieselPrice - 0.12; // club card discount
            gasPrice = gasPrice - 0.08; // club card discount
        }

        if (typeOfFuel.equals("Diesel")) {
            totalPrice = dieselPrice * discount * fuel;
            System.out.printf("%.2f lv.",totalPrice);

        }else if(typeOfFuel.equals("Gasoline")){
            totalPrice = gasolinePrice * discount * fuel;
            System.out.printf("%.2f lv.",totalPrice);
        }else {
            totalPrice = gasPrice * discount * fuel;
            System.out.printf("%.2f lv.",totalPrice);

        }



    }
}
