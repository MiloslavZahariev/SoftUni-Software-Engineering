package JavaProgramingAdvanced.OldExams;

import java.util.*;

public class FoodFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Deque<String> vowelQueue = new ArrayDeque<>();
        Deque<String> consonantStack = new ArrayDeque<>();

        String vowelInput = scanner.nextLine();
        String consonantInput = scanner.nextLine();

        Arrays.stream(vowelInput.split(" ")).forEach(vowelQueue::offer);
        Arrays.stream(consonantInput.split(" ")).forEach(consonantStack::push);

        Map<String, String> keyWords = new LinkedHashMap<>();
        keyWords.put("pear", "");
        keyWords.put("flour", "");
        keyWords.put("pork", "");
        keyWords.put("olive", "");


        while (!consonantStack.isEmpty()) {
            String currentConsonant = consonantStack.pop();
            String currentVowel = vowelQueue.poll();

            for (var entry : keyWords.entrySet()) {
                if (entry.getKey().contains(currentConsonant) && !entry.getValue().contains(currentConsonant)) {
                    String tempString = entry.getValue();
                    keyWords.put(entry.getKey(), tempString + currentConsonant);
                }
                if (entry.getKey().contains(currentVowel) && !entry.getValue().contains(currentVowel)) {
                    String tempString = entry.getValue();
                    keyWords.put(entry.getKey(), tempString + currentVowel);
                }
            }


            vowelQueue.offer(currentVowel);
        }


        StringBuilder sb = new StringBuilder();
        int wordCounter = 0;

        for (Map.Entry<String, String> entry : keyWords.entrySet()) {
            if (entry.getKey().length() == entry.getValue().length()) {
                sb.append(entry.getKey()).append(System.lineSeparator());
                wordCounter++;
            }
        }


        System.out.println("Words found: " + wordCounter);
        System.out.println(sb);
    }
}
