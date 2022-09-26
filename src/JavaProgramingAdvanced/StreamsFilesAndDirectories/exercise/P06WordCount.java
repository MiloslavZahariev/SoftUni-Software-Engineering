package JavaProgramingAdvanced.StreamsFilesAndDirectories.exercise;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class P06WordCount {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new FileReader("resources/01._Sum Lines_Ресурси/04. Java-Advanced-Files-and-Streams-Exercises-Resources/words.txt"));

        String[] wordsToSearch = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (String toSearch : wordsToSearch) {
            map.put(toSearch, 0);
        }

        Scanner fileScanner = new Scanner(new FileReader("resources/01._Sum Lines_Ресурси/04. Java-Advanced-Files-and-Streams-Exercises-Resources/text.txt"));
        String singleWord = fileScanner.next();

        while (fileScanner.hasNext()) {
            if (map.containsKey(singleWord)) {
                int occurrences = map.get(singleWord);
                occurrences++;
                map.put(singleWord, occurrences);
            }
            singleWord = fileScanner.next();
        }
        PrintWriter pw = new PrintWriter(new FileWriter("resources/01._Sum Lines_Ресурси/04. Java-Advanced-Files-and-Streams-Exercises-Resources/result.txt"));

        map.forEach((key, value) -> pw.printf("%s - %d%n", key, value));

        fileScanner.close();
        scanner.close();
        pw.close();

    }
}
