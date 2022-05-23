package JavaProgramingBasics.WhileLoop.MoreExersices;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        int counterN = 0;
        int counterO = 0;
        int counterC = 0;
        StringBuilder arr = new StringBuilder();


        while (!input.equals("End")) {
            input = scanner.nextLine();
            char c = input.charAt(0);
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                if (counterC == 1 && counterN == 1 && counterO == 1) {
                    counterC = 0;
                    counterN = 0;
                    counterO = 0;
                    arr.append(" ");
                    System.out.print(arr);
                    arr = new StringBuilder();
                }
                if (input.equals("n") && counterN == 0) {
                    counterN = 1;
                    continue;
                }
                if (input.equals("o") && counterO == 0) {
                    counterO = 1;
                    continue;
                }
                if (input.equals("c") && counterC == 0) {
                    counterC = 1;
                    continue;
                }
                arr.append(input);

            }
        }
    }
}
