package JavaProgramingBasics.WhileLoop.MoreExersices;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumbers = Integer.parseInt(scanner.nextLine());
        double sum = 0.0;

        for (int i = 0; i < countNumbers; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
        }
        System.out.printf("%.2f", sum / countNumbers);
    }
}
