package JavaProgramingBasics.FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine()); // height
        double y = Double.parseDouble(scanner.nextLine()); // length
        double h = Double.parseDouble(scanner.nextLine()); // height of roof

        double greenPaint = 3.4 ; // cost liters for m2
        double redPaint = 4.3 ; // cost liters for m2
        double doorArea = 1.2 * 2 ; // area in m2
        double windowAreas = 1.5 * 1.5 * 2; // area in m2

        double frontWallArea = (x * x) - doorArea;
        double backWallArea = x * x ;
        double sideWallsArea = (x * y * 2 ) - windowAreas ;

        double wallsArea = frontWallArea + backWallArea + sideWallsArea ; // total walls area for green painting
        double costGreenPaint = wallsArea / greenPaint ;

        double triangleRoofArea = (x * h) / 2 ; // area for front (back) triangle of roof
        double sideRoofArea = x * y ; // area for side roof
        double roofArea = 2 * triangleRoofArea + 2 * sideRoofArea;
        double costRedPaint = roofArea / redPaint ;


        System.out.printf("%.2f %n%.2f",costGreenPaint , costRedPaint);


    }
}
