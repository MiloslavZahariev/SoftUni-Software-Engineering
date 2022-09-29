package JavaProgramingAdvanced.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.IntFunction;

public class P03CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" +"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Function<int[], Integer> function = arr -> {
            int min = Integer.MAX_VALUE;
            for (int number : arr) {
                if (number < min) {
                    min = number;
                }
            }
            return min;
        };

        int min =function.apply(numbers);

        System.out.println(min);


    }


}
