package JavaProgramingBasics.FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pageNumbers = Integer.parseInt(scanner.nextLine());
        int pagesPerHours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int timesForRead = pageNumbers / pagesPerHours;
        int neededHoursPerDay = timesForRead / days ;

        System.out.println(neededHoursPerDay);

    }
}
