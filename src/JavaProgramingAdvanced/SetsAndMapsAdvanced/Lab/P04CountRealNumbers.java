package JavaProgramingAdvanced.SetsAndMapsAdvanced.Lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> valuesWithOccurrences = new LinkedHashMap<>();

        for (Double value : numbers) {
            valuesWithOccurrences.putIfAbsent(value, 0);
            int currentOcc = valuesWithOccurrences.get(value);
            valuesWithOccurrences.put(value, currentOcc + 1);
        }

        for (Map.Entry<Double, Integer> entry : valuesWithOccurrences.entrySet()) {
            System.out.printf("%.1f -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}
