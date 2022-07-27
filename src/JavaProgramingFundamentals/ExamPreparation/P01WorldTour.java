package JavaProgramingFundamentals.ExamPreparation;

import java.util.Scanner;

public class P01WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String stops = scanner.nextLine();

        StringBuilder stopBuilder = new StringBuilder(stops);

        String command = scanner.nextLine();

        while (!command.equals("Travel")) {
            if (command.contains("Add Stop")) {
                int index = Integer.parseInt(command.split(":")[1]);
                String stop = command.split(":")[2];

                if (isValidIndex(index, stopBuilder)) {
                    stopBuilder.insert(index, stop);
                }

            } else if (command.contains("Remove Stop")) {
                int startIndex = Integer.parseInt(command.split(":")[1]);
                int endIndex = Integer.parseInt(command.split(":")[2]);
                if (isValidIndex(startIndex, stopBuilder) && isValidIndex(endIndex, stopBuilder)) {
                    stopBuilder.delete(startIndex, endIndex + 1);
                }

            } else if (command.contains("Switch")) {
                String oldDestination = command.split(":")[1];
                String newDestination = command.split(":")[2];
                if (stopBuilder.toString().contains(oldDestination)) {
                    String updateText = stopBuilder.toString().replace(oldDestination, newDestination);
                    stopBuilder = new StringBuilder(updateText);
                }
            }

            System.out.println(stopBuilder.toString());
            command = scanner.nextLine();
        }

        System.out.println("Ready for world tour! Planned stops: " + stopBuilder);


    }

    private static boolean isValidIndex(int index, StringBuilder stopBuilder) {
        return index >= 0 && index < stopBuilder.length();
    }
}
