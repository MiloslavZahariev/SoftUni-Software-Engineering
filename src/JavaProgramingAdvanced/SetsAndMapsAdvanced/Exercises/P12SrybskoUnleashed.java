package JavaProgramingAdvanced.SetsAndMapsAdvanced.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P12SrybskoUnleashed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Map<String, Integer>> venueMap = new LinkedHashMap<>();
        Map<String, Integer> singersMap = new LinkedHashMap<>();


        while (!input.equals("End")) {

            String regex = "^([a-zA-Z]+[ ]?[a-zA-Z]*[ ]?[a-zA-Z]*[ ])[@]([a-zA-Z]+[ ]?[a-zA-Z]*[ ]?[a-zA-Z]*[ ])([\\d]+)[ ]([\\d]+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            String singer = "";
            String venue = "";
            int price = 0;
            int tickets = 0;
            while (matcher.find()) {
                singer = matcher.group(1);
                venue = matcher.group(2);
                price = Integer.parseInt(matcher.group(3));
                tickets = Integer.parseInt(matcher.group(4));
            }

            if (singer.equals("")) {
                input = scanner.nextLine();
                continue;
            }
            venueMap.putIfAbsent(venue, new LinkedHashMap<>());
            venueMap.get(venue).putIfAbsent(singer, 0);
            int currentProfit = venueMap.get(venue).get(singer);
            venueMap.get(venue).put(singer, currentProfit + (price * tickets));


            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Integer>> entry : venueMap.entrySet()) {
            System.out.printf("%s%n", entry.getKey());

            entry.getValue().entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue()
                    .reversed()).forEach(currentProfit -> {
                System.out.printf("#  %s-> %d%n", currentProfit.getKey(), currentProfit.getValue());
            });


        }


    }
}
