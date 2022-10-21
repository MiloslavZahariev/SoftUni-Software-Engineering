package Demo.OldExams;

import java.util.Scanner;

public class PawnWars {
    public static int whitePownRow;
    public static int whitePownCol;
    public static int blackPownRow;
    public static int blackPownCol;
    public static boolean isEndOfGame = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] chessBoard = new char[8][8];

        for (int r = 0; r < chessBoard.length; r++) {
            char[] inputRow = scanner.nextLine().toCharArray();
            for (int c = 0; c < chessBoard[r].length; c++) {
                chessBoard[r][c] = inputRow[c];
                if (chessBoard[r][c] == 'w') {
                    whitePownRow = r;
                    whitePownCol = c;
                } else if (chessBoard[r][c] == 'b') {
                    blackPownRow = r;
                    blackPownCol = c;
                }
            }
        }

        while (whitePownRow > 0 && blackPownRow < 7) {
            movingPown(chessBoard, 'w');
            if (isEndOfGame) {
                if (extracted(chessBoard))
                    return;

            }

            movingPown(chessBoard, 'b');

            if (isEndOfGame) {
                if (extracted(chessBoard))
                    return;

            }
        }
        if (whitePownRow == 0) {
            System.out.printf("Game over! White pawn is promoted to a queen at %c%d.",whitePownCol + 97, Math.abs(whitePownRow - 8));
        } else if (blackPownRow == 7) {
            System.out.printf("Game over! Black pawn is promoted to a queen at %c%d.",blackPownCol + 97, Math.abs(blackPownRow - 8));
        }

        System.out.println();

    }

    private static boolean extracted(char[][] chessBoard) {
        for (int r = 0; r < chessBoard.length; r++) {
            for (int c = 0; c < chessBoard[r].length; c++) {
                if (chessBoard[r][c] == 'w') {
                    System.out.printf("Game over! White capture on %c%d.", whitePownCol + 97, Math.abs(whitePownRow - 8));
                    return true;
                } else if (chessBoard[r][c] == 'b') {
                    System.out.printf("Game over! Black capture on %c%d.", blackPownCol + 97, Math.abs(blackPownRow - 8));
                    return true;
                }
            }
        }
        return false;
    }

    private static void movingPown(char[][] chessBoard, char color) {
        int pownRow = 0;
        int pownCol = 0;
        int step = 0;
        char otherColor = '-';

        if (color == 'w') {
            pownRow = whitePownRow;
            pownCol = whitePownCol;
            step = -1;
            otherColor = 'b';
        } else if (color == 'b') {
            pownRow = blackPownRow;
            pownCol = blackPownCol;
            step = 1;
            otherColor = 'w';
        }

        if (!isOutOfBound(pownRow + step, pownCol - 1) && chessBoard[pownRow + step][pownCol - 1] == otherColor) {
            chessBoard[pownRow][pownCol] = '-';
            chessBoard[pownRow + step][pownCol - 1] = color;
            pownRow += step;
            pownCol--;
            isEndOfGame = true;
        } else if (!isOutOfBound(pownRow + step, pownCol + 1) && chessBoard[pownRow + step][pownCol + 1] == otherColor) {
            chessBoard[pownRow][pownCol] = '-';
            chessBoard[pownRow + step][pownCol + 1] = color;
            pownRow += step;
            pownCol++;
            isEndOfGame = true;
        } else {
            chessBoard[pownRow][pownCol] = '-';
            chessBoard[pownRow + step][pownCol] = color;
            pownRow += step;
        }

        if (color == 'w') {
            whitePownRow = pownRow;
            whitePownCol = pownCol;
        } else {
            blackPownRow = pownRow;
            blackPownCol = pownCol;
        }
    }

    private static boolean isOutOfBound(int row, int col) {
        return row < 0 || row >= 8 || col < 0 || col >= 8;
    }

}
