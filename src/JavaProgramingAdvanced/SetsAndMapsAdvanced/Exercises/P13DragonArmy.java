package JavaProgramingAdvanced.SetsAndMapsAdvanced.Exercises;

import java.util.*;

public class P13DragonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOfDragons = Integer.parseInt(scanner.nextLine());

        double healthDefault = 250;
        double damageDefault = 45;
        double armorDefault = 10;

        Map<String, Map<String, Double[]>> typesMap = new LinkedHashMap<>();

        for (int i = 0; i < numberOfDragons; i++) {
            String[] input = scanner.nextLine().split(" ");
            String type = input[0];
            String name = input[1];
            double damage = input[2].equals("null") ? damageDefault : Double.parseDouble(input[2]);
            double health = input[3].equals("null") ? healthDefault : Double.parseDouble(input[3]);
            double armor = input[4].equals("null") ? armorDefault : Double.parseDouble(input[4]);

            typesMap.putIfAbsent(type, new TreeMap<>());
            typesMap.get(type).putIfAbsent(name, new Double[3]);

            typesMap.get(type).get(name)[0] = damage;
            typesMap.get(type).get(name)[1] = health;
            typesMap.get(type).get(name)[2] = armor;

        }

        for (Map.Entry<String, Map<String, Double[]>> entry : typesMap.entrySet()) {
            System.out.printf("%s::", entry.getKey());
            printingAverageStats(entry);
            printingDragons(entry.getValue());
        }

    }

    private static void printingDragons(Map<String, Double[]> value) {
        for (Map.Entry<String, Double[]> entry : value.entrySet()) {
            System.out.printf("-%s -> damage: %.0f, health: %.0f, armor: %.0f%n", entry.getKey()
                    , entry.getValue()[0], entry.getValue()[1], entry.getValue()[2]);
        }

    }

    private static void printingAverageStats(Map.Entry<String, Map<String, Double[]>> entry) {
        double avgDamage = 0;
        double avgHealth = 0;
        double avgArmor = 0;

        for (Map.Entry<String, Double[]> stringEntry : entry.getValue().entrySet()) {
            avgDamage += stringEntry.getValue()[0];
            avgHealth += stringEntry.getValue()[1];
            avgArmor += stringEntry.getValue()[2];
        }
        System.out.printf("(%.2f/%.2f/%.2f)%n", avgDamage / entry.getValue().size()
                , avgHealth / entry.getValue().size()
                , avgArmor / entry.getValue().size());
    }

}
