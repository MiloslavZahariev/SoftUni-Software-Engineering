package JavaProgramingAdvanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P03IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = new char[rows][cols];
        char[][] secondMatrix = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            String input = scanner.nextLine().replace(" ","");
            char[] arr = input.toCharArray();
            firstMatrix[i] = arr;
        }

        for (int i = 0; i < rows; i++) {
            String input = scanner.nextLine().replace(" ","");
            char[] arr = input.toCharArray();
            secondMatrix[i] = arr;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(firstMatrix[i][j] == secondMatrix[i][j] ? firstMatrix[i][j] + " " : "* ");
            }
            System.out.println();
        }
    }
}