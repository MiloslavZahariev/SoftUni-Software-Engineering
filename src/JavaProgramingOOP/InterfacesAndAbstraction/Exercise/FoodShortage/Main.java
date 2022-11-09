package JavaProgramingOOP.InterfacesAndAbstraction.Exercise.FoodShortage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        Map<String, Buyer> peopleMap = new HashMap<>();

        for (int i = 0; i < numberOfPeople; i++) {
            String[] personData = scanner.nextLine().split(" ");
            String name = personData[0];
            int age = Integer.parseInt(personData[1]);

            if (personData.length == 4) {
                String id = personData[2];
                String birthDate = personData[3];
                Citizen citizen = new Citizen(name, age, id, birthDate);
                peopleMap.put(name, citizen);

            } else {
                String group = personData[2];
                Rebel rebel = new Rebel(name, age, group);
                peopleMap.put(name, rebel);
            }
        }

        String searchName = scanner.nextLine();
        while (!searchName.equals("End")) {
            if (peopleMap.containsKey(searchName)) {
                peopleMap.get(searchName).buyFood();
            }
            searchName = scanner.nextLine();
        }

        int totalFood = peopleMap.values()
                .stream()
                .mapToInt(Buyer::getFood)
                .sum();


        System.out.println(totalFood);
    }
}
