package JavaProgramingOOP.WorkingWithAbstraction.Lab.P04HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputLine = scanner.nextLine().split(" ");

        double pricePerDay = Double.parseDouble(inputLine[0]);
        int numbersOfDays = Integer.parseInt(inputLine[1]);
        Season season = Season.valueOf(inputLine[2].toUpperCase());
        Discount discount = Discount.valueOf(inputLine[3].toUpperCase());

        double tripPrice = PriceCalculator.calculateHolidayPrice(pricePerDay, numbersOfDays, season, discount);

        System.out.printf("%.2f",tripPrice);

    }
}
