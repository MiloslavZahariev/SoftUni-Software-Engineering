package JavaProgramingFundamentals.OldFinalExams;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        long coolThreshold = 1;
        List<String> coolEmoji = new ArrayList<>();

        String regex = "([:]{2}|[*]{2})([A-Z][a-z]{2,})\\1";
        String coolRegex = "[0-9]";

        Pattern pattern = Pattern.compile(regex);
        Pattern coolPattern = Pattern.compile(coolRegex);

        Matcher matcher = pattern.matcher(input);
        Matcher coolMatcher = coolPattern.matcher(input);


        while (coolMatcher.find()) {
            int currentNum = Integer.parseInt(coolMatcher.group());
            coolThreshold *= currentNum;
        }
        System.out.printf("Cool threshold: %d%n", coolThreshold);

        while ((matcher.find())) {
            coolEmoji.add(matcher.group());
        }

        System.out.printf("%d emojis found in the text. The cool ones are:%n", coolEmoji.size());

        for (String emoji : coolEmoji) {
            long points = 0;
            for (char symbol : emoji.toCharArray()) {
                if (symbol != ':' && symbol != '*') {
                    points += symbol;
                }

            }
            if (coolThreshold <= points) {
                System.out.println(emoji);
            }
        }
    }
}
