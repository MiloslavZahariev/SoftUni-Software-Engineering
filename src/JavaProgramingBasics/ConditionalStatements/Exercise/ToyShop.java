package JavaProgramingBasics.ConditionalStatements.Exercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tourPrice = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine()); // 2.60
        int doll = Integer.parseInt(scanner.nextLine()); // 3
        int bear = Integer.parseInt(scanner.nextLine()); // 4.1
        int minion = Integer.parseInt(scanner.nextLine()); // 8.2
        int truck = Integer.parseInt(scanner.nextLine()); // 2

        double total = puzzle * 2.6 + doll * 3 + bear * 4.1 + minion * 8.2 + truck * 2;
        int countToys = puzzle + doll + bear + minion + truck;

        if (countToys >= 50) {
            total = total * 0.75;
        }
        total = total * 0.9;

        if (total >= tourPrice) {
            System.out.printf("Yes! %.2f lv left.",total - tourPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.",tourPrice - total);
        }
    }
}
