package JavaProgramingAdvanced.SetsAndMapsAdvanced.Exercises;

import java.util.*;

public class P07HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, HashSet<String>> players = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {
            String[] parts = input.split(": ");
            String name = parts[0];
            String[] cards = parts[1].split(", ");

            players.putIfAbsent(name, new HashSet<>());
            for (String currentCard : cards) {
                players.get(name).add(currentCard);
            }
            input = scanner.nextLine();
        }


        for (Map.Entry<String, HashSet<String>> player : players.entrySet()) {
            String name = player.getKey();
            int points = calculatePoints(player.getValue());

            System.out.printf("%s: %d%n",name,points);
        }


        System.out.println();
    }

    private static int calculatePoints(HashSet<String> cards) {
        int point = 0;
        for (String card : cards) {
            String power = card.substring(0, card.length() - 1);
            String color = card.substring(card.length() - 1);

            point += getPower(power) * getMultiple(color);
        }
        return point;
    }

    private static int getMultiple(String color) {
        switch (color) {
            case "C":
                return 1;
            case "D":
                return 2;
            case "H":
                return 3;
            case "S":
                return 4;
        }
        return 0;
    }

    private static int getPower(String power) {
        switch (power) {
            case "1":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
        }
        return 0;
    }
}
