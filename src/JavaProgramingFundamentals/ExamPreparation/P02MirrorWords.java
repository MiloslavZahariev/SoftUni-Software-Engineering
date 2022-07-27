package JavaProgramingFundamentals.ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "(@|#)(?<first>[A-Za-z]{3,})\\1\\1(?<second>[A-Za-z]{3,})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> pairs = new ArrayList<>();
        int count = 0;

        while (matcher.find()) {
            String first = matcher.group("first");
            String second = matcher.group("second");
            StringBuilder secondBuilder = new StringBuilder(second);
            String reverseSecond = secondBuilder.reverse().toString();

            count++;
            if (first.equals(reverseSecond)) {
                pairs.add(first + " <=> " + second);
            }
        }

        if (count > 0) {
            if (!pairs.isEmpty()) {
                System.out.printf("%d word pairs found!%n", count);
                System.out.println("The mirror words are:");
                System.out.println(pairs.toString().replace("[","").replace("]",""));
            }else {
                System.out.printf("%d word pairs found!%n", count);
                System.out.println("No mirror words!");
            }

        } else {
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        }
    }
}
