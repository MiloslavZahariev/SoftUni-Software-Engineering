package JavaProgramingFundamentals.MapsLambdAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> symbolsCount = new LinkedHashMap<>();

        for (char symbol : text.toCharArray()) {
            if(symbol ==' '){
                continue;
            }
            int value = 0;
            symbolsCount.putIfAbsent(symbol, value);
            value = symbolsCount.get(symbol);
            symbolsCount.put(symbol,value +1);
        }

       symbolsCount.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
