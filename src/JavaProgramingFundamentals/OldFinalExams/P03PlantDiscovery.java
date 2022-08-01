package JavaProgramingFundamentals.OldFinalExams;

import java.util.*;

public class P03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> plantMap = new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {
            String input = scanner.nextLine();

            String plant = input.split("<->")[0];
            String rarity = input.split("<->")[1];
            List<String> plantInfo = new ArrayList<>();
            plantInfo.add(rarity);
            plantMap.put(plant, plantInfo);
        }

        String input = scanner.nextLine();

        while (!input.equals("Exhibition")) {
            String command = input.split(": ")[0];
            String plantValue = input.split(": ")[1];
            if (command.equals("Rate")) {
                String plant = plantValue.split(" - ")[0];
                String rate = plantValue.split(" - ")[1];
                if (plantMap.containsKey(plant)) {
                    plantMap.get(plant).add(rate);
                } else {
                    System.out.println("error");
                }

            } else if (command.equals("Update")) {
                String plant = plantValue.split(" - ")[0];
                String newRarity = plantValue.split(" - ")[1];
                if (plantMap.containsKey(plant)) {
                    plantMap.get(plant).set(0, newRarity);
                } else {
                    System.out.println("error");
                }

            } else if (command.equals("Reset")) {
                String plant = plantValue.split(" - ")[0];
                if (plantMap.containsKey(plant)) {
                    List<String> rarity = new ArrayList<>();
                    rarity.add(plantMap.get(plant).get(0));
                    plantMap.put(plant, rarity);
                } else {
                    System.out.println("error");
                }
            }


            input = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, List<String>> entry : plantMap.entrySet()) {
            System.out.printf("- %s; Rarity: %s; Rating: %.2f%n", entry.getKey(), entry.getValue().get(0), calculateAverageRating(entry.getValue()));
        }


    }

    private static double calculateAverageRating(List<String> value) {
        double averageRating = 0.00;
        int counter = 0;
        for (int i = 1; i < value.size(); i++) {
            averageRating += Double.parseDouble(value.get(i));
            counter++;
        }
        if (counter > 0) {
            return averageRating / counter;
        } else {
            return averageRating;
        }
    }
}
