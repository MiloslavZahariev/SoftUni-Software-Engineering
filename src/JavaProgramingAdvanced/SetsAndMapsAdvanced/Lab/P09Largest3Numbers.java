package JavaProgramingAdvanced.SetsAndMapsAdvanced.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays
                .stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).sorted((n1, n2) -> n2.compareTo(n1))
                .collect(Collectors.toList());


        int count = 0;

        for (int value : integerList) {
            System.out.print(value + " ");
            count++;
            if (count > 2){
                break;
            }
        }

    }
}
