package JavaProgramingBasics.NestedLoops.Lab;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= x; j++) {
                for (int k = 0; k <= x; k++) {
                    if (i + j + k == x) {
                        counter++;
                    }
                }

            }

        }
        System.out.println(counter);
    }
}
