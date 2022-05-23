package JavaProgramingBasics.FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veganMenu = Integer.parseInt(scanner.nextLine());

        double chickenMenuPrice = 10.35;
        double fishMenuPrice = 12.40;
        double veganMenuPrice = 8.15;
        double delivery = 2.50;

        double orderPrice = chickenMenu * chickenMenuPrice + fishMenu * fishMenuPrice + veganMenu * veganMenuPrice;
        double dessertPrice = orderPrice * 0.2;
        double finalPrice = orderPrice + dessertPrice + delivery;

        System.out.println(finalPrice);
    }
}
