package JavaProgramingFundamentals.OldFinalExams;

import java.util.*;

public class P03Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        Map<String, List<Integer>> citiesMap = new LinkedHashMap<>();


        while (!input.equals("Sail")) {
            String city = input.split("\\|\\|")[0];
            int population = Integer.parseInt(input.split("\\|\\|")[1]);
            int gold = Integer.parseInt(input.split("\\|\\|")[2]);
            List<Integer> cityInfo = new ArrayList<>();
            cityInfo.add(0);
            cityInfo.add(0);
            citiesMap.putIfAbsent(city, cityInfo);
            citiesMap.get(city).set(0, population + citiesMap.get(city).get(0));
            citiesMap.get(city).set(1, gold + citiesMap.get(city).get(1));
            input = scanner.nextLine();
        }

        String commandLine = scanner.nextLine();
        while (!commandLine.equals("End")) {
            String command = commandLine.split("=>")[0];
            String town = commandLine.split("=>")[1];

            if (command.equals("Plunder")) {
                int people = Integer.parseInt(commandLine.split("=>")[2]);
                int gold = Integer.parseInt(commandLine.split("=>")[3]);

                int currentPeople = citiesMap.get(town).get(0);
                int currentGold = citiesMap.get(town).get(1);

                citiesMap.get(town).set(0, currentPeople - people);
                citiesMap.get(town).set(1, currentGold - gold);

                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);
                if (citiesMap.get(town).get(0) <= 0 || citiesMap.get(town).get(1) <= 0) {
                    citiesMap.remove(town);
                    System.out.printf("%s has been wiped off the map!%n", town);
                }

            } else if (command.equals("Prosper")) {
                int gold = Integer.parseInt(commandLine.split("=>")[2]);
                if (gold < 0) {
                    System.out.println("Gold added cannot be a negative number!");
                } else {
                    int currentGold = citiesMap.get(town).get(1);
                    int totalGold = currentGold + gold;
                    citiesMap.get(town).set(1, totalGold);

                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, town, totalGold);
                }

            }
            commandLine = scanner.nextLine();
        }

        if (citiesMap.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", citiesMap.size());

            for (Map.Entry<String, List<Integer>> entry : citiesMap.entrySet()) {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
            }
        }

    }
}
