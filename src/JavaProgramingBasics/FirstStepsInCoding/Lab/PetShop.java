package JavaProgramingBasics.FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());
        double bothFoodPrice = dogFood * 2.5 + catFood * 4;

        System.out.println(bothFoodPrice + " lv.");
        }


    }
