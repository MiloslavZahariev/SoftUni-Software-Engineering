package JavaProgramingFundamentals.DataTypesandVariables.Exercise;

import java.util.Scanner;

public class P03Elevator {
    public P03Elevator() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int persons = Integer.parseInt(scanner.nextLine());
        int elevatorCapacity = Integer.parseInt(scanner.nextLine());
        int course = persons / elevatorCapacity;
        if (persons % elevatorCapacity != 0) {
            ++course;
        }

        System.out.println(course);
    }
}