package JavaProgramingOOP.WorkingWithAbstraction.Exercise.JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] fieldSize = readPositions(scanner);
        int rows = fieldSize[0];
        int cols = fieldSize[1];

        Field field = new Field(rows, cols);
        String command = scanner.nextLine();
        long starsCollected = 0;
        while (!command.equals("Let the Force be with you")) {

            Galaxy galaxy = new Galaxy(field);

            int[] jediPositions = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evilPositions = readPositions(scanner);
            int rowEvil = evilPositions[0];
            int colEvil = evilPositions[1];

            galaxy.moveEvil(rowEvil, colEvil);

            int rowJedi = jediPositions[0];
            int colJedi = jediPositions[1];

            starsCollected += galaxy.moveJedi(rowJedi, colJedi);
            command = scanner.nextLine();
        }
        System.out.println(starsCollected);


    }

    private static int[] readPositions(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

}