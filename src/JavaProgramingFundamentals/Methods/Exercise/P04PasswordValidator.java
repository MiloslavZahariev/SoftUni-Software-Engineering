package JavaProgramingFundamentals.Methods.Exercise;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String passwordInput = scanner.nextLine();

        if (!isValidLength(passwordInput)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isValidContent(passwordInput)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isValidCountDigits(passwordInput)) {
            System.out.println("Password must have at least 2 digits");
        }

        if (isValidCountDigits(passwordInput) && isValidContent(passwordInput) && isValidLength(passwordInput)) {
            System.out.println("Password is valid");
        }

    }

    private static boolean isValidLength(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    private static boolean isValidContent(String password) {
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidCountDigits(String password) {
        int countDigits = 0;
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                countDigits++;
            }
        }
        return countDigits >= 2;
    }
}
