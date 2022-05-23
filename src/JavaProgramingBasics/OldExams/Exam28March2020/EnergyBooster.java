package JavaProgramingBasics.OldExams.Exam28March2020;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        int packageSize = 0;
        double watermelonPrice = 0.0;
        double mangoPrice = 0.0;
        double pineapplePrice = 0.0;
        double raspberryPrice = 0.0;

        double price = 0.0;

        switch (size) {
            case "small":
                packageSize = 2;
                watermelonPrice = 56;
                mangoPrice = 36.66;
                pineapplePrice = 42.10;
                raspberryPrice = 20.0;
                break;
            case "big":
                packageSize = 5;
                watermelonPrice = 28.7;
                mangoPrice = 19.6;
                pineapplePrice = 24.8;
                raspberryPrice = 15.2;
                break;
        }
        switch (fruit) {
            case "Watermelon":
                price = watermelonPrice * packageSize * count;
                break;
            case "Mango":
                price = mangoPrice * packageSize * count;
                break;
            case "Pineapple":
                price = pineapplePrice * packageSize * count;
                break;
            case "Raspberry":
                price = raspberryPrice * packageSize * count;
                break;
        }

        if (price>= 400 && price <= 1000) {
            price = price * 0.85;
        } else if (price > 1000) {
            price = price * 0.5;
        }

        System.out.printf("%.2f lv.", price);

    }
}

