package JavaProgramingBasics.ForLoop.MoreExercises;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moves = Integer.parseInt(scanner.nextLine());
        double points = 0.0;
        double number0to9 = 0.0;
        double number10to19 = 0.0;
        double number20to29 = 0.0;
        double number30to39 = 0.0;
        double number40to50 = 0.0;
        double invalidNumber = 0.0;

        for (int i = 0; i < moves; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());

            if (numbers >= 0 && numbers <= 9) {
                points += numbers * 0.2;
                number0to9++;
            } else if (numbers >= 0 && numbers <= 19) {
                points += numbers * 0.3;
                number10to19++;
            } else if (numbers >= 0 && numbers <= 29) {
                points += numbers * 0.4;
                number20to29++;
            } else if (numbers >= 0 && numbers <= 39) {
                points += 50;
                number30to39++;
            } else if (numbers >= 0 && numbers <= 50) {
                points += 100;
                number40to50++;
            } else {
                points /= 2;
                invalidNumber++;
            }
        }
        System.out.printf("%.2f%n",points);
        System.out.printf("From 0 to 9: %.2f%%%n",number0to9/moves *100);
        System.out.printf("From 10 to 19: %.2f%%%n",number10to19/moves *100);
        System.out.printf("From 20 to 29: %.2f%%%n",number20to29/moves *100);
        System.out.printf("From 30 to 39: %.2f%%%n",number30to39/moves *100);
        System.out.printf("From 40 to 50: %.2f%%%n",number40to50/moves *100);
        System.out.printf("Invalid numbers: %.2f%%%n",invalidNumber/moves *100);
    }
}
