package JavaProgramingBasics.OldExams.Exam20April2019;

import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String size = scanner.nextLine();
        String color = scanner.nextLine();
        int eggsStack = Integer.parseInt(scanner.nextLine());
        double pricePerStack = 0;

        switch (size) {
            case "Large":
                if (color.equals("Red")) {
                    pricePerStack = 16;
                } else if (color.equals("Green")) {
                    pricePerStack = 12;
                } else {
                    pricePerStack = 9;
                }
                break;
            case "Medium":
                if (color.equals("Red")) {
                    pricePerStack = 13;
                } else if (color.equals("Green")) {
                    pricePerStack = 9;
                } else {
                    pricePerStack = 7;
                }
                break;
            case "Small":
                if (color.equals("Red")) {
                    pricePerStack = 9;
                } else if (color.equals("Green")) {
                    pricePerStack = 8;
                } else {
                    pricePerStack = 5;
                }
                break;
        }
        double totalPrice = pricePerStack * eggsStack * 0.65;
        System.out.printf("%.2f leva.",totalPrice);
    }
}
