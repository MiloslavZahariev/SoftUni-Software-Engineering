package JavaProgramingBasics.NestedLoops.Exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int counter = 0;
        double total = 0;

        while (!input.equals("Finish")) {
            double totalGrade = 0;
            for (int i = 0; i < n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                totalGrade += grade;
                counter++;
                total += grade;
            }
            System.out.printf("%s - %.2f.%n", input, totalGrade / n);
            input = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.",total/counter);
    }
}
