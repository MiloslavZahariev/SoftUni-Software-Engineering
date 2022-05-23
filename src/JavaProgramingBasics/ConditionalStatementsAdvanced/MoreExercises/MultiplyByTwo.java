package JavaProgramingBasics.ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class MultiplyByTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double i = Double.parseDouble(scanner.nextLine());

        while (i>=0) {
            System.out.printf("Result: %.2f%n",i*2);
            i = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("Negative number!");
    }
}
