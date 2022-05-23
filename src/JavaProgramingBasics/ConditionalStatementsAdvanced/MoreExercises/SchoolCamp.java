package JavaProgramingBasics.ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double discount = 1;
        double pricePerStudent = 0.0;
        double totalPrice = 0.0;
        String sport = "";

        if (studentsCount >= 10 && studentsCount < 20) {
            discount = 0.95;
        } else if (studentsCount >= 20 && studentsCount < 50) {
            discount = 0.85;
        } else if (studentsCount >= 50) {
            discount = 0.5;
        }

        if (season.equals("Winter") && group.equals("girls")) {
            pricePerStudent = 9.6;
            sport = "Gymnastics";
        } else if (season.equals("Winter") && group.equals("boys")) {
            pricePerStudent = 9.6;
            sport = "Judo";
        } else if (season.equals("Winter") && group.equals("mixed")) {
            pricePerStudent = 10;
            sport = "Ski";
        } else if (season.equals("Spring") && group.equals("girls")) {
            pricePerStudent = 7.2;
            sport = "Athletics";
        } else if (season.equals("Spring") && group.equals("boys")) {
            pricePerStudent = 7.2;
            sport = "Tennis";
        } else if (season.equals("Spring") && group.equals("mixed")) {
            pricePerStudent = 9.5;
            sport = "Cycling";
        } else if (season.equals("Summer") && group.equals("girls")) {
            pricePerStudent = 15;
            sport = "Volleyball";
        } else if (season.equals("Summer") && group.equals("boys")) {
            pricePerStudent = 15;
            sport = "Football";
        } else if (season.equals("Summer") && group.equals("mixed")) {
            pricePerStudent = 20;
            sport = "Swimming";
        }
        totalPrice = nights * studentsCount * discount * pricePerStudent;
        System.out.printf("%s %.2f lv.",sport,totalPrice);

    }
}
