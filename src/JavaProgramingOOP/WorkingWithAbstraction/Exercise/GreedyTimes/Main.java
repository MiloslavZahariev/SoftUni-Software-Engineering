
package JavaProgramingOOP.WorkingWithAbstraction.Exercise.GreedyTimes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] safe = scanner.nextLine().split("\\s+");

        Bag bag = new Bag(bagCapacity);

        for (int i = 0; i < safe.length; i += 2) {
            String itemType = safe[i];
            long quantity = Long.parseLong(safe[i + 1]);

            Item item = new Item(itemType, quantity);
            bag.put(item);
        }


        System.out.println(bag);
    }

}