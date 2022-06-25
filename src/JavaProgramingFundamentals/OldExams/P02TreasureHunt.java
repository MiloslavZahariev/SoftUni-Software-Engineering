package JavaProgramingFundamentals.OldExams;

import java.util.*;
import java.util.stream.Collectors;

public class P02TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> startLoot =
                Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList
                        ());

        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")) {
            List<String> commandList = Arrays.stream(command.split(" ")).collect(Collectors.toList());

            switch (commandList.get(0)) {
                case "Loot":
                    lootingItemsFromChest(startLoot, commandList);
                    break;
                case "Drop":
                    removingItemAndAppendIt(startLoot, commandList);
                    break;
                case "Steal":
                    stealingLastItems(startLoot, commandList);
                    break;
            }


            command = scanner.nextLine();
        }

        if (startLoot.size() > 0) {
            String treasureCount = String.join("",startLoot);
            System.out.printf("Average treasure gain: %.2f pirate credits.%n", (1.0 * treasureCount.length()) / startLoot.size());
        }else {
            System.out.println("Failed treasure hunt.");
        }

    }


    private static void stealingLastItems(List<String> startLoot, List<String> commandList) {
        int numberOfStealing = Integer.parseInt(commandList.get(1));
        List<String> stolenItems = new ArrayList<>();

        for (int i = 0; i < numberOfStealing; i++) {
            stolenItems.add(startLoot.get(startLoot.size() - 1));
            startLoot.remove(startLoot.size() - 1);
            if(startLoot.isEmpty()){
                break;
            }
        }
        Collections.reverse(stolenItems);
        System.out.println(stolenItems.toString().replaceAll("[\\[\\]]", ""));
    }

    private static void removingItemAndAppendIt(List<String> startLoot, List<String> commandList) {
        int index = Integer.parseInt(commandList.get(1));

        if (index >= 0 && index < startLoot.size()) {
            String itemForRemove = startLoot.get(index);
            startLoot.remove(index);
            startLoot.add(itemForRemove);
        }
    }

    private static void lootingItemsFromChest(List<String> startLoot, List<String> commandList) {

        for (int i = 1; i < commandList.size(); i++) {
            if (!startLoot.contains(commandList.get(i))) {
                startLoot.add(0, commandList.get(i));
            }
        }
    }
}
