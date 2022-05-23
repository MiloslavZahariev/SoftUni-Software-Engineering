package JavaProgramingBasics.NestedLoops.MoreExercises;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int letter = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                for (int k = 97; k <= letter + 96; k++) {
                    for (int l = 97; l <= letter + 96; l++) {
                        for (int m = 2; m <= number; m++) {
                            if (m > i && m > j) {
                                System.out.printf("%d%d%c%c%d ", i, j, k, l, m);
                            }

                        }

                    }

                }

            }

        }
    }
}
