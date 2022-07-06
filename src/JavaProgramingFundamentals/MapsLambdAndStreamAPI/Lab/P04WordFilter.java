package JavaProgramingFundamentals.MapsLambdAndStreamAPI.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P04WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordArr = Arrays.stream(scanner.nextLine().split(" "))
                .filter(e -> e.length() % 2 == 0).toArray(String[]::new);

        for (String element : wordArr){
            System.out.println(element);
        }

    }
}
