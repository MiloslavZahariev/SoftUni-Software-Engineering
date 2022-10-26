package JavaProgramingAdvanced.OldExams;

import java.util.Scanner;

public class ThroneConquering {

    public static int parisRow = 0;
    public static int parisCol = 0;
    public static int energy;

    public static int helenRow = 0;
    public static int helenCol = 0;
    public static boolean findHelen = false;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        energy = Integer.parseInt(scanner.nextLine());
        int rows = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[rows][];

        for (int r = 0; r < rows; r++) {
            field[r] = scanner.nextLine().toCharArray();
        }

        findingCoordinates(field);

        while (energy > 0) {
            String[] commandLine = scanner.nextLine().split(" ");
            String command = commandLine[0];
            int spartanRow = Integer.parseInt(commandLine[1]);
            int spartanCol = Integer.parseInt(commandLine[2]);
            field[spartanRow][spartanCol] = 'S';

            switch (command) {
                case "up":
                    movingPlayer(field, -1, 0);
                    break;
                case "down":
                    movingPlayer(field, +1, 0);
                    break;
                case "left":
                    movingPlayer(field, 0, -1);
                    break;
                case "right":
                    movingPlayer(field, 0, +1);
                    break;
            }

            if(findHelen){
                System.out.printf("Paris has successfully abducted Helen! Energy left: %d%n",energy);
                break;
            }


        }

        if (energy <= 0 && !findHelen) {
            field[parisRow][parisCol] = 'X';
            System.out.printf("Paris died at %d;%d.%n", parisRow, parisCol);
        }

        for (int r = 0; r < field.length; r++) {
            for (int c = 0; c < field[r].length; c++) {
                System.out.print(field[r][c]);
            }
            System.out.println();
        }

    }

    private static void movingPlayer(char[][] field, int rowMutator, int colMutator) {
        int nextRow = parisRow + rowMutator;
        int nextCol = parisCol + colMutator;

        if (isOutOfBout(field, nextRow, nextCol)) {
            energy--;
            return;
        }

        if (field[nextRow][nextCol] == 'S') {
            energy -= 3;
            field[parisRow][parisCol] = '-';
            parisRow = nextRow;
            parisCol = nextCol;
            field[parisRow][parisCol] = 'P';

            return;
        }

        if (field[nextRow][nextCol] == 'H') {
            field[parisRow][parisCol] = '-';
            field[nextRow][nextCol] = '-';
            findHelen = true;
            energy--;
        } else {

            field[parisRow][parisCol] = '-';
            parisRow = nextRow;
            parisCol = nextCol;
            field[parisRow][parisCol] = 'P';
            energy--;
        }


    }

    private static boolean isOutOfBout(char[][] field, int nextRow, int nextCol) {
        return nextRow < 0 || nextRow >= field.length || nextCol < 0 || nextCol >= field[nextRow].length;
    }

    private static void findingCoordinates(char[][] field) {
        for (int r = 0; r < field.length; r++) {
            for (int c = 0; c < field[r].length; c++) {
                if (field[r][c] == 'P') {
                    parisRow = r;
                    parisCol = c;
                }
                if (field[r][c] == 'H') {
                    helenRow = r;
                    helenCol = c;
                }
            }
        }
    }
}
