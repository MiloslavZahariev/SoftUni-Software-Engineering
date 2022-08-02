package JavaProgramingFundamentals.OldFinalExams;

import java.util.Scanner;

public class P01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String text = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String command = input.split(" ")[0];
            if (command.equals("TakeOdd")) {
                text = takingOddIndexAndConcatenate(text);
                System.out.println(text);

            } else if (command.equals("Cut")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                int numberOfSymbols = Integer.parseInt(input.split(" ")[2]);
                text = cuttingText(text, index, numberOfSymbols);
                System.out.println(text);

            } else if (command.equals("Substitute")) {
                String oldSubstring = input.split(" ")[1];
                String newSubstring = input.split(" ")[2];
                if (text.contains(oldSubstring)) {
                    text = text.replace(oldSubstring, newSubstring);
                    System.out.println(text);
                } else {
                    System.out.println("Nothing to replace!");
                }

            }


            input = scanner.nextLine();
        }
        System.out.printf("Your password is: %s%n",text);
    }

    private static String cuttingText(String text, int index, int numberOfSymbols) {
        StringBuilder cutText = new StringBuilder(text);
        return cutText.delete(index, index + numberOfSymbols).toString();
    }

    private static String takingOddIndexAndConcatenate(String text) {
        StringBuilder newText = new StringBuilder();
        for (int i = 1; i < text.length(); i++) {
            if (i % 2 != 0) {
                newText.append(text.charAt(i));
            }
        }
        return newText.toString();
    }
}
