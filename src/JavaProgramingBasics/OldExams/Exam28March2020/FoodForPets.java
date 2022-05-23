package JavaProgramingBasics.OldExams.Exam28March2020;

import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double allFood = Double.parseDouble(scanner.nextLine());
        double biscuits = 0.0;

        double totalDogFood = 0.0;
        double totalCatFood = 0.0;

        for (int i = 1; i <= days ; i++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());
            totalDogFood += dogFood;
            totalCatFood += catFood;
            if (i % 3 == 0){
                biscuits += (dogFood + catFood) * 0.1;
            }

        }

        double totalFood = totalCatFood + totalDogFood;

        System.out.printf("Total eaten biscuits: %.0fgr.%n",biscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n",(totalFood/allFood)*100);
        System.out.printf("%.2f%% eaten from the dog.%n",(totalDogFood/totalFood)*100);
        System.out.printf("%.2f%% eaten from the cat.",(totalCatFood/totalFood) *100);
    }
}
