package JavaProgramingFundamentals.Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (numbersArr.length > 1) {
            int[] sumNumbersArr = new int[numbersArr.length - 1];
            for (int i = 0; i <numbersArr.length -1; i++) {
                sumNumbersArr[i] = numbersArr[i] + numbersArr[i + 1];
            }
            numbersArr = new int[sumNumbersArr.length];
            for (int i = 0; i < sumNumbersArr.length; i++) {
                numbersArr[i] = sumNumbersArr[i];
            }
        }
        System.out.println(numbersArr[0]);
    }

}
