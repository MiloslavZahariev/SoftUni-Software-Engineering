package JavaProgramingAdvanced.SetsAndMapsAdvanced.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P09PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Long> countriesMap = new LinkedHashMap<>();
        Map<String, Map<String, Integer>> citiesMap = new LinkedHashMap<>();

        while (!input.equals("report")) {
            String city = input.split("\\|")[0];
            String country = input.split("\\|")[1];
            int population = Integer.parseInt(input.split("\\|")[2]);

            countriesMap.putIfAbsent(country, 0L);
            long currentPopulation = countriesMap.get(country);
            countriesMap.put(country, currentPopulation + population);

            citiesMap.putIfAbsent(country,new LinkedHashMap<>());
            citiesMap.get(country).put(city,population);

            input = scanner.nextLine();
        }

        countriesMap.entrySet().stream()
                .sorted(Map.Entry.<String,Long>comparingByValue()
                        .reversed()).forEach(currentCountry -> {
                    System.out.printf("%s (total population: %d)%n"
                    ,currentCountry.getKey(),currentCountry.getValue());

                    citiesMap.get(currentCountry.getKey()).entrySet().stream()
                            .sorted(Map.Entry.<String,Integer>comparingByValue()
                                    .reversed()).forEach(city -> System.out.printf("=>%s: %d%n",city.getKey(),city.getValue()));
                });
    }

}
