package JavaProgramingFundamentals.Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            List<String> commandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = commandLine.get(0);

            int item = 0;
            String secondCommand = "";

            switch (command) {
                case "Contains":
                    item = Integer.parseInt(commandLine.get(1));
                    checkAndPrintContainsNumber(numList, item);
                    break;
                case "Print":
                    secondCommand = commandLine.get(1);
                    printEvensOrOddsNumbers(numList, secondCommand);
                    break;
                case "Get":
                    printSumOfAllElementsInList(numList);
                    break;
                case "Filter":
                    item = Integer.parseInt(commandLine.get(2));
                    secondCommand = commandLine.get(1);
                    filterAndPrintNumbersInListByConditions(numList,secondCommand,item);
                    //'<', '>', ">=", "<="
                    break;
            }


            input = scanner.nextLine();
        }

    }

    private static void filterAndPrintNumbersInListByConditions(List<Integer> numList, String secondCommand, int item) {
        for (int i = 0; i < numList.size() ; i++) {
            if(secondCommand.equals("<") && numList.get(i) < item){
                System.out.print(numList.get(i) + " ");
            }else if (secondCommand.equals(">") && numList.get(i) > item){
                System.out.print(numList.get(i) + " ");
            }else if (secondCommand.equals(">=") && numList.get(i) >= item){
                System.out.print(numList.get(i) + " ");
            }else if (secondCommand.equals("<=") && numList.get(i) <= item){
                System.out.print(numList.get(i) + " ");
            }
        }
        System.out.println();
    }

    private static void printSumOfAllElementsInList(List<Integer> numList) {
        int sum = 0 ;

        for (int i = 0; i <numList.size() ; i++) {
            sum += numList.get(i);
        }
        System.out.println(sum);
    }

    private static void printEvensOrOddsNumbers(List<Integer> numList, String secondCommand) {
        for (int i = 0; i < numList.size(); i++) {
            if (secondCommand.equals("even") && numList.get(i) % 2 == 0) {
                System.out.print(numList.get(i) + " ");
            } else if (secondCommand.equals("odd") && numList.get(i) % 2 != 0){
                System.out.print(numList.get(i) + " ");
            }
        }
        System.out.println();
    }

    private static void checkAndPrintContainsNumber(List<Integer> numList, int item) {
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) == item) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No such number");
    }
}
