package JavaProgramingFundamentals.MapsLambdAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        Map<String, Integer> pointsMap = new LinkedHashMap<>();
        Map<String, Integer> submissionsMap = new LinkedHashMap<>();

        while (!input.equals("exam finished")) {
            String username = input.split("-")[0];
            String language = input.split("-")[1];
            if (!language.equals("banned")) {
                int points = Integer.parseInt(input.split("-")[2]);

                pointsMap.putIfAbsent(username, 0);
                int currentPoints = pointsMap.get(username);
                if (currentPoints < points) {
                    pointsMap.put(username, points);
                }

                submissionsMap.putIfAbsent(language, 0);
                int currentValue = submissionsMap.get(language);
                submissionsMap.put(language, currentValue + 1);

            } else {
                pointsMap.remove(username);
                input = scanner.nextLine();
                continue;
            }


            input = scanner.nextLine();
        }

        System.out.println("Results:");
        pointsMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " | " + entry.getValue()));
        System.out.println("Submissions:");
        submissionsMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }
}
