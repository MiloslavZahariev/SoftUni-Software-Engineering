package JavaProgramingBasics.ForLoop.MoreExercises;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());
        int top = 0;
        int under5 = 0;
        int under4 = 0;
        int under3 = 0;
        double totalGrade = 0.0;

        for (int i = 0; i < studentsCount; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
                totalGrade += grade;
            if (grade < 3) {
                under3++;
            } else if (grade < 4) {
                under4++;
            } else if (grade < 5) {
                under5++;
            } else {
                top++;
            }
        }

        System.out.printf("Top students: %.2f%%%n",top*100.0 / studentsCount);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",under5*100.0 / studentsCount);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",under4*100.0 / studentsCount);
        System.out.printf("Fail: %.2f%%%n",under3*100.0 / studentsCount);
        System.out.printf("Average: %.2f",totalGrade / studentsCount);

    }
}
