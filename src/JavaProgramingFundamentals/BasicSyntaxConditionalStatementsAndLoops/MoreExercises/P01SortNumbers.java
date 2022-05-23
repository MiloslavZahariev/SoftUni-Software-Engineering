package JavaProgramingFundamentals.BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class P01SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 3; i++) {
            if (firstNum > secondNum && firstNum > thirdNum) {
                System.out.println(firstNum);
                firstNum = Integer.MIN_VALUE;
            } else if (secondNum > thirdNum) {
                System.out.println(secondNum);
                secondNum = Integer.MIN_VALUE;

            } else {
                System.out.println(thirdNum);
                thirdNum = Integer.MIN_VALUE;
            }

        }
    }
}
