package JavaProgramingFundamentals.MapsLambdAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, double[]> orderMap = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String productName = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            double quantity = Double.parseDouble(input.split(" ")[2]);
            double[] totalPriceArr = new double[]{0, 0};

            orderMap.putIfAbsent(productName, totalPriceArr);

            orderMap.get(productName)[0] = price;
            double currentQuantity = orderMap.get(productName)[1];
            orderMap.get(productName)[1] = currentQuantity + quantity;



            input = scanner.nextLine();
        }

        orderMap.forEach((key, value) -> System.out.printf("%s -> %.2f%n", key, value[0] * value[1]));
    }
}
