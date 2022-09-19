package JavaProgramingAdvanced.StackAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P08InfixToPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] expression = input.split(" ");

        Deque<String> queue = new ArrayDeque<>();
        Deque<String> stack = new ArrayDeque<>();

        for (String symbol : expression) {
            if (Character.isDigit(symbol.charAt(0)) || Character.isLetter(symbol.charAt(0))){
                queue.offer(symbol);
            } else{
                if (stack.isEmpty()) {
                    stack.push(symbol);
                } else {
                    String lastOperator = stack.peek();
                    switch (symbol) {
                        case "+":
                        case "-":
                            if (lastOperator.equals("(")) {
                                stack.push(symbol);
                            } else {
                                queue.offer(stack.pop());
                                stack.push(symbol);
                            }
                            break;
                        case "*":
                        case "/":
                            if (lastOperator.equals("*")|| lastOperator.equals("/")) {
                                queue.offer(stack.pop());
                                stack.push(symbol);
                            } else {
                                stack.push(symbol);
                            }
                            break;
                        case "(":
                            stack.push(symbol);
                            break;
                        case ")":
                            while (!stack.peek().equals("(")) {
                                queue.offer(stack.pop());
                            }
                            stack.pop();
                            break;
                    }
                }

            }
        }

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
