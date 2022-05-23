package JavaProgramingBasics.ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFuel = scanner.nextLine();
        double fuel = Double.parseDouble(scanner.nextLine());
        String tank;
        String tank2;

        if (fuel >= 25) {
            tank = "You have enough ";
            tank2 = ".";
        } else {
            tank = "Fill your tank with ";
            tank2 = "!";
        }
        if (typeOfFuel.equals("Diesel") || typeOfFuel.equals("Gasoline") || typeOfFuel.equals("Gas")) {
            typeOfFuel = typeOfFuel.toLowerCase();
            System.out.printf("%s%s%s", tank, typeOfFuel, tank2);
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}

