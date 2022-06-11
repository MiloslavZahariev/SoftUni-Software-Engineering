package JavaProgramingFundamentals.Methods.Exercise;

import java.util.Scanner;

public class P07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printMatrix(number);
    }

    private static void printMatrix(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(getCountNumbersOnRow(n));
        }
    }

    private static String getCountNumbersOnRow(int n) {
        String row = "";
        for (int i = 1; i <= n; i++) {
            row += n + " ";
        }
        return row;
    }
}
