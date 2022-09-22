package JavaProgramingAdvanced.MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matrixSizes = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String[][] matrix = new String[matrixSizes[0]][matrixSizes[1]];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] commandLine = input.split(" ");
            String command = commandLine[0];

            if (command.equals("swap") && commandLine.length == 5) {
                int row1 = Integer.parseInt(commandLine[1]);
                int col1 = Integer.parseInt(commandLine[2]);
                int row2 = Integer.parseInt(commandLine[3]);
                int col2 = Integer.parseInt(commandLine[4]);

                if (boundRowIndex(row1, matrixSizes) && boundRowIndex(row2,matrixSizes)
                        && boundColIndex(col1,matrixSizes) && boundColIndex(col2,matrixSizes) ) {

                    String stringToReplace = matrix[row1][col1];
                    matrix[row1][col1] = matrix[row2][col2];
                    matrix[row2][col2] = stringToReplace;
                    printingMatrix(matrix);
                }else{
                    System.out.println("Invalid input!");
                }
            }else {
                System.out.println("Invalid input!");
            }


            input = scanner.nextLine();
        }

        System.out.println();
    }

    private static void printingMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean boundRowIndex(int index, int[] matrixSizes) {
        return index >= 0 && index < matrixSizes[0];
    }
    private static boolean boundColIndex(int index, int[] matrixSizes) {
        return index >= 0 && index < matrixSizes[1];
    }
}
