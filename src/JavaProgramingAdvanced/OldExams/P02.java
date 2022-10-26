package JavaProgramingAdvanced.OldExams;

import java.util.Scanner;

public class P02 {

    public static int carRow;
    public static int carCol;
    public static int distance;
    public static boolean isOverRace = false;

    public static int tunnelRow;
    public static int tunnelCol;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int fieldSize = Integer.parseInt(scanner.nextLine());
        String racingNumber = scanner.nextLine();

        char[][] trace = new char[fieldSize][fieldSize];

        for (int r = 0; r < trace.length; r++) {
            String input = scanner.nextLine().replace(" ", "");
            char[] inputRow = input.toCharArray();
            for (int c = 0; c < trace[r].length; c++) {
                trace[r][c] = inputRow[c];
            }
        }

        trace[0][0] = 'C';

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            switch (command) {
                case "up":
                    movingCar(trace, -1, 0);
                    break;
                case "down":
                    movingCar(trace, +1, 0);
                    break;
                case "left":
                    movingCar(trace, 0, -1);
                    break;
                case "right":
                    movingCar(trace, 0, +1);
                    break;
            }
            if (isOverRace) {
                break;
            }


            command = scanner.nextLine();
        }
        if(isOverRace){
            System.out.printf("Racing car %s finished the stage!%n",racingNumber);
        }else {
            System.out.printf("Racing car %s DNF.%n",racingNumber);
        }

        System.out.printf("Distance covered %d km.%n",distance);

        for (int r = 0; r < trace.length; r++) {
            for (int c = 0; c < trace[r].length; c++) {
                System.out.print(trace[r][c]);
            }
            System.out.println();
        }

    }

    private static void movingCar(char[][] trace, int rowMutator, int colMutator) {
        int nextRow = carRow + rowMutator;
        int nextCol = carCol + colMutator;


        if (trace[nextRow][nextCol] == 'F') {
            distance += 10;
            trace[carRow][carCol] = '.';
            trace[nextRow][nextCol] = 'C';
            isOverRace = true;
        } else if (trace[nextRow][nextCol] == 'T') {
            distance += 30;
            trace[carRow][carCol] = '.';
            trace[nextRow][nextCol] = '.';
            findingEndOfTunnel(trace);
            carRow = tunnelRow;
            carCol = tunnelCol;
            trace[carRow][carCol] = 'C';
        } else if (trace[nextRow][nextCol] == '.') {
            distance += 10;
            trace[carRow][carCol] = '.';
            carRow = nextRow;
            carCol = nextCol;
            trace[carRow][carCol] = 'C';
        }

    }

    private static void findingEndOfTunnel(char[][] trace) {
        for (int r = 0; r < trace.length; r++) {
            for (int c = 0; c < trace[r].length; c++) {
                if (trace[r][c] == 'T') {
                    tunnelRow = r;
                    tunnelCol = c;
                }
            }
        }
    }


}
