package JavaProgramingAdvanced.IteratorsAndComparators.Exercise.Froggy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> lakeNumbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String end = scanner.nextLine();


        Lake lake = new Lake(lakeNumbers);

        List<String> result = new ArrayList<>();

        for (Integer number : lake){
            result.add(String.valueOf(number));
        }

        System.out.println(String.join(", ",result));


    }
}
