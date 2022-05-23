package JavaProgramingBasics.PbPreExam;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        int counterFail = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        double average = 0.0;

        for (int i = 1; i <= countStudents; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 2 && grade < 3) {
                counterFail++;
                average += grade;
            } else if (grade >= 3 && grade < 4) {
                counter3++;
                average += grade;
            } else if (grade >= 4 && grade < 5) {
                counter4++;
                average += grade;
            } else if (grade >= 5 && grade <= 6) {
                counter5++;
                average += grade;
            }

        }
        System.out.printf("Top students: %.2f%%%n", (1.0 * counter5 / countStudents) * 100.0);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", (1.0 * counter4 / countStudents) * 100.0);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", (1.0 * counter3 / countStudents) * 100.0);
        System.out.printf("Fail: %.2f%%%n", (1.0 * counterFail / countStudents) * 100.0);
        System.out.printf("Average: %.2f", average / countStudents);


    }
}
