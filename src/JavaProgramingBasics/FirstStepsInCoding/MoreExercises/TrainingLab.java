package JavaProgramingBasics.FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double h = Double.parseDouble(scanner.nextLine()); // height in meters
        double w = Double.parseDouble(scanner.nextLine()); // weight in meters
        double hCm = h * 100 ;
        double wCm = w * 100;
        double corridorW = 100 ; // corridor weight
        double usableW =wCm - corridorW ;


        int workPlaceRows = (int) usableW  / 70 ;
        int workPlacesColum = (int) hCm / 120 ;

        int workPlaces = workPlaceRows * workPlacesColum - 3 ; // because 1workplace is for door and 2 workplace is for department


        System.out.println( workPlaces);
    }
}
