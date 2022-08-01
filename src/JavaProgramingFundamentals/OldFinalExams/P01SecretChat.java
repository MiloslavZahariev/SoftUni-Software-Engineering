package JavaProgramingFundamentals.OldFinalExams;

import java.util.Scanner;
import java.util.regex.Pattern;

public class P01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String concealedText = scanner.nextLine();
        StringBuilder textBuilder = new StringBuilder(concealedText);

        String input = scanner.nextLine();
        while (!input.equals("Reveal")) {
            String command = input.split(":\\|:")[0];
            if (command.equals("InsertSpace")) {
                int index = Integer.parseInt(input.split(":\\|:")[1]);
                textBuilder.insert(index, " ");
                System.out.println(textBuilder);
            } else if (command.equals("Reverse")) {
                String substring = input.split(":\\|:")[1];
                concealedText = textBuilder.toString();
                StringBuilder reverseSubstring = new StringBuilder(substring).reverse();
                if (concealedText.contains(substring)) {
                    concealedText = concealedText.replaceFirst(Pattern.quote(substring), "");
                    textBuilder = new StringBuilder(concealedText + reverseSubstring);
                    System.out.println(textBuilder);
                } else {
                    System.out.println("error");
                }

            } else if (command.equals("ChangeAll")) {
                String oldSubstring = input.split(":\\|:")[1];
                String newSubstring = input.split(":\\|:")[2];
                concealedText = textBuilder.toString().replace(oldSubstring, newSubstring);
                textBuilder = new StringBuilder(concealedText);
                System.out.println(textBuilder);
            }
            input = scanner.nextLine();
        }

        System.out.printf("You have a new text message: %s%n", textBuilder);
    }

}
