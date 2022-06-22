package JavaProgramingFundamentals.OldExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targetsList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String command = input.split(" ")[0];
            int index = Integer.parseInt(input.split(" ")[1]);
            int value = Integer.parseInt(input.split(" ")[2]);

            switch (command) {
                case "Shoot":
                    shooting(targetsList, value, index);
                    break;
                case "Add":
                    addingNewTarget(targetsList, value, index);
                    break;
                case "Strike":
                    strikeTargets(targetsList, value, index);
                    break;
            }

            input = scanner.nextLine();
        }

        printingResult(targetsList);

    }

    private static void printingResult(List<Integer> targetsList) {
        for (int i = 0; i < targetsList.size(); i++) {
            if (i != targetsList.size() - 1){
                System.out.print(targetsList.get(i) + "|");
            }else{
                System.out.print(targetsList.get(i));
            }
        }
    }

    private static void strikeTargets(List<Integer> targetsList, int value, int index) {
        if (isValidIndex(targetsList, index)) {
            int diameter = (value * 2) + 1;
            if (isValidIndex(targetsList, index - value) && isValidIndex(targetsList, index + value)) {
                for (int i = 0; i < diameter; i++) {
                    targetsList.remove(index - value);
                }
            } else {
                System.out.println("Strike missed!");
            }
        }
    }

    private static void addingNewTarget(List<Integer> targetsList, int value, int index) {
        if (isValidIndex(targetsList, index)) {
            targetsList.add(index, value);
        } else {
            System.out.println("Invalid placement!");
        }
    }

    private static void shooting(List<Integer> targetsList, int value, int index) {
        if (isValidIndex(targetsList, index)) {
            int currentDurability = targetsList.get(index);
            if (currentDurability - value > 0) {
                targetsList.set(index, currentDurability - value);
            } else {
                targetsList.remove(index);
            }

        }
    }

    private static boolean isValidIndex(List<Integer> targetsList, int index) {
        return targetsList.size() > index && index >= 0;
    }
}
