package JavaProgramingBasics.OldExams.Exam28March2020;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double oldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());

        double slowing = (Math.floor(distance / 50)) * 30 ;
        double time = (distance * timePerMeter) + slowing;

        if (time < oldRecord){
            System.out.printf("Yes! The new record is %.2f seconds.",time);
        }else {
            System.out.printf("No! He was %.2f seconds slower.",time - oldRecord);
        }

    }
}
