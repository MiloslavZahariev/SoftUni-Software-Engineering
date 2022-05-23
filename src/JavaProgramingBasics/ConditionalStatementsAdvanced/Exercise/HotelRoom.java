package JavaProgramingBasics.ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;

        switch (month) {
            case "May":
            case "October":
                if (nights > 7 && nights <= 14) {
                    studioPrice = (50 * nights) * 0.95;
                    apartmentPrice = 65 * nights;
                } else if (nights > 14) {
                    studioPrice = (50 * nights) * 0.70;
                    apartmentPrice = (65 * nights) * 0.9;
                } else {
                    studioPrice = 50 * nights;
                    apartmentPrice = 65 * nights;
                }
                break;
            case "June":
            case "September":
                if (nights > 14) {
                    studioPrice = (75.2 * nights) * 0.8;
                    apartmentPrice = (68.7 * nights) * 0.9;
                } else {
                    studioPrice = 75.2 * nights;
                    apartmentPrice = 68.7 * nights;
                }
                break;
            case "July":
            case "August":
                if (nights > 14) {
                    studioPrice = 76 * nights;
                    apartmentPrice = (77 * nights) * 0.9;
                } else {
                    studioPrice = 76 * nights;
                    apartmentPrice = 77 * nights;
                }
                break;
        }

        System.out.printf("Apartment: %.2f lv.", apartmentPrice);
        System.out.println();
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}
