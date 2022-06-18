package JavaProgramingFundamentals.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstDeck = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondDeck = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (firstDeck.size() > 0 && secondDeck.size() > 0) {
            if (firstDeck.get(0) > secondDeck.get(0)) {
                int tempCard = firstDeck.get(0);
                firstDeck.remove(0);
                firstDeck.add(tempCard);
                tempCard = secondDeck.get(0);
                secondDeck.remove(0);
                firstDeck.add(tempCard);
            } else if (firstDeck.get(0).equals(secondDeck.get(0))) {
                firstDeck.remove(0);
                secondDeck.remove(0);

            } else {
                int tempCard = secondDeck.get(0);
                secondDeck.remove(0);
                secondDeck.add(tempCard);
                tempCard = firstDeck.get(0);
                firstDeck.remove(0);
                secondDeck.add(tempCard);

            }


        }
        if (firstDeck.size() >= secondDeck.size()) {
            System.out.printf("First player wins! Sum: %d", getSum(firstDeck));
        } else {
            System.out.printf("Second player wins! Sum: %d", getSum(secondDeck));
        }

    }

    private static int getSum(List<Integer> deck) {
        int sum = 0;

        for (int element : deck) {
            sum += element;
        }
        return sum;
    }
}
