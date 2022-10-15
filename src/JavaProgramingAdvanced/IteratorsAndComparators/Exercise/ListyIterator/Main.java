package JavaProgramingAdvanced.IteratorsAndComparators.Exercise.ListyIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ListyIterator listyIterator = new ListyIterator();

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] commandLine = input.split(" ");

            switch (commandLine[0]) {
                case "Create":
                    String[] strings = Arrays.copyOfRange(commandLine, 1, commandLine.length);
                    listyIterator.create(strings);
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "Print":
                    try {
                        listyIterator.print();
                    }catch (IllegalStateException e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case "PrintAll":
                    listyIterator.printAll();
                    break;
            }


            input = scanner.nextLine();
        }
        System.out.println();
    }
}
