package JavaProgramingAdvanced.MultidimensionalArrays.Lab;

import java.util.Scanner;

public class P07FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] chessBoard = new char[8][8];

        for (int r = 0; r < chessBoard.length; r++) {
            String input = scanner.nextLine().replace(" ", "");
            char[] arr = input.toCharArray();
            chessBoard[r] = arr;
        }

        for (int r = 0; r < chessBoard.length; r++) {
            for (int c = 0; c < chessBoard[r].length; c++) {
                if (chessBoard[r][c] == 'q') {
                    if (isRealQueen(chessBoard, r, c)) {
                        System.out.println(r + " " + c);
                    }
                }
            }
        }


        System.out.println();
    }

    private static boolean isRealQueen(char[][] chessBoard, int currentRow, int currentCol) {
        for (int r = 0; r < 8; r++) {
            if (r != currentRow && chessBoard[r][currentCol] == 'q') {
                return false;
            }
        }
        for (int c = 0; c < 8; c++) {
            if (c != currentCol && chessBoard[currentRow][c] == 'q') {
                return false;
            }
        }

        int row = currentRow + 1;
        int col = currentCol + 1;

        while (row < 8 && row >= 0 && col < 8 && col >= 0) {
            if (chessBoard[row][col] == 'q') {
                return false;
            }
            row++;
            col++;
        }

        row = currentRow - 1;
        col = currentCol + 1;

        while (row < 8 && row >= 0 && col < 8 && col >= 0) {
            if (chessBoard[row][col] == 'q') {
                return false;
            }
            row--;
            col++;
        }

        row = currentRow - 1;
        col = currentCol - 1;
        while (row < 8 && row >= 0 && col < 8 && col >= 0) {
            if (chessBoard[row][col] == 'q') {
                return false;
            }
            row--;
            col--;
        }
        row = currentRow + 1;
        col = currentCol - 1;

        while (row < 8 && row >= 0 && col < 8 && col >= 0) {
            if (chessBoard[row][col] == 'q') {
                return false;
            }
            row++;
            col--;
        }




        return true;

    }
}
