package JavaProgramingFundamentals.OldExams;

import java.util.Scanner;

public class P01CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int energy = Integer.parseInt(scanner.nextLine());
        boolean flag = false;

        String input = scanner.nextLine();
        int winCount = 0;
        while (!input.equals("End of battle")) {
            int distance = Integer.parseInt(input);

            if (energy - distance >= 0) {
                winCount++;
                energy -= distance;
            }else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", winCount, energy);
                flag = true;
                break;
            }
            if (winCount % 3 == 0) {
                energy += winCount;
            }



            input = scanner.nextLine();
        }

        if (!flag) {
            System.out.printf("Won battles: %d. Energy left: %d", winCount, energy);
        }
    }
}
