package JavaProgramingFundamentals.MapsLambdAndStreamAPI.Lab;

import java.util.*;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] lineInput = scanner.nextLine().split(" ");

        Map<String, Integer> wordMap = new LinkedHashMap<>();

        for (int i = 0; i < lineInput.length; i++) {
            String currentWord = lineInput[i].toLowerCase();
            wordMap.putIfAbsent(currentWord, 0);
            int value = wordMap.get(currentWord);
            wordMap.put(currentWord, value + 1);
        }

        List<String > oddWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            if(entry.getValue() %2 != 0){
                oddWords.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ",oddWords));

    }
}
