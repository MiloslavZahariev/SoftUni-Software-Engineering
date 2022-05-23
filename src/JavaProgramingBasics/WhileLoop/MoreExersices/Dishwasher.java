package JavaProgramingBasics.WhileLoop.MoreExersices;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int detergentCount = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int allDetergent = 750 * detergentCount;
        int dishesNeededDetergent = 5;
        int potNeededDetergent = 15;
        int countVessels;
        int washDishes = 0;
        int washPots = 0;
        int counter = 0;

        while(!input.equals("End")){
            countVessels = Integer.parseInt(input);
            counter++;
            if (counter % 3 == 0){
                allDetergent -= potNeededDetergent * countVessels;
                washPots += countVessels;
            }else {
                allDetergent -= dishesNeededDetergent * countVessels;
                washDishes += countVessels;
            }

            if (allDetergent < 0){
                break;
            }
            input = scanner.nextLine();

        }

        if (allDetergent >= 0){
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n",washDishes,washPots);
            System.out.printf("Leftover detergent %d ml.",allDetergent);
        }else {
            System.out.printf("Not enough detergent, %d ml. more necessary!",Math.abs(allDetergent));
        }

    }
}
