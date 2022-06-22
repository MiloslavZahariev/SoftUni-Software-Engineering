package JavaProgramingFundamentals.OldExams;

import java.util.Arrays;
import java.util.Scanner;

public class P02ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] targetsArr = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] markShootArr = new int[targetsArr.length];

        String input = scanner.nextLine();
        int shootCounter = 0;

        while (!input.equals("End")) {
            int index = Integer.parseInt(input);
            if (isValidIndex(targetsArr, index)) {
                if (markShootArr[index] == 0) {
                    markShootArr[index] = 1;
                    int valueOfTarget = targetsArr[index];
                    targetsArr[index] = -1;
                    shootCounter++;
                    for (int i = 0; i < targetsArr.length; i++) {
                        if (targetsArr[i] > valueOfTarget && markShootArr[i] != 1) {
                            targetsArr[i] -= valueOfTarget;
                        } else if (i != index && markShootArr[i] != 1) {
                            targetsArr[i] += valueOfTarget;
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }

        System.out.printf("Shot targets: %d -> ", shootCounter);
        for (int ele : targetsArr) {
            System.out.print(ele + " ");
        }


    }

    private static boolean isValidIndex(int[] targetsArr, int index) {
        return targetsArr.length > index && index >= 0;
    }
}
