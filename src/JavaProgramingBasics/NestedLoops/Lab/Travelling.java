package JavaProgramingBasics.NestedLoops.Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        double savedMoney = 0;

        while (!destination.equals("End")) {
        double budget = Double.parseDouble(scanner.nextLine());
            while (budget > savedMoney) {
                double money = Double.parseDouble(scanner.nextLine());

                savedMoney += money;
            }

            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
            savedMoney = 0;
        }

    }
}
