package JavaProgramingFundamentals.RegularExpressions.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> furnitureArr = new ArrayList<>();
        double totalSum = 0;

        String regex = ">>(?<furnitureName>\\w+)<<(?<price>\\d+.?\\d*)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);


        String input = scanner.nextLine();
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String furniture = matcher.group("furnitureName");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furnitureArr.add(furniture);
                totalSum += price * quantity;
            }


            input = scanner.nextLine();
        }


        System.out.println("Bought furniture:");
        furnitureArr.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f",totalSum);
    }
}
