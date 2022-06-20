package JavaProgramingFundamentals.OldExams;

import java.util.Scanner;

public class P01SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int firstEmployerEfficiency = Integer.parseInt(scanner.nextLine());
        int secondEmployerEfficiency = Integer.parseInt(scanner.nextLine());
        int thirdEmployerEfficiency = Integer.parseInt(scanner.nextLine());

        int studentCount = Integer.parseInt(scanner.nextLine());

        int hours = 0;

        while (studentCount > 0) {

            if (hours % 4 != 0) {
                studentCount -= firstEmployerEfficiency;
                studentCount -= secondEmployerEfficiency;
                studentCount -= thirdEmployerEfficiency;
            }
            hours++;
        }
        if (hours != 0) {
            System.out.printf("Time needed: %dh.", hours - 1);
        }else {
            System.out.print("Time needed: 0h.");
        }
    }
}
