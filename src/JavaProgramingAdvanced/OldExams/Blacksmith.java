package JavaProgramingAdvanced.OldExams;

import java.util.*;

public class Blacksmith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> steelQueue = new ArrayDeque<>();
        Deque<Integer> carbonStack = new ArrayDeque<>();
        Map<String, Integer> swordsMap = new TreeMap<>();
        swordsMap.put("Gladius", 0);
        swordsMap.put("Shamshir", 0);
        swordsMap.put("Katana", 0);
        swordsMap.put("Sabre", 0);

        String[] steelInput = scanner.nextLine().split(" ");
        String[] carbonInput = scanner.nextLine().split(" ");

        for (String s : steelInput) {
            steelQueue.offer(Integer.parseInt(s));
        }
        for (String c : carbonInput) {
            carbonStack.push(Integer.parseInt(c));
        }

        int countOfSwords = 0;
        while (!steelQueue.isEmpty() && !carbonStack.isEmpty()) {

            int currentSteel = steelQueue.poll();
            int currentCarbon = carbonStack.pop();
            int sum = currentSteel + currentCarbon;

            if (sum == 70) {
                int currentCount = swordsMap.get("Gladius");
                swordsMap.put("Gladius", currentCount + 1);
                countOfSwords++;
            } else if (sum == 80) {
                int currentCount = swordsMap.get("Shamshir");
                swordsMap.put("Shamshir", currentCount + 1);
                countOfSwords++;
            } else if (sum == 90) {
                int currentCount = swordsMap.get("Katana");
                swordsMap.put("Katana", currentCount + 1);
                countOfSwords++;
            } else if (sum == 110) {
                int currentCount = swordsMap.get("Sabre");
                swordsMap.put("Sabre", currentCount + 1);
                countOfSwords++;
            } else {
                currentCarbon += 5;
                carbonStack.push(currentCarbon);
            }
        }

        if (countOfSwords > 0) {
            System.out.printf("You have forged %d swords.%n", countOfSwords);
        } else {
            System.out.println("You did not have enough resources to forge a sword.");
        }
        System.out.printf("Steel left: %s%n", getRemaining(steelQueue));
        System.out.printf("Carbon left: %s%n", getRemaining(carbonStack));

        printingMap(swordsMap);
    }

    private static void printingMap(Map<String, Integer> swordsMap) {
        for (Map.Entry<String, Integer> entry : swordsMap.entrySet()) {
            if(entry.getValue() > 0){
                System.out.printf("%s: %d%n",entry.getKey(),entry.getValue());
            }
        }

    }

    private static String getRemaining(Deque<Integer> steelQueue) {
        if (steelQueue.isEmpty()) {
            return "none";
        }
        return steelQueue.toString().replace("[", "").replace("]", "");
    }
}

