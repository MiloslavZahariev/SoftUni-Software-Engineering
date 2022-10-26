package JavaProgramingAdvanced.OldExams;

import java.util.Scanner;

public class StickyFingers {
    public static int thiefRow = 0;
    public static int thiefCol = 0;
    public static int stolenMoney = 0;
    public static boolean isCaught = false;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(",");

        char[][] field = new char[matrixSize][matrixSize];

        for (int i = 0; i < field.length; i++) {
            String input = scanner.nextLine().replace(" ", "");
            field[i] = input.toCharArray();
        }
        findingCoordinates(field);

        for (int i = 0; i < commands.length; i++) {
            String command = commands[i];

            switch (command) {
                case "up":
                    movingThief(field, -1, 0);
                    break;
                case "down":
                    movingThief(field, +1, 0);
                    break;
                case "left":
                    movingThief(field, 0, -1);
                    break;
                case "right":
                    movingThief(field, 0, +1);
                    break;
            }

            if(isCaught){
                System.out.printf("You got caught with %d$, and you are going to jail.%n",stolenMoney);
                break;
            }

        }

        if(!isCaught){
            System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n",stolenMoney);
        }

        printingField(field);
    }

    private static void printingField(char[][] field) {
        for (int r = 0; r < field.length; r++) {
            for (int c = 0; c < field[r].length; c++) {
                System.out.print(field[r][c] + " ");
            }
            System.out.println();
        }
    }

    private static void movingThief(char[][] field, int rowMutator, int colMutator) {
        int nextRow = thiefRow + rowMutator;
        int nextCol = thiefCol + colMutator;

        if (isPossibleStep(field, nextRow, nextCol)) {
            if(field[nextRow][nextCol] == 'P'){
                isCaught = true;
                field[nextRow][nextCol] = '#';
                field[thiefRow][thiefCol] = '+';
                return;
            }else if(field[nextRow][nextCol] == '$'){
                stolenMoney += nextRow * nextCol;
                System.out.printf("You successfully stole %d$.%n",nextRow * nextCol);
            }
            field[nextRow][nextCol] = 'D';
            field[thiefRow][thiefCol] = '+';
            thiefRow += rowMutator;
            thiefCol += colMutator;
        }else {
            System.out.println("You cannot leave the town, there is police outside!");
        }

    }

    private static boolean isPossibleStep(char[][] field, int nextRow, int nextCol) {
        return nextRow >= 0 && nextRow < field.length && nextCol >= 0 && nextCol < field[nextRow].length;

    }

    private static void findingCoordinates(char[][] field) {
        for (int r = 0; r < field.length; r++) {
            for (int c = 0; c < field[r].length; c++) {
                if (field[r][c] == 'D') {
                    thiefRow = r;
                    thiefCol = c;
                }
            }
        }
    }
}
