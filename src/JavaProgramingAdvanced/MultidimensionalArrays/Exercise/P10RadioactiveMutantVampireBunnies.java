package JavaProgramingAdvanced.MultidimensionalArrays.Exercise;

import java.util.*;

public class P10RadioactiveMutantVampireBunnies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixSize = scanner.nextLine().split(" ");

        int matrixRow = Integer.parseInt(matrixSize[0]);
        int matrixCol = Integer.parseInt(matrixSize[1]);

        char[][] lair = new char[matrixRow][matrixCol];

        for (int i = 0; i < lair.length; i++) {
            String input = scanner.nextLine().replace(" ", "");
            lair[i] = input.toCharArray();
        }

        String commands = scanner.nextLine();
        char[] commandArr = commands.toCharArray();

        boolean isWin = false;
        boolean isDead = false;
        String lastCoordinates = "";

        for (int i = 0; i < commands.length(); i++) {
            char direction = commandArr[i];


            Deque<String> queueOfBunnyCoordinates = new ArrayDeque<>();
            boolean isPlayerMove = false;
            for (int r = 0; r < lair.length; r++) {
                for (int c = 0; c < lair[r].length; c++) {
                    if (lair[r][c] == 'P' && !isPlayerMove) {
                        isPlayerMove = true;
                        if (movingPlayer(lair, direction, r, c)) {
                            lastCoordinates = r + " " + c;
                            isWin = true;
                        }

                    } else if (lair[r][c] == 'B') {
                        getCoordinatesOfNewBunnies(lair, queueOfBunnyCoordinates, r, c);
                    }

                }
            }

            fillNewBunnies(lair, queueOfBunnyCoordinates);
            if (isWin) {
                break;
            }
            isDead = lookingForDeadPlayer(lair);
            if (isDead) {
                break;
            }

        }

        printing(lair, isWin, lastCoordinates);

    }

    private static void printing(char[][] lair, boolean isWin, String lastCoordinates) {
        for (int r = 0; r < lair.length; r++) {
            for (int c = 0; c < lair[r].length; c++) {
                if (lair[r][c] == 'D') {
                    lastCoordinates = r + " " + c;
                    System.out.print('B');
                } else {
                    System.out.print(lair[r][c]);
                }
            }
            System.out.println();
        }
        if (isWin) {
            System.out.println("won: " + lastCoordinates);
        } else {
            System.out.println("dead: " + lastCoordinates);
        }

    }

    private static boolean lookingForDeadPlayer(char[][] lair) {
        for (int r = 0; r < lair.length; r++) {
            for (int c = 0; c < lair[r].length; c++) {
                if (lair[r][c] == 'P') {
                    return false;
                } else if (lair[r][c] == 'D') {
                    return true;
                }
            }
        }
        return true;
    }

    private static boolean movingPlayer(char[][] lair, char direction, int r, int c) {

        switch (direction) {
            case 'U':
                if (isEndOfRows(lair, r - 1)) {
                    lair[r][c] = '.';
                    return true;
                } else {
                    if (lair[r - 1][c] == 'B') {
                        lair[r - 1][c] = 'D';
                    } else {
                        lair[r - 1][c] = 'P';
                    }
                    lair[r][c] = '.';
                }
                break;
            case 'L':
                if (isEndOfCols(lair, c - 1)) {
                    lair[r][c] = '.';
                    return true;
                } else {
                    if (lair[r][c - 1] == 'B') {
                        lair[r][c - 1] = 'D';
                    } else {
                        lair[r][c - 1] = 'P';
                    }
                    lair[r][c] = '.';
                }
                break;
            case 'R':
                if (isEndOfCols(lair, c + 1)) {
                    lair[r][c] = '.';
                    return true;
                } else {
                    if (lair[r][c + 1] == 'B') {
                        lair[r][c + 1] = 'D';
                    } else {
                        lair[r][c + 1] = 'P';
                    }
                    lair[r][c] = '.';
                }
                break;
            case 'D':
                if (isEndOfRows(lair, r + 1)) {
                    lair[r][c] = '.';
                    return true;
                } else {
                    if (lair[r + 1][c] == 'B') {
                        lair[r + 1][c] = 'D';
                    } else {
                        lair[r + 1][c] = 'P';
                    }
                    lair[r][c] = '.';
                }
                break;

        }
        return false;
    }

    private static void fillNewBunnies(char[][] lair, Deque<String> queue) {
        int queueSize = queue.size();
        for (int i = 0; i < queueSize; i++) {
            String coordinatesLine = queue.poll();
            int row = Integer.parseInt(coordinatesLine.split(" ")[0]);
            int col = Integer.parseInt(coordinatesLine.split(" ")[1]);
            if (lair[row][col] == 'D') {

            } else if (lair[row][col] == 'P') {
                lair[row][col] = 'D';
            } else {
                lair[row][col] = 'B';
            }
        }
    }

    private static void getCoordinatesOfNewBunnies(char[][] lair, Deque<String> stack, int r, int c) {

        if (!isEndOfRows(lair, r - 1)) {
            stack.offer((r - 1) + " " + c);
        }
        if (!isEndOfRows(lair, r + 1)) {
            stack.offer((r + 1) + " " + c);
        }
        if (!isEndOfCols(lair, c - 1)) {
            stack.offer(r + " " + (c - 1));
        }
        if (!isEndOfCols(lair, c + 1)) {
            stack.offer(r + " " + (c + 1));
        }

    }

    private static boolean isEndOfCols(char[][] lair, int nextIndex) {
        return nextIndex < 0 || nextIndex > lair[0].length - 1;
    }

    private static boolean isEndOfRows(char[][] lair, int nextIndex) {
        return nextIndex < 0 || nextIndex > lair.length - 1;
    }
}
