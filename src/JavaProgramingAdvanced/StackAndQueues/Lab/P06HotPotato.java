package JavaProgramingAdvanced.StackAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P06HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] kids = scanner.nextLine().split("\\s+");
        int num = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();

        for (String kid : kids) {
            queue.offer(kid);
        }

        while (queue.size() > 1) {

            for (int i = 0; i < num; i++) {
                if (i != num - 1) {
                    String currentKid = queue.poll();
                    queue.offer(currentKid);
                } else {
                    System.out.println("Removed " + queue.poll());
                }
            }
        }
        System.out.println("Last is " + queue.poll());
    }
}
