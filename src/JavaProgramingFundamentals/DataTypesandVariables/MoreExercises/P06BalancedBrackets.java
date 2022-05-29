package JavaProgramingFundamentals.DataTypesandVariables.MoreExercises;

import java.util.Scanner;

public class P06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte interval = Byte.parseByte(scanner.nextLine());

        boolean flag1 = false;
        boolean flag2 = false;

        for (int i = 0; i < interval; i++) {
            String text = scanner.nextLine();
            for (int j = 0; j <= text.length() - 1; j++) {
                char symbol = text.charAt(j);

                if (symbol == '(' && !flag1) {
                    flag1 = true;
                } else if (symbol == ')' && flag1) {
                    flag1 = false;
                } else if (symbol == ')') {
                    flag1 = true;
                    flag2 = true;
                    break;
                } else if (symbol == '(') {
                    flag2 = true;
                    break;
                }
            }
            if (flag2) {
                break;
            }
        }
        if (flag1) {
            System.out.println("UNBALANCED");
        } else {
            System.out.println("BALANCED");
        }

    }
}
