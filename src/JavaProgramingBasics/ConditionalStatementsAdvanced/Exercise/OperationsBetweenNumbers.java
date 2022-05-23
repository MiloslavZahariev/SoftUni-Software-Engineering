package JavaProgramingBasics.ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number1 = Double.parseDouble(scanner.nextLine());
        double number2 = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();

        double result = 0;

        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.printf("Cannot divide %.0f by zero", number1);
                }
                break;
            case "%":
                if (number2 != 0) {
                    result = number1 % number2;
                } else {
                    System.out.printf("Cannot divide %.0f by zero", number1);
                }
                break;
        }
        if (operator.equals("/") && number2 != 0) {
            System.out.printf("%.0f %s %.0f = %.2f", number1, operator, number2, result);
        } else if (operator.equals("%") && number2 != 0 ) {
            System.out.printf("%.0f %s %.0f = %.0f", number1, operator, number2, result);
        } else if (result % 2 == 0 && number2 != 0 ) {
            System.out.printf("%.0f %s %.0f = %.0f - even", number1, operator, number2, result);
        } else if (number2 != 0) {
            System.out.printf("%.0f %s %.0f = %.0f - odd", number1, operator, number2, result);
        }
    }
}
