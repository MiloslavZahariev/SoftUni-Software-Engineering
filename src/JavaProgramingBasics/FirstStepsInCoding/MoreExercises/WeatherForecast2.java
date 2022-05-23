package JavaProgramingBasics.FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class WeatherForecast2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weather = Double.parseDouble(scanner.nextLine());

        if( 5.0 <=weather && weather <= 11.9){
            System.out.println("Cold");
        }

        else if ( 12.0 <=weather && weather <= 14.9) {
            System.out.println("Cool");
        }
        else if ( 15.0 <=weather && weather <= 20.0) {
            System.out.println("Mild");
        }
        else if ( 20.1 <=weather && weather <= 25.9) {
            System.out.println("Warm");

        }
        else if ( 26.0 <=weather && weather <= 35.0) {
            System.out.println("Hot");

        }
        else  {
            System.out.println("unknown");

        }
    }
}
