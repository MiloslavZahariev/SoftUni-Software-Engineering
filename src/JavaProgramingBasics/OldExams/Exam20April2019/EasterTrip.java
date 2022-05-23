package JavaProgramingBasics.OldExams.Exam20April2019;

import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = 0;

        switch (destination) {

            case "France":
                if (dates.equals("21-23")) {
                    pricePerNight = 30;
                } else if (dates.equals("24-27")) {
                    pricePerNight = 35;
                } else {
                    pricePerNight = 40;
                }
                break;
            case "Italy":
                if (dates.equals("21-23")) {
                    pricePerNight = 28;
                } else if (dates.equals("24-27")) {
                    pricePerNight = 32;
                } else {
                    pricePerNight = 39;
                }
                break;
            case "Germany":
                if (dates.equals("21-23")) {
                    pricePerNight = 32;
                } else if (dates.equals("24-27")) {
                    pricePerNight = 37;
                } else {
                    pricePerNight = 43;
                }
                break;

        }
        double totalPrice = pricePerNight * nights;

        System.out.printf("Easter trip to %s : %.2f leva.",destination,totalPrice);
    }
}
