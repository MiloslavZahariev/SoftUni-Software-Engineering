package JavaProgramingFundamentals.Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumberInput = Double.parseDouble(scanner.nextLine());
        String operatorInput = scanner.nextLine();
        double secondNumberInput = Double.parseDouble(scanner.nextLine());

        double result = calculate(firstNumberInput, operatorInput, secondNumberInput);

        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));


    }

    public static double calculate(double firstNum, String operator, double secNum) {

        double result = 0;
        switch (operator) {
            case "+":
                result = firstNum + secNum;
                break;
            case "-":
                result = firstNum - secNum;
                break;
            case "*":
                result = firstNum * secNum;
                break;
            case "/":
                result = firstNum / secNum;
                break;
        }
        return result;
    }
}
