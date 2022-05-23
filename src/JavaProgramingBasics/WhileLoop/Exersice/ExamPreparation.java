package JavaProgramingBasics.WhileLoop.Exersice;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int notOkGrades = Integer.parseInt(scanner.nextLine());
        int counterProblems = 0;
        int counterAll = 0;
        double averageScore = 0;
        String lastProblem = "";

        while (notOkGrades>counterProblems) {
            String input = scanner.nextLine();
            if (input.equals("Enough")){
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                counterProblems++;

            }
            counterAll++;
            lastProblem = input;
            averageScore += grade;
        }

        if (counterProblems<notOkGrades){
            System.out.printf("Average score: %.2f%n",averageScore/counterAll);
            System.out.printf("Number of problems: %d%n",counterAll);
            System.out.println("Last problem: " + lastProblem);
        }else {
            System.out.printf("You need a break, %d poor grades.",counterProblems);
        }
    }
}
