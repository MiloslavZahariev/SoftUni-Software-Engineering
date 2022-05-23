package JavaProgramingBasics.ForLoop.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumbers = Integer.parseInt(scanner.nextLine());
        int numberCollection = 0;
        int[] arr = new int[countNumbers];
        int j = 0;

        for (int i = 1; i <= countNumbers * 2; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            numberCollection += number;
            if (i % 2 == 0) {
                arr[j++] = numberCollection;
                numberCollection = 0;
            }
        }
        int diff = 0;
        int maxDiff = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                diff = Math.abs(arr[i - 1] - arr[i]);
                maxDiff = Math.max(maxDiff, diff);
            }

        }

        if(maxDiff != 0){
            System.out.printf("No, maxdiff=%d",maxDiff);
        }else{
            System.out.printf("Yes, value=%d%n",arr[0]);
        }

    }
}


