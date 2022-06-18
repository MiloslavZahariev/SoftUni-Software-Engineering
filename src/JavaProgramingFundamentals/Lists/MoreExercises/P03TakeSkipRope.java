package JavaProgramingFundamentals.Lists.MoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String encryptedMessage = scanner.nextLine();

        List<Integer> numberList = new ArrayList<>();
        List<Character> nonNumberList = new ArrayList<>();

        fillingLists(encryptedMessage, numberList, nonNumberList);

        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();

        fillingTakeAndSkipLists(numberList, takeList, skipList);

        int counter = 0;
        for (int i = 0; i < takeList.size(); i++) {

            for (int j = 0; j < takeList.get(i); j++) {
                if (counter < nonNumberList.size()) {
                    System.out.print(nonNumberList.get(counter));
                    counter++;
                }
            }

            for (int j = 0; j < skipList.get(i); j++) {
                counter++;
            }
        }

    }

    private static void fillingTakeAndSkipLists(List<Integer> list, List<Integer> takeList, List<Integer> skipList) {
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                takeList.add(list.get(i));
            } else {
                skipList.add(list.get(i));
            }
        }
    }

    private static void fillingLists(String encryptedMessage, List<Integer> numberList, List<Character> nonNumberList) {
        for (int i = 0; i < encryptedMessage.length(); i++) {
            char symbol = encryptedMessage.charAt(i);
            int index = symbol - 48;
            if (symbol >= '0' && symbol <= '9') {
                numberList.add(index);
            } else {
                nonNumberList.add(symbol);
            }
        }
    }
}
