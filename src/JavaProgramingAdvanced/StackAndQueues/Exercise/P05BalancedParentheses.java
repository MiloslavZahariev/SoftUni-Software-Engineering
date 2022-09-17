package JavaProgramingAdvanced.StackAndQueues.Exercise;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P05BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String brackets = scanner.nextLine();

        Deque<Character> openingBrackets = new ArrayDeque<>();
        boolean flag = true;
        if(brackets.length() % 2 != 0){
            System.out.println("NO");
            return;
        }
        for (int i = 0; i < brackets.length(); i++) {
            char currentBracket = brackets.charAt(i);
            if (currentBracket == '(' || currentBracket == '[' || currentBracket == '{') {
                openingBrackets.push(currentBracket);
            } else {
                char lastOpeningBracket = openingBrackets.pop();
                if (currentBracket == '}' && lastOpeningBracket != '{') {
                    flag = false;
                    break;
                } else if (currentBracket == ')' && lastOpeningBracket != '(') {
                    flag = false;
                    break;
                } else if (currentBracket == ']' && lastOpeningBracket != '[') {
                    flag = false;
                    break;
                }
            }
        }

        if (flag){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}