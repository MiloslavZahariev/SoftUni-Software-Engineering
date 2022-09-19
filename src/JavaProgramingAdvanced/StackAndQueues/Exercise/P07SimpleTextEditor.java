package JavaProgramingAdvanced.StackAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P07SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCommand = Integer.parseInt(scanner.nextLine());

        StringBuilder text = new StringBuilder();
        Deque stack = new ArrayDeque();

        for (int i = 0; i < countCommand; i++) {
            String input = scanner.nextLine();
            int command = Integer.parseInt(input.split(" ")[0]);
            int index = 0;
            switch (command) {
                case 1:
                    stack.push(text.toString());
                    text.append(input.split(" ")[1]);
                    break;
                case 2:
                    stack.push(text.toString());
                    index = Integer.parseInt(input.split(" ")[1]);
                    text.delete(text.length() - index, text.length());
                    break;
                case 3:
                    index = Integer.parseInt(input.split(" ")[1]);
                    char symbolToPrint = text.charAt(index - 1);
                    System.out.println(symbolToPrint);
                    break;
                case 4:
                    text = new StringBuilder();
                    text.append(stack.pop());
                    break;
            }
        }


    }
}
