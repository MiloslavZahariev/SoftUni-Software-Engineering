package JavaProgramingFundamentals.BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            char currentSymbol = username.charAt(i);
            password += currentSymbol;
        }

        String tryPassword = scanner.nextLine();
        int counter = 0;
        boolean flag = false;
        while (!password.equals(tryPassword)) {
            counter++;
            if (counter == 4) {
                flag = true;
                break;
            }
            System.out.println("Incorrect password. Try again.");
            tryPassword = scanner.nextLine();
        }

        if (!flag) {
            System.out.printf("User %s logged in.", username);
        } else {
            System.out.printf("User %s blocked!", username);
        }
    }
}
