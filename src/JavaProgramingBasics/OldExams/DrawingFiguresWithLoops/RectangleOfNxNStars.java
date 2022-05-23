package JavaProgramingBasics.OldExams.DrawingFiguresWithLoops;

import java.util.Scanner;

public class RectangleOfNxNStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            if (i != 0) {
                System.out.println();
            }
            for (int j = 0; j < n; j++) {
                System.out.print("*");

            }

        }
    }
}
