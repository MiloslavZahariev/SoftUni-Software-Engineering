package JavaProgramingBasics.OldExams.Exam20April2019;

import java.util.Scanner;

public class EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countEggs = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        boolean flag = false;
        int eggsSold = 0;

        while (!input.equals("Close")) {
        int eggs = Integer.parseInt(scanner.nextLine());
            if (input.equals("Buy")) {
                countEggs -= eggs;
                eggsSold += eggs;
            } else {
                countEggs += eggs;
            }

            if (countEggs < 0) {
                countEggs += eggs;
                flag = true;
                break;
            }
            input = scanner.nextLine();
        }

        if (!flag) {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", eggsSold);
        }else {
            System.out.println("Not enough eggs in store!");
            System.out.printf("You can buy only %d.",countEggs);

        }

    }
}
