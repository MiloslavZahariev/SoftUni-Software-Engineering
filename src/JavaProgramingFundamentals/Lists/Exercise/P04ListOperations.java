package JavaProgramingFundamentals.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String command = scanner.nextLine();
        while (!command.equals("End")) {

            if (command.contains("Add")) {
                int numberToAdd = Integer.parseInt(command.split(" ")[1]);
                numList.add(numberToAdd);
            } else if (command.contains("Insert")) {
                int numberToAdd = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                if (isIndexValid(index, numList.size())) {
                    numList.add(index, numberToAdd);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Remove")) {
                int indexToRemove = Integer.parseInt(command.split(" ")[1]);
                if (isIndexValid(indexToRemove, numList.size())) {
                    numList.remove(indexToRemove);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Shift left")) {
                int countLeft = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < countLeft; i++) {
                    int firstNumber = numList.get(0);

                    numList.add(firstNumber);
                    numList.remove(0);
                }
            } else if (command.contains("Shift right")) {
                int countRight = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < countRight; i++) {
                    int lastNumber = numList.get(numList.size() - 1);

                    numList.add(0, lastNumber);
                    numList.remove(numList.size() - 1);
                }
            }

            command = scanner.nextLine();
        }
        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
    }

    private static boolean isIndexValid(int index, int sizeOfLIst) {
        return index >= 0 && index <= sizeOfLIst - 1;
    }
}
