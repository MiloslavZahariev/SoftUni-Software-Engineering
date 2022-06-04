package JavaProgramingFundamentals.Arrays.Exercise;

import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[num];
        int[] secondArr = new int[num];

        for (int row = 1; row <= num; row++) {
            String numbers = scanner.nextLine();
            int firstNumber = Integer.parseInt(numbers.split(" ")[0]);
            int secondNumber = Integer.parseInt(numbers.split(" ")[1]);

            if (row % 2 == 0) {
                firstArr[row - 1] = secondNumber;
                secondArr[row - 1] = firstNumber;
            } else {
                firstArr[row - 1] = firstNumber;
                secondArr[row - 1] = secondNumber;
            }
        }

        for (int number : firstArr) {
            System.out.print(number + " ");

        }

        System.out.println();
        for (int number : secondArr) {
            System.out.print(number + " ");

        }
    }
}
