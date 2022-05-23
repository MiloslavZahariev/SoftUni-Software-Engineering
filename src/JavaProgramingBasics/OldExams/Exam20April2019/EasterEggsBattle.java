package JavaProgramingBasics.OldExams.Exam20April2019;

import java.util.Scanner;

public class EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countEggsFirstPlayer = Integer.parseInt(scanner.nextLine());
        int countEggsSecondPlayer = Integer.parseInt(scanner.nextLine());
        boolean flag = false;

        String input = scanner.nextLine();

        while (!input.equals("End of battle")) {
            if (input.equals("one")) {
                countEggsSecondPlayer--;
            } else if (input.equals("two")) {
                countEggsFirstPlayer--;
            }
            if (countEggsFirstPlayer == 0 || countEggsSecondPlayer == 0) {
                flag = true;
                break;
            }
            input = scanner.nextLine();
        }

        if (flag && countEggsFirstPlayer > countEggsSecondPlayer) {
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.", countEggsFirstPlayer);
        } else if (flag && countEggsSecondPlayer > countEggsFirstPlayer) {
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.", countEggsSecondPlayer);
        } else {
            System.out.printf("Player one has %d eggs left.%n", countEggsFirstPlayer);
            System.out.printf("Player two has %d eggs left.%n", countEggsSecondPlayer);
        }
    }
}
