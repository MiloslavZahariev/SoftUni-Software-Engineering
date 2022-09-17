package JavaProgramingFundamentals.FinalExam;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String command = input.split(" ")[0];
            String substring = "";

            switch (command) {
                case "Translate":
                    String oldChar = input.split(" ")[1];
                    String newChar = input.split(" ")[2];
                    text = text.replace(oldChar, newChar);
                    System.out.println(text);
                    break;
                case "Includes":
                    substring = input.split(" ")[1];
                    if (text.contains(substring)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    substring = input.split(" ")[1];
                    int subLength = substring.length();
                    String startSub = text.substring(0, subLength);
                    if (substring.equals(startSub)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Lowercase":
                    text = text.toLowerCase();
                    System.out.println(text);
                    break;
                case "FindIndex":
                    char symbol = input.split(" ")[1].charAt(0);
                    int index = text.lastIndexOf(symbol);
                    System.out.println(index);
                    break;
                case "Remove":
                    int startIndex = Integer.parseInt(input.split(" ")[1]);
                    int count = Integer.parseInt(input.split(" ")[2]);

                    StringBuilder textBuilder = new StringBuilder(text);
                    text = textBuilder.delete(startIndex, startIndex + count).toString();
                    System.out.println(text);
                    break;
            }


            input = scanner.nextLine();
        }

    }
}
