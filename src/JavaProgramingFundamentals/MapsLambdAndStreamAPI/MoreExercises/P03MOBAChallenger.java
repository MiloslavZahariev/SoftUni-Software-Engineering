package JavaProgramingFundamentals.MapsLambdAndStreamAPI.MoreExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03MOBAChallenger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        Map<String, Map<String, Integer>> playerMap = new LinkedHashMap<>();

        while (!input.equals("Season end")) {
            if (input.contains("->")) {
                String name = input.split(" -> ")[0];
                String role = input.split(" -> ")[1];
                int points = Integer.parseInt(input.split(" -> ")[2]);

                Map<String, Integer> roleMap = new LinkedHashMap<>();
                playerMap.putIfAbsent(name, roleMap);
                playerMap.get(name).putIfAbsent(role, 0);
                int currentPoints = playerMap.get(name).get(role);
                if (points > currentPoints) {
                    playerMap.get(name).put(role, points);
                }

            } else {

                String firstPlayer = input.split(" vs ")[0];
                String secondPlayer = input.split(" vs ")[1];
                if (playerMap.containsKey(firstPlayer) && playerMap.containsKey(secondPlayer)) {

                    String playerToRemove = "";
                    for (Map.Entry<String, Integer> entry : playerMap.get(firstPlayer).entrySet()) {
                        String firstPlayerRole = entry.getKey();
                        for (Map.Entry<String, Integer> stringIntegerEntry : playerMap.get(secondPlayer).entrySet()) {
                            String secondPlayerRole = stringIntegerEntry.getKey();

                            if (firstPlayerRole.equals(secondPlayerRole)) {
                                int firstPLayerPoints = gettingTotalPoints(playerMap.get(firstPlayer));
                                int secondPlayerPoints = gettingTotalPoints(playerMap.get(secondPlayer));

                                if (firstPLayerPoints > secondPlayerPoints) {
                                    playerToRemove = secondPlayer;

                                } else if (firstPLayerPoints == secondPlayerPoints) {
                                    break;
                                } else {
                                    playerToRemove = firstPlayer;

                                }
                            }
                        }

                    }
                    playerMap.remove(playerToRemove);

                }
            }

            input = scanner.nextLine();
        }


        printingBestResults(playerMap);

        System.out.println();
    }

    private static void printingBestResults(Map<String, Map<String, Integer>> playerMap) {
        Map<String, Integer> playersTotalPointsMap = new LinkedHashMap<>();
        for (Map.Entry<String, Map<String, Integer>> entry : playerMap.entrySet()) {
            playersTotalPointsMap.put(entry.getKey(), gettingTotalPoints(entry.getValue()));
        }

        while (!playersTotalPointsMap.isEmpty()) {
            String bestUser = "";
            int bestPoints = 0;
            for (Map.Entry<String, Integer> entry : playersTotalPointsMap.entrySet()) {
                if (entry.getValue() > bestPoints) {
                    bestPoints = entry.getValue();
                    bestUser = entry.getKey();
                } else if (entry.getValue() == bestPoints) {
                    if (bestUser.compareTo(entry.getKey()) > 0) {
                        bestUser = entry.getKey();
                    }
                }
            }
            System.out.printf("%s: %d skill%n", bestUser, bestPoints);
            printingBestRoles(playerMap.get(bestUser));
            playersTotalPointsMap.remove(bestUser);

        }

    }

    private static void printingBestRoles(Map<String, Integer> stringIntegerMap) {
        while (!stringIntegerMap.isEmpty()) {
            String bestRole = "";
            int bestPoints = 0;
            for (Map.Entry<String, Integer> entry : stringIntegerMap.entrySet()) {
                if (entry.getValue() > bestPoints) {
                    bestPoints = entry.getValue();
                    bestRole = entry.getKey();
                } else if (entry.getValue() == bestPoints) {
                    if (bestRole.compareTo(entry.getKey()) > 0) {
                        bestRole = entry.getKey();
                    }
                }
            }
            System.out.printf("- %s <::> %d%n", bestRole, bestPoints);
            stringIntegerMap.remove(bestRole);

        }

    }

    private static int gettingTotalPoints(Map<String, Integer> stringIntegerMap) {
        int sum = 0;

        for (Map.Entry<String, Integer> entry : stringIntegerMap.entrySet()) {
            sum += entry.getValue();
        }

        return sum;
    }
}
