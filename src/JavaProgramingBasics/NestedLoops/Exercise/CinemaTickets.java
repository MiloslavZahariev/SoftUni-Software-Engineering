package JavaProgramingBasics.NestedLoops.Exercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String movie = scanner.nextLine();
        int countKid = 0;
        int countStandard = 0;
        int countStudent = 0;
        int counter = 0;

        while (!movie.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            String input = scanner.nextLine();
            int currentCounter = 0;
            while (!input.equals("End")) {
                counter++;
                currentCounter++;
                switch (input) {
                    case "kid":
                        countKid++;
                        break;
                    case "student":
                        countStudent++;
                        break;
                    case "standard":
                        countStandard++;
                        break;
                }
                if (currentCounter == freeSeats) {
                    break;
                }
                input = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.%n", movie, currentCounter * 1.0 / freeSeats * 100);

            movie = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", counter);
        System.out.printf("%.2f%% student tickets.%n", countStudent * 1.0 / counter * 100);
        System.out.printf("%.2f%% standard tickets.%n", countStandard * 1.0 / counter * 100);
        System.out.printf("%.2f%% kids tickets.", countKid * 1.0 / counter * 100);
    }
}
