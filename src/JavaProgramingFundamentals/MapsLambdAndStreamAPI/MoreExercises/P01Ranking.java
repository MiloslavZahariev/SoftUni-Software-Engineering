package JavaProgramingFundamentals.MapsLambdAndStreamAPI.MoreExercises;

import java.util.*;

public class P01Ranking {

    static class User {

        private String userName;
        private Map<String, Integer> userContestMap;

        public User(String userName, Map<String, Integer> userContestMap) {
            this.userName = userName;
            this.userContestMap = userContestMap;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public Map<String, Integer> getUserContestMap() {
            return userContestMap;
        }

        public void setUserContestMap(Map<String, Integer> userContestMap) {
            this.userContestMap = userContestMap;
        }

        public int sumPoints(Map<String, Integer> sumMap) {
            int sum = 0;
            for (Map.Entry<String, Integer> entry : sumMap.entrySet()) {
                sum += entry.getValue();
            }
            return sum;
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, String> contestMap = new LinkedHashMap<>();

        Map<String, User> submissionMap = new TreeMap<>();

        while (!input.equals("end of contests")) {
            String contest = input.split(":")[0];
            String password = input.split(":")[1];
            contestMap.put(contest, password);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("end of submissions")) {
            String contest = input.split("=>")[0];
            String password = input.split("=>")[1];
            String userName = input.split("=>")[2];
            int point = Integer.parseInt(input.split("=>")[3]);

            if (contestMap.containsKey(contest) && contestMap.get(contest).equals(password)) {
                User user = new User(userName, new TreeMap<>());
                if (!submissionMap.containsKey(userName)) {
                    user.getUserContestMap().put(contest, point);
                    submissionMap.put(userName, user);
                } else {
                    if (submissionMap.get(userName).getUserContestMap().containsKey(contest)) {
                        int currentPoints = submissionMap.get(userName).getUserContestMap().get(contest);
                        if (currentPoints < point) {
                            submissionMap.get(userName).getUserContestMap().put(contest, point);
                        }
                    } else {
                        submissionMap.get(userName).getUserContestMap().put(contest, point);
                    }


                }
            }

            input = scanner.nextLine();
        }


        printingBestResult(submissionMap);


        System.out.println();
    }

    private static void printingBestResult(Map<String, User> submissionMap) {
        int bestSum = 0;
        String bestPerson = "";
        for (Map.Entry<String, User> entry : submissionMap.entrySet()) {
            int currentSum = entry.getValue().sumPoints(entry.getValue().getUserContestMap());
            if (bestSum < currentSum) {
                bestSum = currentSum;
                bestPerson = entry.getKey();
            }
        }
        System.out.printf("Best candidate is %s with total %d points.%n", bestPerson, bestSum);
        System.out.println("Ranking: ");
        for (Map.Entry<String, User> entry : submissionMap.entrySet()) {
            System.out.println(entry.getKey());

            LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
            entry.getValue().getUserContestMap().entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

            for (Map.Entry<String, Integer> stringIntegerEntry : reverseSortedMap.entrySet()) {
                System.out.printf("#  %s -> %d%n", stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
            }


        }
    }

}

