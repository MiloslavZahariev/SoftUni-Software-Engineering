package JavaProgramingBasics.NestedLoops.MoreExercises;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstLimit = Integer.parseInt(scanner.nextLine());
        int secondLimit = Integer.parseInt(scanner.nextLine());
        int thirdLimit = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= firstLimit; i++) {

            if (i % 2 == 0) {
            } else {
                continue;
            }
            for (int j = 2; j <= secondLimit; j++) {
                if (j != 2 && j != 3 && j != 5 && j != 7) {
                    continue;
                }
                for (int k = 1; k <= thirdLimit; k++) {
                    if (k % 2 == 0) {
                        System.out.printf("%d %d %d%n", i, j, k);

                    }
                }
            }
        }
    }
}