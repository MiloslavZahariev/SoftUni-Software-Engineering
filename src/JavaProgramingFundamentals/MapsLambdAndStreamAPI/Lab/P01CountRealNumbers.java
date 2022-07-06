package JavaProgramingFundamentals.MapsLambdAndStreamAPI.Lab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        Map<Double, Integer> countNumbersMap = new TreeMap<>();

        for (double currentNum : numbersList) {
            Integer currentValue = countNumbersMap.get(currentNum);
            if (countNumbersMap.containsKey(currentNum)) {
                countNumbersMap.put(currentNum, currentValue + 1);
            } else {
                countNumbersMap.put(currentNum, 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : countNumbersMap.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n",df.format( entry.getKey()),entry.getValue());
        }

    }
}
