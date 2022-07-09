package JavaProgramingFundamentals.MapsLambdAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> carsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            String command = input.split(" ")[0];
            String name = input.split(" ")[1];

            switch (command) {
                case "register":
                    String carNumber = input.split(" ")[2];
                    if (!carsMap.containsKey(name)) {
                        carsMap.put(name, carNumber);
                        System.out.printf("%s registered %s successfully%n", name, carNumber);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", carNumber);
                    }
                    break;
                case "unregister":
                    if (carsMap.containsKey(name)) {
                        carsMap.remove(name);
                        System.out.printf("%s unregistered successfully%n", name);
                    }else {
                        System.out.printf("ERROR: user %s not found%n",name);
                    }
                    break;
            }
        }

        carsMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));
    }
}
