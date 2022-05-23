package JavaProgramingBasics.NestedLoops.MoreExercises;

import java.util.Scanner;

public class CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int stopNumber = Integer.parseInt(scanner.nextLine());

        for (int i = startNumber; i <= stopNumber; i++) {
            for (int j = startNumber; j <= stopNumber; j++) {
                for (int k = startNumber; k <= stopNumber; k++) {
                    for (int l = startNumber; l <= stopNumber; l++) {
                        if (i > l && (j + k) % 2 == 0) {
                            if (i % 2 != 0 && l % 2 == 0) {
                                System.out.printf("%d%d%d%d ", i, j, k, l);
                            }else if (i % 2 == 0 && l % 2 != 0){
                                System.out.printf("%d%d%d%d ", i, j, k, l);
                            }
                        }

                    }

                }

            }

        }
    }
}
