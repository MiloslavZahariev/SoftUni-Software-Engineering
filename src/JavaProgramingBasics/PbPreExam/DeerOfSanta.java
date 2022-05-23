package JavaProgramingBasics.PbPreExam;

import java.util.Scanner;

public class DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int food = Integer.parseInt(scanner.nextLine());
        double firstDeerFood = Double.parseDouble(scanner.nextLine());
        double secondDeerFood = Double.parseDouble(scanner.nextLine());
        double thirdDeerFood = Double.parseDouble(scanner.nextLine());

        double totalFoodForDay = firstDeerFood + secondDeerFood + thirdDeerFood;
        double neededFood = totalFoodForDay * days;

        if (neededFood <= food) {
            System.out.printf("%.0f kilos of food left.", Math.floor(food - neededFood));
        }else {
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(neededFood - food));
        }

    }
}