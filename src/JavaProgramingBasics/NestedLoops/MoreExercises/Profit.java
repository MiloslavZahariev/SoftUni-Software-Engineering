package JavaProgramingBasics.NestedLoops.MoreExercises;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOf1 = Integer.parseInt(scanner.nextLine());
        int countOf2 = Integer.parseInt(scanner.nextLine());
        int countOf5 = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i <= countOf1; i++) {
            for (int j = 0; j <= countOf2; j++) {
                for (int k = 0; k <= countOf5; k++) {
                    if (i + j * 2 + (k * 5) == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n",i ,j,k,sum );
                    }

                }

            }

        }


    }
}
