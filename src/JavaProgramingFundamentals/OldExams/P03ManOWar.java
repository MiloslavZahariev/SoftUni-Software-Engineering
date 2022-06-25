package JavaProgramingFundamentals.OldExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] pirateShipStatus = Arrays
                .stream(scanner.nextLine().split(">"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] warShipStatus = Arrays
                .stream(scanner.nextLine().split(">"))
                .mapToInt(Integer::parseInt)
                .toArray();


        int maximumHealthCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Retire")) {
            List<String> commandList = Arrays.stream(command.split(" ")).collect(Collectors.toList());

            switch (commandList.get(0)) {
                case "Fire":
                    if (pirateShoot(warShipStatus, commandList)) {
                        return;
                    }
                    break;
                case "Defend":
                    if (warshipShoot(pirateShipStatus, commandList)) {
                        return;
                    }
                    break;
                case "Repair":
                    repairingPirateShip(pirateShipStatus, commandList, maximumHealthCapacity);
                    break;
                case "Status":
                    statusOfPirateShip(pirateShipStatus, maximumHealthCapacity);
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.printf("Pirate ship status: %d%n",summingStatusOfAllSections(pirateShipStatus));
        System.out.printf("Warship status: %d%n",summingStatusOfAllSections(warShipStatus));
    }

    private static int summingStatusOfAllSections(int[] shipStatus) {
        int totalSectionStatus = 0;
        for (int element : shipStatus) {
            totalSectionStatus += element;
        }
        return totalSectionStatus;
    }


    private static void statusOfPirateShip(int[] pirateShipStatus, int maximumHealthCapacity) {
        double check = maximumHealthCapacity * 0.2;
        int counter = 0;
        for (int element : pirateShipStatus) {
            if (element < check) {
                counter++;
            }
        }
        System.out.printf("%d sections need repair.%n", counter);
    }

    private static void repairingPirateShip(int[] pirateShipStatus, List<String> commandList, int maximumHealthCapacity) {
        int index = Integer.parseInt(commandList.get(1));
        int health = Integer.parseInt(commandList.get(2));

        if (isValidIndex(pirateShipStatus, index)) {
            pirateShipStatus[index] += health;
            if (pirateShipStatus[index] > maximumHealthCapacity) {
                pirateShipStatus[index] = maximumHealthCapacity;
            }
        }
    }

    private static boolean warshipShoot(int[] pirateShipStatus, List<String> commandList) {
        int startIndex = Integer.parseInt(commandList.get(1));
        int endIndex = Integer.parseInt(commandList.get(2));
        int damage = Integer.parseInt(commandList.get(3));

        if (isValidIndex(pirateShipStatus, startIndex) && isValidIndex(pirateShipStatus, endIndex)) {
            for (int i = startIndex; i <= endIndex; i++) {
                pirateShipStatus[i] -= damage;
                if (pirateShipStatus[i] <= 0) {
                    System.out.println("You lost! The pirate ship has sunken.");
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean pirateShoot(int[] warShipStatus, List<String> commandList) {
        int index = Integer.parseInt(commandList.get(1));
        int damage = Integer.parseInt(commandList.get(2));

        if (isValidIndex(warShipStatus, index)) {
            warShipStatus[index] -= damage;
            if (warShipStatus[index] <= 0) {
                System.out.println("You won! The enemy ship has sunken.");
                return true;
            }
        }
        return false;
    }

    private static boolean isValidIndex(int[] warShipStatus, int index) {
        return (index >= 0 && index < warShipStatus.length);
    }
}
