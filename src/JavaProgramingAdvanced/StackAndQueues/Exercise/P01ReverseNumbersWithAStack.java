package JavaProgramingAdvanced.StackAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P01ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");

        Deque<String> stack = new ArrayDeque<>();

        for (String number : numbers) {
            stack.push(number);
        }

        while (!stack.isEmpty()) {
            System.out.printf("%s ", stack.pop());
        }

    }
}
