package JavaProgramingAdvanced.MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class P12TheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixSize = scanner.nextLine().split(" ");

        int matrixRow = Integer.parseInt(matrixSize[0]);
        int matrixCol = Integer.parseInt(matrixSize[1]);

        char[][] matrix = new char[matrixRow][matrixCol];
        for (int i = 0; i < matrix.length; i++) {
            String input = scanner.nextLine().replace(" ", "");
            matrix[i] = input.toCharArray();
        }

        char newSymbol = scanner.nextLine().charAt(0);
        String coordinates = scanner.nextLine();
        int r = Integer.parseInt(coordinates.split(" ")[0]);
        int c = Integer.parseInt(coordinates.split(" ")[1]);
        char oldSymbol = matrix[r][c];

        fill(matrix, r, c, newSymbol, oldSymbol);


        printMatrix(matrix);


    }

    private static void printMatrix(char[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }

    private static void fill(char[][] matrix, int r, int c, char newSymbol, char oldSymbol) {
        if (!isValidIndex(r,c,oldSymbol,matrix)) {
            return;
        }
        matrix[r][c] = newSymbol;
            fill(matrix, r - 1, c, newSymbol, oldSymbol);
            fill(matrix, r + 1, c, newSymbol, oldSymbol);
            fill(matrix, r, c - 1, newSymbol, oldSymbol);
            fill(matrix, r, c + 1, newSymbol, oldSymbol);

    }

    private static boolean isValidIndex(int r, int c, char oldSymbol, char[][] matrix) {
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length && matrix[r][c] == oldSymbol;
    }


}

