package JavaProgramingFundamentals.Arrays.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P02PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] rowArr = new int[1];
        rowArr[0] = 1;
        int[] tempArr = new int[61];

        for (int i = 1; i <= n; i++) {
            System.out.println(Arrays.toString(rowArr)
                    .replace("[","")
                    .replace("]", "")
                    .replace(",", ""));
            rowArr = new int[i + 1];
            for (int j = 1; j <= i; j++) {
                rowArr[0] = 1;
                rowArr[j] = tempArr[j - 1] + tempArr[j];
                rowArr[rowArr.length - 1] = 1;
            }
            for (int j = 0; j < rowArr.length; j++) {
                tempArr[j] = rowArr[j];
            }
        }
    }
}