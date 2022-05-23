package JavaProgramingBasics.OldExams.DrawingFiguresWithLoops;

import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < num; i++) {
            if (i == 0) {
                System.out.print("+ ");
            } else if (i == num - 1) {
                System.out.print("+");
                System.out.println();
            } else {
                System.out.print("- ");
            }
        }
        for (int i = 1; i <= num - 2; i++) {
            for (int j = 0; j < num; j++) {
                if (j == 0) {
                    System.out.print("| ");
                } else if (j == num - 1) {
                    System.out.print("|");
                    System.out.println();
                } else {
                    System.out.print("- ");
                }
            }

        }

        for (int i = 0; i < num; i++) {
            if (i == 0) {
                System.out.print("+ ");
            } else if (i == num - 1) {
                System.out.print("+");
                System.out.println();
            } else {
                System.out.print("- ");
            }
        }

    }
}
