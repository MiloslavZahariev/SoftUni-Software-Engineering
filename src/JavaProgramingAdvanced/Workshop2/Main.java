package JavaProgramingAdvanced.Workshop2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String[] commandLine = scanner.nextLine().split(" ");

            switch (commandLine[0]) {
                case "Add":
                    list.addLast(Integer.parseInt(commandLine[1]));
                    break;
                case "Remove":

                   list.removeFirstValue(Integer.parseInt(commandLine[1]));
                    break;
            }

        }

        System.out.println(list.getSize());
        for (Integer i : list) {
            System.out.print(i + " ");
        }

        System.out.println();


    }
}
