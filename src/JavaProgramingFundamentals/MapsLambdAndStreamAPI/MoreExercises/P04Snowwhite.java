package JavaProgramingFundamentals.MapsLambdAndStreamAPI.MoreExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04Snowwhite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Map<String, Integer>> hatColorsMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Once upon a time")) {
            String name = input.split(" <:> ")[0];
            String hatColor = input.split(" <:> ")[1];
            int physic = Integer.parseInt(input.split(" <:> ")[2]);

            hatColorsMap.putIfAbsent(hatColor, new LinkedHashMap<>());
            hatColorsMap.get(hatColor).putIfAbsent(name, physic);
            if (hatColorsMap.get(hatColor).get(name) < physic) {
                hatColorsMap.get(hatColor).put(name, physic);
            }


            input = scanner.nextLine();
        }

        Map<String, Integer> print = new LinkedHashMap<>();

        for(Map.Entry<String, Map<String, Integer>> entry : hatColorsMap.entrySet()) {
            for(Map.Entry<String, Integer> subEntry : entry.getValue().entrySet()) {
                print.put(entry.getKey() + " " + subEntry.getKey() + " " + entry.getValue().size(), subEntry.getValue());
            }
        }
        print.entrySet().stream().sorted((pair2, pair1) -> {
            int sort = Integer.compare(pair1.getValue(), pair2.getValue());
            if (sort == 0) {
                String[] sort1 = pair1.getKey().split(" ");
                String[] sort2 = pair2.getKey().split(" ");
                sort = sort1[2].compareTo(sort2[2]);
            }
            return sort;
        }).forEach(pair -> {
            String[] printing = pair.getKey().split(" ");
            System.out.printf("(%s) %s <-> %d%n", printing[0], printing[1], pair.getValue());
        });
    }

}


