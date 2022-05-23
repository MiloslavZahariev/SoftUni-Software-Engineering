package JavaProgramingBasics.NestedLoops.MoreExercises;

import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startFirstPair = Integer.parseInt(scanner.nextLine());
        int startSecondPair = Integer.parseInt(scanner.nextLine());
        int diffFirstPair = Integer.parseInt(scanner.nextLine());
        int diffSecondPair = Integer.parseInt(scanner.nextLine());

        for (int i = startFirstPair; i <= startFirstPair + diffFirstPair; i++) {
            for (int j = startSecondPair; j <= startSecondPair + diffSecondPair; j++) {
                boolean flag = true;
                for (int k = 2; k < i; k++) {
                    if (i % k == 0) {
                        flag = false;
                        break;
                    }
                }
                boolean flag2 = true;
                for (int k = 2; k < j ; k++) {
                    if (j % k == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag && flag2){
                    System.out.printf("%d%d%n",i,j);;
                }
            }
        }

    }
}

