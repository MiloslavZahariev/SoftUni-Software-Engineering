package JavaProgramingFundamentals.DataTypesandVariables.Lab;

import java.util.Scanner;

public class P08LowerOrUpper {
    public P08LowerOrUpper() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        if (letter >= 'a' && letter <= 'z') {
            System.out.println("lower-case");
        } else {
            System.out.println("upper-case");
        }

    }
}
