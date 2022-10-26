package Demo.OldExams;

import java.util.Scanner;

public class MouseAndCheese {

    public static int mouseRow;
    public static int mouseCol;
    public static int cheeseEaten;
    public static boolean mouseDisappear = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int matrixSize = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[matrixSize][matrixSize];

        for (int r = 0; r < field.length; r++) {
            char[] rowInput = scanner.nextLine().toCharArray();
            for (int c = 0; c < field[r].length; c++) {
                field[r][c] = rowInput[c];
                if (field[r][c] == 'M') {
                    mouseRow = r;
                    mouseCol = c;
                }
            }
        }


        String command = scanner.nextLine();
        while (!command.equals("end")) {
            switch (command) {
                case "up":
                    movingMouse(field, -1, 0);
                    break;
                case "down":
                    movingMouse(field, +1, 0);
                    break;
                case "left":
                    movingMouse(field, 0, -1);
                    break;
                case "right":
                    movingMouse(field, 0, +1);
                    break;
            }

            if (mouseDisappear) {
                break;
            }

            command = scanner.nextLine();
        }

        if (mouseDisappear) {
            System.out.println("Where is the mouse?");
        }

        if (cheeseEaten < 5) {
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.%n", 5 - cheeseEaten);
        } else {
            System.out.printf("Great job, the mouse is fed %d cheeses!%n", cheeseEaten);
        }

        printField(field);
    }

    private static void printField(char[][] field) {
        for (int r = 0; r < field.length; r++) {
            for (int c = 0; c < field[r].length; c++) {
                System.out.print(field[r][c]);
            }
            System.out.println();
        }
    }

    private static void movingMouse(char[][] field, int rowMutator, int colMutator) {
        int nextRow = mouseRow + rowMutator;
        int nextCol = mouseCol + colMutator;

        if (isOutOfBound(field, nextRow, nextCol)) {
            field[mouseRow][mouseCol] = '-';
            mouseDisappear = true;
            return;
        }

        if (field[nextRow][nextCol] == 'c') {
            cheeseEaten += 1;
            field[mouseRow][mouseCol] = '-';
            mouseRow = nextRow;
            mouseCol = nextCol;
            field[mouseRow][mouseCol] = 'M';
        } else if (field[nextRow][nextCol] == 'B') {
            field[mouseRow][mouseCol] = '-';
            mouseRow = nextRow;
            mouseCol = nextCol;
            movingMouse(field, rowMutator, colMutator);
        } else {
            field[mouseRow][mouseCol] = '-';
            mouseRow = nextRow;
            mouseCol = nextCol;
            field[mouseRow][mouseCol] = 'M';
        }

    }

    private static boolean isOutOfBound(char[][] field, int mouseRow, int mouseCol) {
        return mouseRow < 0 || mouseRow >= field.length || mouseCol < 0 || mouseCol >= field[mouseRow].length;
    }
}
