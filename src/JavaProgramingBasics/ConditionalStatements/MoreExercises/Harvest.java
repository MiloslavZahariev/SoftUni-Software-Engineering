package JavaProgramingBasics.ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int areaVines = Integer.parseInt(scanner.nextLine()); // m2
        double grapes = Double.parseDouble(scanner.nextLine()); // kg
        int neededVine = Integer.parseInt(scanner.nextLine()); // liters
        int workers = Integer.parseInt(scanner.nextLine());

        double vine = (areaVines * grapes * 0.4 ) / 2.5 ;

        double diff = Math.abs(neededVine - vine);
        if (neededVine > vine ) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",Math.floor(diff));
        }else{
                double litersPerWorker = diff / workers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.",Math.floor(vine));
            System.out.println();
            System.out.printf("%.0f liters left -> %.0f liters per person.",Math.ceil(diff),Math.ceil(litersPerWorker));
        }

    }
}
