package JavaProgramingBasics.NestedLoops.MoreExercises;

import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char startLetter = scanner.next().charAt(0);
        char endLetter = scanner.next().charAt(0);
        char skipLetter = scanner.next().charAt(0);
        int counter = 0;

        for (int i = startLetter; i <= endLetter; i++) {
            if (i == skipLetter) {
                continue;
            }
            for (int j = startLetter; j <= endLetter; j++) {
                if (j == skipLetter) {
                    continue;
                }
                for (int k = startLetter; k <= endLetter; k++) {
                    if (k != skipLetter) {
                        System.out.printf("%c%c%c ", i, j, k);
                        counter++;
                    }
                }
            }
        }
        System.out.printf("%d",counter);
    }
}
