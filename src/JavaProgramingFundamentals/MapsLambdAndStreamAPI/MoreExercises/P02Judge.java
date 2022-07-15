package JavaProgramingFundamentals.MapsLambdAndStreamAPI.MoreExercises;

import java.util.*;

public class P02Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Map<String, Integer>> contestMap = new LinkedHashMap<>();

        while (!input.equals("no more time")) {
            String username = input.split(" -> ")[0];
            String contest = input.split(" -> ")[1];
            int points = Integer.parseInt(input.split(" -> ")[2]);

            contestMap.putIfAbsent(contest, new LinkedHashMap<>());
            Map<String, Integer> userMap = contestMap.get(contest);
            userMap.putIfAbsent(username, points);
            if (points > userMap.get(username)) {
                userMap.put(username, points);
            }


            input = scanner.nextLine();
        }
        Map<String, Integer> individualMap = fillingIndividualStandings(contestMap);
        for (Map.Entry<String, Map<String, Integer>> entry : contestMap.entrySet()) {
            System.out.printf("%s: %d participants%n", entry.getKey(), entry.getValue().size());
            printingUsersInOrder(entry.getValue(), "<::>");
        }
        System.out.println("Individual standings:");
        printingUsersInOrder(individualMap, "->");


    }

    private static Map<String, Integer> fillingIndividualStandings(Map<String, Map<String, Integer>> contestMap) {
        Map<String, Integer> individualMap = new LinkedHashMap<>();


        for (Map.Entry<String, Map<String, Integer>> entry : contestMap.entrySet()) {
            for (Map.Entry<String, Integer> integerEntry : entry.getValue().entrySet()) {
                individualMap.putIfAbsent(integerEntry.getKey(), 0);
                int currentPoints = individualMap.get(integerEntry.getKey());
                individualMap.put(integerEntry.getKey(), currentPoints + integerEntry.getValue());
            }

        }

        return individualMap;
    }

    private static void printingUsersInOrder(Map<String, Integer> value, String s) {
        int index = 1;
        while (!value.isEmpty()) {

            String bestUser = "";
            int bestPoints = 0;
            for (Map.Entry<String, Integer> entry : value.entrySet()) {
                if (entry.getValue() > bestPoints) {
                    bestPoints = entry.getValue();
                    bestUser = entry.getKey();
                } else if (entry.getValue() == bestPoints) {
                    if (bestUser.compareTo(entry.getKey()) > 0) {
                        bestUser = entry.getKey();
                    }
                }
            }
            System.out.printf("%d. %s %s %d%n", index, bestUser, s, bestPoints);
            value.remove(bestUser);
            index++;
        }
    }

}
