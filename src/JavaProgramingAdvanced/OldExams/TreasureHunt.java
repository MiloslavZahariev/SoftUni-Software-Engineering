package JavaProgramingAdvanced.OldExams;

import java.util.Scanner;

public class TreasureHunt {
    public static int playerRow = 0;
    public static int playerCol = 0;
    public static int treasureRow = 0;
    public static int treasureCol = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] matrixSize = scanner.nextLine().split(" ");

        int matrixRow = Integer.parseInt(matrixSize[0]);
        int matrixCol = Integer.parseInt(matrixSize[1]);

        char[][] map = new char[matrixRow][matrixCol];

        for (int i = 0; i < map.length; i++) {
            String input = scanner.nextLine().replace(" ", "");
            map[i] = input.toCharArray();
        }

        findingCoordinates(map);

        String command = scanner.nextLine();
        StringBuilder sb = new StringBuilder("The right path is ");

        while (!command.equals("Finish")) {
            switch (command) {
                case "up":
                    movingPlayer(command,sb, map, -1, 0);
                    break;
                case "down":
                    movingPlayer(command,sb,map, +1, 0);
                    break;
                case "left":
                    movingPlayer(command,sb,map, 0, -1);
                    break;
                case "right":
                    movingPlayer(command,sb,map, 0, +1);
                    break;
            }

            command = scanner.nextLine();
        }
        if (playerRow == treasureRow && playerCol == treasureCol) {
            System.out.println("I've found the treasure!");
            System.out.println(sb.delete(sb.length() - 2,sb.length()));
        } else {
            System.out.println("The map is fake!");
        }

    }

    private static void movingPlayer(String command,StringBuilder sb,char[][] map, int rowMutator, int colMutator) {
        int nextRow = playerRow + rowMutator;
        int nextCol = playerCol + colMutator;

        if (isPossibleStep(map, nextRow, nextCol)) {
            sb.append(command).append(", ");
            playerRow += rowMutator;
            playerCol += colMutator;
        }

    }

    private static boolean isPossibleStep(char[][] map, int nextRow, int nextCol) {
        return nextRow >= 0 && nextRow < map.length && nextCol >= 0
                && nextCol < map[nextRow].length && map[nextRow][nextCol] != 'T';

    }

    private static void findingCoordinates(char[][] map) {
        for (int r = 0; r < map.length; r++) {
            for (int c = 0; c < map[r].length; c++) {
                if (map[r][c] == 'Y') {
                    playerRow = r;
                    playerCol = c;
                }
                if (map[r][c] == 'X') {
                    treasureRow = r;
                    treasureCol = c;
                }
            }
        }
    }
}
