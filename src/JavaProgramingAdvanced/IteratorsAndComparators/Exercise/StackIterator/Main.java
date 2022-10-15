package JavaProgramingAdvanced.IteratorsAndComparators.Exercise.StackIterator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Stack stack = new Stack();

        while (!input.equals("END")) {
            String command = input.split(" ")[0];

            switch (command) {
                case "Push":
                    input = input.replace("Push ", "");
                    stack.push(input);
                    break;
                case "Pop":
                    stack.pop();
                    break;
            }

            input = scanner.nextLine();
        }

    stack.forEach(System.out::println);
    stack.forEach(System.out::println);


    }
}
