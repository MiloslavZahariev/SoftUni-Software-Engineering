package JavaProgramingBasics.ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededHours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double daysWithoutTraining = days * 0.9;
        double normalWorkingHours = daysWithoutTraining * 8;
        double extraWorkingHours = workers * days * 2;
        double allWorkingHours = Math.floor(normalWorkingHours + extraWorkingHours);
        double diff = Math.abs(neededHours - allWorkingHours);

        if (neededHours <= allWorkingHours) {
            System.out.printf("Yes!%.0f hours left.",Math.floor(diff));
        }else{
            System.out.printf("Not enough time!%.0f hours needed.",Math.floor(diff));
        }

    }
}
