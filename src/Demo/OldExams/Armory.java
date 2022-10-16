package Demo.OldExams;

import java.util.Scanner;

public class Armory {
    public static int officerRow = 0;
    public static int officerCol = 0;
//    public static int teleportRow = 0;
//    public static int teleportCol = 0;
    public static int collectSwords = 0;
    public static boolean isOutOfArmory = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());


        char[][] armory = new char[matrixSize][matrixSize];

        for (int i = 0; i < armory.length; i++) {
            String input = scanner.nextLine().replace(" ", "");
            armory[i] = input.toCharArray();
        }
        findingCoordinates(armory);
        String command = scanner.nextLine();

        while (true) {

            switch (command) {
                case "up":
                    movingOfficer(armory, -1, 0);
                    break;
                case "down":
                    movingOfficer(armory, +1, 0);
                    break;
                case "left":
                    movingOfficer(armory, 0, -1);
                    break;
                case "right":
                    movingOfficer(armory, 0, +1);
                    break;
            }
            if (isOutOfArmory || collectSwords>= 65) {
                break;
            }
            command = scanner.nextLine();
        }

        if(isOutOfArmory){
            System.out.println("I do not need more swords!");
        }else {
            System.out.println("Very nice swords, I will come back for more!");
        }
        System.out.printf("The king paid %d gold coins.%n",collectSwords);

        printingField(armory);
    }

    private static void printingField(char[][] field) {
        for (int r = 0; r < field.length; r++) {
            for (int c = 0; c < field[r].length; c++) {
                System.out.print(field[r][c]);
            }
            System.out.println();
        }
    }

    private static void movingOfficer(char[][] map, int rowMutator, int colMutator) {
        int nextRow = officerRow + rowMutator;
        int nextCol = officerCol + colMutator;

        if (isPossibleStep(map, nextRow, nextCol)) {
            if (map[nextRow][nextCol] == 'M') {
                map[nextRow][nextCol] = '-';
                map[officerRow][officerCol] = '-';
                teleportingOfficer(map,nextRow,nextCol);
                map[officerRow][officerCol] = 'A';
                return;
            } else if (map[nextRow][nextCol] != '-') {
                collectSwords += map[nextRow][nextCol] - 48;
                map[nextRow][nextCol] = 'A';
            }
            map[officerRow][officerCol] = '-';
            officerRow += rowMutator;
            officerCol += colMutator;

        } else {
            map[officerRow][officerCol] = '-';
            isOutOfArmory = true;
        }

    }

    private static void teleportingOfficer(char[][] map, int nextRow, int nextCol) {
        for (int r = 0; r < map.length; r++) {
            for (int c = 0; c < map[r].length; c++) {
                if (map[r][c] == 'M' && r != nextRow && c != nextCol) {
                    officerRow = r;
                    officerCol = c;
                }
            }
        }

    }

    private static boolean isPossibleStep(char[][] map, int nextRow, int nextCol) {
        return nextRow >= 0 && nextRow < map.length && nextCol >= 0
                && nextCol < map[nextRow].length;
    }

    private static void findingCoordinates(char[][] field) {
        for (int r = 0; r < field.length; r++) {
            for (int c = 0; c < field[r].length; c++) {
                if (field[r][c] == 'A') {
                    officerRow = r;
                    officerCol = c;
                }
            }
        }
    }
}
