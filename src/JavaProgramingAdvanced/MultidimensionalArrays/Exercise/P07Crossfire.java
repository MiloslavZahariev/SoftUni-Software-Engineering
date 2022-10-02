package JavaProgramingAdvanced.MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class P07Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(" ");

        int row = Integer.parseInt(dimensions[0]);
        int col = Integer.parseInt(dimensions[0]);

        int[][] matrix = new int[row][col];

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = c + 1 + (r * col);
            }
        }

        String input = scanner.nextLine();
        while (!input.equals("Nuke it from orbit")) {
            int rowAttack = Integer.parseInt(input.split(" ")[0]);
            int colAttack = Integer.parseInt(input.split(" ")[1]);
            int radiusAttack = Integer.parseInt(input.split(" ")[2]);

            fillingDestroyedCells(rowAttack, colAttack, radiusAttack, matrix);


            input = scanner.nextLine();
        }

        printingMatrix(matrix);
    }

    private static void printingMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    private static void fillingDestroyedCells(int row, int col, int rad, int[][] matrix) {

        if (row < 0 || row > matrix.length || col < 0 || col > matrix[row].length) {
            return;
        }
        if (matrix[row][col] == 0) {
            return;
        }

        matrix[row][col] = 0;
        for (int r = row; r >= row - rad && r >= 0; r--) {
            matrix[r][col] = 0;
        }

        for (int r = row; r < row + rad && r < matrix.length; r++) {
            matrix[r][col] = 0;
        }

        for (int c = col; c >= col - rad && c >= 0; c--) {
            matrix[row][c] = 0;
        }

        for (int c = col; c < col + rad && c < matrix[row].length; c++) {
            matrix[row][c] = 0;
        }

        for (int r = 0; r < matrix.length; r++) {
            int counter = 0;
            int[] surviveNubs = new int[matrix[r].length];

            int zeroCounter = 0;
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] != 0) {
                    surviveNubs[counter] = matrix[r][c];
                    counter++;
                } else {
                    zeroCounter++;
                }
            }
            if (zeroCounter < matrix[r].length) {
                matrix[r] = surviveNubs;
            } else {
                int[][] tempMatrix = new int[matrix.length - 1][matrix[r].length];
                int k = 0;
                for (int i = 0; i < matrix.length; i++) {
                    if (i != r) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            tempMatrix[k][j] = matrix[i][j];
                        }
                    } else {
                        k--;
                    }
                    k++;
                }
                matrix = new int[tempMatrix.length][tempMatrix[0].length];
                for (int i = 0; i < tempMatrix.length; i++) {
                    for (int j = 0; j < tempMatrix[i].length; j++) {
                        matrix[i][j] = tempMatrix[i][j];
                    }
                }
            }


        }
    }
}