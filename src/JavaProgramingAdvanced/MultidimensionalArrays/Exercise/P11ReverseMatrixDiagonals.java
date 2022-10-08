package JavaProgramingAdvanced.MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P11ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixSize = scanner.nextLine().split(" ");

        int matrixRow = Integer.parseInt(matrixSize[0]);
        int matrixCol = Integer.parseInt(matrixSize[1]);

        int[][] matrix = new int[matrixRow][matrixCol];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine()
                            .split(" "))
                    .mapToInt(Integer::parseInt).toArray();
        }

        for (int c = matrixCol - 1; c >= -(matrixRow - 1); c--) {
            int nextColl = c;
            for (int r = matrixRow - 1; r >= 0; r--) {
                if (isValidIndex(r, nextColl, matrix)) {
                    System.out.print(matrix[r][nextColl] + " ");
                }
                nextColl++;
            }
            System.out.println();
        }
    }
    private static boolean isValidIndex(int startRow, int startCol, int[][] matrix) {

        return startRow >= 0 && startCol >= 0 && startRow < matrix.length && startCol < matrix[0].length;
    }

}
