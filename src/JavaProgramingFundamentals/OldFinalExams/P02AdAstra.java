package JavaProgramingFundamentals.OldFinalExams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        String regex = "([\\|#])(?<itemName>[A-Za-z ]+)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]{1,4})\\1";
        Pattern pattern = Pattern.compile(regex);

        List<String> productList = new ArrayList<>();
        Matcher matcher = pattern.matcher(input);
        int totalNutrition = 0;
        while (matcher.find()) {
            totalNutrition += Integer.parseInt(matcher.group("calories"));
            String foodInfo = String.format("Item: %s, Best before: %s, Nutrition: %s", matcher.group("itemName"), matcher.group("date"), matcher.group("calories"));
            productList.add(foodInfo);
        }
        System.out.printf("You have food to last you for: %d days!%n", totalNutrition / 2000);

        for (String product : productList) {
            System.out.println(product);
        }

    }
}
