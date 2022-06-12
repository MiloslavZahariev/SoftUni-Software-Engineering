package JavaProgramingFundamentals.Methods.MoreExercises;

import java.util.Scanner;

public class P04TrionacciSequenceWitoutRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int position = Integer.parseInt(scanner.nextLine());
        printTribonacci(position);
    }

    private static void printTribonacci(int n) {
        for (int i = 1; i <= n; i++)
            System.out.print(returnNumberOfTribunaci(i)
                    + " ");
    }

    private static int returnNumberOfTribunaci(int n) {

        int[] fibonacciArr = new int[n];
        fibonacciArr[0] = 1;
        if (n > 1) {
            fibonacciArr[1] = 1;
        }
        if (n > 2) {
            fibonacciArr[2] = 2;
        }
        for (int i = 3; i < n; i++) {
            fibonacciArr[i] = fibonacciArr[i - 1] + fibonacciArr[i - 2] + fibonacciArr[i - 3];
        }
        return fibonacciArr[n - 1];
    }


}
