package JavaProgramingFundamentals.OldExams;

import java.util.Arrays;
import java.util.Scanner;

public class P02MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] roomsArr = scanner.nextLine().split("\\|");

        int initHealth = 100;
        int bitcoins = 0;
        int health = initHealth;
        boolean isDead = false;
        int bestRoom = 0;

        for (int i = 0; i < roomsArr.length; i++) {
            String command = roomsArr[i];

            int value = Integer.parseInt(command.split(" ")[1]);

            switch (command.split(" ")[0]) {
                case "potion":
                    if (health + value <= initHealth) {
                        health += value;
                        System.out.printf("You healed for %d hp.%n", value);
                        System.out.printf("Current health: %d hp.%n", health);
                    } else {
                        System.out.printf("You healed for %d hp.%n", initHealth - health);
                        health = initHealth;
                        System.out.printf("Current health: %d hp.%n", health);
                    }
                    break;
                case "chest":
                    bitcoins += value;
                    System.out.printf("You found %d bitcoins.%n", value);
                    break;
                default:
                    health -= value;
                    if (health > 0) {
                        System.out.printf("You slayed %s.%n", command.split(" ")[0]);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", command.split(" ")[0]);
                        isDead = true;
                    }
                    break;
            }
            bestRoom = i;
            if (isDead) {
                break;
            }
        }

        if (isDead) {
            System.out.printf("Best room: %d%n", bestRoom + 1);
        }else {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n",bitcoins);
            System.out.printf("Health: %d%n",health);
        }

    }
}
