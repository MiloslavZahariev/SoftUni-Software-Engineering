package JavaProgramingFundamentals.OldExams;

import java.util.Scanner;

public class P01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int numberOfLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        double maxBonus = 0;
        int bestAttendance = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            int attendance = Integer.parseInt(scanner.nextLine());
            double totalBonus = (1.0 * attendance / numberOfLectures) * (5.0 + additionalBonus);

            if (maxBonus < totalBonus){
                maxBonus = totalBonus;
                bestAttendance = attendance;
            }

        }

        System.out.printf("Max Bonus: %.0f.%n",Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.",bestAttendance);
    }
}
