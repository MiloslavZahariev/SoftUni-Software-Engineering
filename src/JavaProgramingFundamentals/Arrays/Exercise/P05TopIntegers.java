package JavaProgramingFundamentals.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i <array.length ; i++) {
            boolean flag1 = false;
            
            for (int j = i + 1; j < array.length ; j++) {
                if (array[i] <= array[j]){
                    flag1 = true;
                    break;
                }
            }
            
            if (!flag1){
                    System.out.print(array[i] + " ");


            }
        }
    }
}
