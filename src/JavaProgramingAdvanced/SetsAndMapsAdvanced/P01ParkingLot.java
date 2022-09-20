package JavaProgramingAdvanced.SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> cars = new LinkedHashSet<>();

        while (!input.equals("END")) {

            String[] info = input.split(", ");
            String command = info[0];
            String registration = info[1];

            if (command.equals("IN")) {
                cars.add(registration);
            } else {
                cars.remove(registration);
            }
            input = scanner.nextLine();
        }
        String output = "";
        if (cars.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            output = String.join(System.lineSeparator(), cars);
        System.out.println(output);
        }
    }
}
