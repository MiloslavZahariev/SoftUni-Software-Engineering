package JavaProgramingFundamentals.MapsLambdAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);

        Map<String, Integer> junkItems = new LinkedHashMap<>();
        boolean flag = false;
        while (!flag) {

        String input = scanner.nextLine();
        String[] inputData = input.split(" ");



            for (int i = 0; i < inputData.length; i += 2) {
                int quantity = Integer.parseInt(inputData[i]);
                String material = inputData[i + 1].toLowerCase();
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = items.get(material);
                    items.put(material, currentQuantity + quantity);
                } else {
                    if (!junkItems.containsKey(material)) {
                        junkItems.put(material, quantity);
                    } else {
                        int current = junkItems.get(material);
                        junkItems.put(material, current + quantity);
                    }
                }
                if (items.get("shards") >= 250){
                    System.out.println("Shadowmourne obtained!");
                    items.put("shards",items.get("shards") - 250);
                    flag = true;
                    break;
                }else if (items.get("fragments") >= 250){
                    System.out.println("Valanyr obtained!");
                    items.put("fragments",items.get("fragments") - 250);
                    flag = true;
                    break;
                }else if (items.get("motes") >= 250){
                    System.out.println("Dragonwrath obtained!");
                    items.put("motes",items.get("motes") - 250);
                    flag = true;
                    break;
                }

            }



        }

        items.forEach((key, value) -> System.out.println(key + ": " + value));

        junkItems.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
