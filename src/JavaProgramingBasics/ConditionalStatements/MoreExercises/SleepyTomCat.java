package JavaProgramingBasics.ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int freeDays = Integer.parseInt(scanner.nextLine());
        int daysOfYear = 365;
        int tomNeededMinutes = 30000;
        int freeDaysPlay = 127;
        int workDaysPlay = 63;

        int workDays = daysOfYear - freeDays ;
        int totalFreeMinutesPlay = freeDays * freeDaysPlay;
        int totalWorkMinutesPlay = workDays * workDaysPlay;
        int diff = Math.abs(tomNeededMinutes - (totalFreeMinutesPlay + totalWorkMinutesPlay));
        int hours = diff / 60;
        int minutes = diff % 60;

            if(tomNeededMinutes > (totalFreeMinutesPlay + totalWorkMinutesPlay)) {
                System.out.printf("Tom sleeps well%n%d hours and %d minutes less for play",hours ,  minutes);
            }else {
                System.out.printf("Tom will run away %n%d hours and %d minutes more for play",hours , minutes);
            }


    }
}
