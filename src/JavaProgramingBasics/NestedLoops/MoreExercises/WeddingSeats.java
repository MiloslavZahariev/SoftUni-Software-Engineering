package JavaProgramingBasics.NestedLoops.MoreExercises;

import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char endSector = scanner.nextLine().charAt(0);
        int countRows = Integer.parseInt(scanner.nextLine());
        int seatsOnOddRow = Integer.parseInt(scanner.nextLine());
        int counter = 0;


        for (int i = 'A'; i <= endSector; i++) {
            for (int j = 1; j <= countRows; j++) {
                if (j % 2 != 0) {
                    for (int k = 1; k <= seatsOnOddRow; k++) {
                        System.out.printf("%c%d%c%n", i, j, k + 96);
                        counter++;
                    }
                } else {
                    for (int k = 1; k <= seatsOnOddRow + 2; k++) {
                        System.out.printf("%c%d%c%n", i, j, k + 96);
                        counter++;
                    }
                }

            }
            countRows++;
        }
        System.out.println(counter);
    }
}
