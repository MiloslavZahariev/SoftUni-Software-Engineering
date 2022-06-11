package JavaProgramingFundamentals.Methods.Exercise;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String inputNumber = scanner.nextLine();

        while (!inputNumber.equals("END")) {
            if (inputNumber.equals(getReverseInput(inputNumber))) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            inputNumber = scanner.nextLine();
        }

    }

    private static String getReverseInput(String input) {
        String reverseInput = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reverseInput += input.charAt(i);
        }
        return reverseInput;
    }
}
