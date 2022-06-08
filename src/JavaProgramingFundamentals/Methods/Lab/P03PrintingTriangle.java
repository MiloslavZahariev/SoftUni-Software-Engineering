package JavaProgramingFundamentals.Methods.Lab;

import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printTriangle(number);
    }

    public static void printTriangle(int n){

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
