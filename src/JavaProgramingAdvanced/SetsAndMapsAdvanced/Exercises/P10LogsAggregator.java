package JavaProgramingAdvanced.SetsAndMapsAdvanced.Exercises;

import java.util.*;

public class P10LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLogs = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> userTotalDuration = new TreeMap<>();
        Map<String, Set<String>> userIpMap = new TreeMap<>();

        for (int i = 0; i < numberOfLogs; i++) {
            String[] input = scanner.nextLine().split(" ");

            String iP = input[0];
            String user = input[1];
            int duration = Integer.parseInt(input[2]);

            userTotalDuration.putIfAbsent(user, 0);
            int currentDuration = userTotalDuration.get(user);
            userTotalDuration.put(user, currentDuration + duration);

            userIpMap.putIfAbsent(user, new TreeSet<>());
            userIpMap.get(user).add(iP);
        }

        for (Map.Entry<String, Integer> entryMap : userTotalDuration.entrySet()) {
            System.out.printf("%s: %d ", entryMap.getKey(), entryMap.getValue());

            String iPs = userIpMap.get(entryMap.getKey()).toString();
            System.out.println(iPs);
        }


    }
}
