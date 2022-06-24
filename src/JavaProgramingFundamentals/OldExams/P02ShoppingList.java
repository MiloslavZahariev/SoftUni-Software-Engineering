package JavaProgramingFundamentals.OldExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> productList =
                Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList
                        ());


        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")) {
            String command = input.split(" ")[0];
            String item = input.split(" ")[1];

            switch (command) {
                case "Urgent":
                    addingItemStartOfList(productList,item);
                    break;
                case "Unnecessary":
                    removingItemOfList(productList,item);
                    break;
                case "Correct":
                    String correctItem = input.split(" ")[2];
                    correctingItemName(productList,item,correctItem);
                    break;
                case "Rearrange":
                    rearrangeItem(productList,item);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println(productList.toString().replaceAll("[\\[\\]]", ""));
    }

    private static void rearrangeItem(List<String> productList, String item) {
        if(productList.contains(item)){
            productList.remove(item);
            productList.add(item);
        }
    }

    private static void correctingItemName(List<String> productList, String item, String correctItem) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).equals(item)){
                productList.set(i,correctItem);
            }
        }
    }

    private static void removingItemOfList(List<String> productList, String item) {
            productList.remove(item);

    }

    private static void addingItemStartOfList(List<String> productList, String item) {
        if (!productList.contains(item)){
           productList.add(0,item);
        }


    }
}
