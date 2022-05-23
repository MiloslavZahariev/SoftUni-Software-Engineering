package JavaProgramingBasics.ForLoop.Exercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCount = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 0; i < numberCount; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 200) {
                p1++;
            } else if (number < 400) {
                p2++;
            } else if (number < 600) {
                p3++;
            } else if (number < 800) {
                p4++;
            } else {
                p5++;
            }

        }
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n",
                p1*100.0 / numberCount, p2*100.0 / numberCount, p3*100.0 / numberCount, p4*100.0 / numberCount, p5*100.0 / numberCount);

    }
}
