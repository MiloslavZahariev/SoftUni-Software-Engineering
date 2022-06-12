package JavaProgramingFundamentals.Methods.MoreExercises;

import java.util.Scanner;

public class P04TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        if(number == 0){
            System.out.println(0);
            return;
        }
        printTribonacci(number);

    }

    private static int tribonacci(int n) {
        {

            if (n == 0 || n == 1 || n == 2)
                return 0;

            if (n <= 3)
                return 1;
            else
                return tribonacci(n - 1) +
                        tribonacci(n - 2) +
                        tribonacci(n - 3);
        }
    }
    static void printTribonacci(int n)
    {
        for (int i = 3; i < n + 3; i++)
            System.out.print(tribonacci(i)
                    +" ");
    }
}