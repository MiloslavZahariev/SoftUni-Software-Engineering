package JavaProgramingBasics.NestedLoops.MoreExercises;

import java.util.Scanner;

public class SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxPass = Integer.parseInt(scanner.nextLine());
        int A = 35;
        int B = 64;
        int counter = 0;
        boolean flag1 = false;

        for (int j = 1; j <= a; j++) {

            for (int k = 1; k <= b; k++) {
                System.out.printf("%c%c%d%d%c%c|", A, B, j, k, B, A);
                A++;
                B++;
                if (A > 55) {
                    A = 35;
                }
                if (B > 96) {
                    B = 64;
                }
                counter++;
                if (counter >= maxPass || j == a && k == b) {
                    flag1 = true;
                    break;
                }
            }
            if (flag1) {
                break;
            }
        }

    }

}


