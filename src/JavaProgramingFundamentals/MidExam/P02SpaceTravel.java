package JavaProgramingFundamentals.MidExam;

import java.util.Scanner;

public class P02SpaceTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] commandArr = scanner.nextLine().split("\\|+");

        int startingFuel = Integer.parseInt(scanner.nextLine());
        int startingAmmunition = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < commandArr.length - 1; i++) {
            String command = commandArr[i].split(" ")[0];
            int value = Integer.parseInt(commandArr[i].split(" ")[1]);


            switch (command) {
                case "Travel":
                    if (startingFuel - value >= 0) {

                        System.out.printf("The spaceship travelled %d light-years.%n", value);
                        startingFuel -= value;
                    } else {
                        System.out.println("Mission failed.");
                        return;
                    }
                    break;
                case "Enemy":
                    if (startingAmmunition - value >= 0) {
                        System.out.printf("An enemy with %d armour is defeated.%n", value);
                        startingAmmunition -= value;
                    } else if (startingFuel >= value * 2) {
                        System.out.printf("An enemy with %d armour is outmaneuvered.%n", value);
                        startingFuel -= value * 2;
                    } else {
                        System.out.println("Mission failed.");
                        return;
                    }
                    break;
                case "Repair":
                    startingFuel += value;
                    startingAmmunition += value * 2;
                    System.out.printf("Ammunitions added: %d.%n", value * 2);
                    System.out.printf("Fuel added: %d.%n", value);
                    break;
            }


        }
        System.out.printf("You have reached %s, all passengers are safe.", commandArr[commandArr.length - 1]);

    }
}
