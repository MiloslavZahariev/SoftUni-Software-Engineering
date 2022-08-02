package JavaProgramingFundamentals.OldFinalExams;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfProducts = Integer.parseInt(scanner.nextLine());
        String regex = "[@][#]+([A-Z][A-Za-z0-9]{4,}[A-Z])[@][#]+";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < numberOfProducts; i++) {
            String product = scanner.nextLine();
            Matcher matcher = pattern.matcher(product);

            if (matcher.find()) {
                String group = findingGroup(matcher.group(1));
                System.out.printf("Product group: %s%n", group);
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }

    private static String findingGroup(String group) {
        StringBuilder groupBuilder = new StringBuilder();
        for (char symbol : group.toCharArray()) {
            if (Character.isDigit(symbol)) {
                groupBuilder.append(symbol);
            }
        }
        if (groupBuilder.length() == 0) {
            return "00";
        }
        return groupBuilder.toString();
    }
}
