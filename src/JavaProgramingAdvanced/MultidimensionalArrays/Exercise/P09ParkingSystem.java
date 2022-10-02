package JavaProgramingAdvanced.MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class P09ParkingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixSize = scanner.nextLine().split(" ");

        int matrixRow = Integer.parseInt(matrixSize[0]);
        int matrixCol = Integer.parseInt(matrixSize[1]);

        boolean[][] parking = new boolean[matrixRow][matrixCol];

        String input = scanner.nextLine();

        while (!input.equals("stop")) {
            int entryRow = Integer.parseInt(input.split(" ")[0]);
            int targetRow = Integer.parseInt(input.split(" ")[1]);
            int targetCol = Integer.parseInt(input.split(" ")[2]);

            if (!parking[targetRow][targetCol]) {
                parking[targetRow][targetCol] = true;
                printingDistance(entryRow, targetRow, targetCol);

            } else if (isRowFull(parking, targetRow)) {
                System.out.printf("Row %d full%n", targetRow);

            } else {
                for (int i = 1; i < parking[targetRow].length; i++) {
                    if (isValidIndex(parking[targetRow].length, targetCol - i)
                            && !parking[targetRow][targetCol - i]) {
                        targetCol -= i;
                        break;
                    } else if (isValidIndex(parking[targetRow].length, targetCol + i)
                            && !parking[targetRow][targetCol + i]) {
                        targetCol += i;
                        break;
                    }
                }
                parking[targetRow][targetCol] = true;
                printingDistance(entryRow, targetRow, targetCol);
            }


            input = scanner.nextLine();
        }
        System.out.println();

    }

    private static void printingDistance(int entryRow, int targetRow, int targetCol) {
        int distanceRow = Math.abs(targetRow - entryRow);
        System.out.println(distanceRow + targetCol + 1);

    }

    private static boolean isValidIndex(int length, int col) {
        return col >= 1 && col < length;
    }

    private static boolean isRowFull(boolean[][] parking, int targetRow) {
        boolean isFull = false;
        int countBusySpaces = 0;
        for (int i = 0; i < parking[targetRow].length; i++) {
            if (parking[targetRow][i]) {
                countBusySpaces++;
            }
        }
        return parking[targetRow].length - 1 == countBusySpaces;
    }
}
