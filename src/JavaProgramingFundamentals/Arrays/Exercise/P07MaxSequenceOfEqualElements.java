package JavaProgramingFundamentals.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int tempCounter = 0;
        int maxCounter = 0;
        boolean flag1 = false;

        int element = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                tempCounter++;
            } else {
                if (maxCounter < tempCounter) {
                    maxCounter = tempCounter;
                    element = array[i];
                    flag1 = true;
                }
                tempCounter = 0;
            }

        }
        if (flag1 || tempCounter == 0) {
            for (int i = 0; i <= maxCounter; i++) {
                System.out.print(element + " ");
            }
        } else {
            for (int i = 0; i <= tempCounter; i++) {
                System.out.print(array[array.length - 1] + " ");
            }
        }

    }
}


