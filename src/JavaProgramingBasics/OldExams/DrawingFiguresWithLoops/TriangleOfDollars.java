package JavaProgramingBasics.OldExams.DrawingFiguresWithLoops;

import java.util.Scanner;

public class TriangleOfDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {
            if (i != 1) {
                System.out.println();
            }
            for (int j = 0; j < i; j++) {
                if (j == i - 1) {
                    System.out.print("$");
                }else{
                    System.out.print("$ ");
                }
            }

        }
    }
}
