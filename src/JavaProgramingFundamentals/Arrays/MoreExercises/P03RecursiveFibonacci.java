package JavaProgramingFundamentals.Arrays.MoreExercises;

import java.util.Scanner;

public class P03RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int position = Integer.parseInt(scanner.nextLine());
        int[] fibonacciArr = new int[position];
        fibonacciArr[0] = 1;
        if (position > 1) {
            fibonacciArr[1] = 1;
        }
        for (int i = 2; i < position; i++) {
            fibonacciArr[i] = fibonacciArr[i - 1] + fibonacciArr[i - 2];
        }
        System.out.println(fibonacciArr[position - 1]);
    }
}
