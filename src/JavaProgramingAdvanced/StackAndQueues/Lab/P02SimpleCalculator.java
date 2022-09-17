package JavaProgramingAdvanced.StackAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        String[] tokens = input.split("\\s+");

        ArrayDeque<String> queue = new ArrayDeque<>();


        for (String token : tokens) {
            queue.offer(token);
        }
        int result = Integer.parseInt(queue.poll());
        while (queue.size() > 1) {
            String op = queue.poll();
            int currentNum = Integer.parseInt(queue.poll());

            switch (op) {
                case "+":
                    result += currentNum;
                    break;
                case "-":
                    result -= currentNum;
                    break;
            }

        }

        System.out.println(result);
    }
}
