package JavaProgramingAdvanced.MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int matrixSize = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[matrixSize][matrixSize];

        for (int row = 0; row < matrixSize; row++) {
            int[] rowInput = Arrays.stream(scanner.nextLine()
                            .split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[row] = rowInput;
        }

        int mainDiagonal = 0;

        for (int i = 0; i < matrixSize; i++) {
            mainDiagonal += matrix[i][i];
        }

        int secDiagonal = 0;

        for (int row = matrixSize - 1, col = 0; row >= 0; row--, col++) {
            secDiagonal += matrix[row][col];
        }

        System.out.println(Math.abs(mainDiagonal - secDiagonal));
    }
}
