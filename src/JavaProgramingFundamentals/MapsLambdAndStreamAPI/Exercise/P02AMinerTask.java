package JavaProgramingFundamentals.MapsLambdAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> resourceMap = new LinkedHashMap<>();

        while (true){
            String resource = scanner.nextLine();
            if(resource.equals("stop")){
                break;
            }
            int quantity = Integer.parseInt(scanner.nextLine());

            resourceMap.putIfAbsent(resource,0);
            int currentQuantity = resourceMap.get(resource);
            resourceMap.put(resource,currentQuantity + quantity);

        }

        resourceMap.forEach((key, value) -> System.out.println(key + " -> " + value));

    }
}
