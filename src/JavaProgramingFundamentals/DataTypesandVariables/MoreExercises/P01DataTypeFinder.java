package JavaProgramingFundamentals.DataTypesandVariables.MoreExercises;

import java.util.Scanner;

public class P01DataTypeFinder {
    public P01DataTypeFinder() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            boolean flagForDigit = false;
            int pointCounter = 0;
            boolean minusFlag = false;
            boolean flagForSymbol = false;

            if (input.length() > 1 && input.charAt(0) == '-' && input.charAt(1) == '.') {
                System.out.printf("%s is string type%n", input);
                input = scanner.nextLine();
                continue;
            }

            for (int i = 0; i <= input.length() - 1; ++i) {
                char charTest = input.charAt(i);
                if (charTest == '-' && i != 0 || charTest == '.' && i == 0) {
                    minusFlag = true;
                }

                if (charTest >= '0' && charTest <= '9') {
                    flagForDigit = true;
                } else if (charTest == '.') {
                    ++pointCounter;
                } else if (charTest != '-') {
                    flagForSymbol = true;
                }
            }

            if (!input.equalsIgnoreCase("true") && !input.equalsIgnoreCase("false")) {
                if (flagForDigit && !flagForSymbol && pointCounter == 1 && !minusFlag) {
                    System.out.printf("%s is floating point type%n", input);
                } else if (flagForDigit && !flagForSymbol && pointCounter == 0 && !minusFlag) {
                    System.out.printf("%s is integer type%n", input);
                } else if (input.length() == 1) {
                    System.out.printf("%s is character type%n", input);
                } else {
                    System.out.printf("%s is string type%n", input);
                }
            } else {
                System.out.printf("%s is boolean type%n", input);
            }
            input = scanner.nextLine();
        }

    }
}
