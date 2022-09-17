package JavaProgramingAdvanced.StackAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P07MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] kids = scanner.nextLine().split("\\s+");
        int num = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();

        for (String kid : kids) {
            queue.offer(kid);
        }

        int cycle = 1;
        while (queue.size() > 1) {

            for (int i = 1; i < num; i++) {
                queue.offer(queue.poll());
            }

            if (isPrime(cycle)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }

            cycle++;
        }
        System.out.println("Last is " + queue.poll());
    }

    private static boolean isPrime(int cycle) {
        boolean flag = true;
        if(cycle == 1){
            return false;
        }
        for (int i = 2; i <= cycle / 2; ++i) {
            if (cycle % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
