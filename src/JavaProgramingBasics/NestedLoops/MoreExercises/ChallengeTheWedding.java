package JavaProgramingBasics.NestedLoops.MoreExercises;

import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countMen = Integer.parseInt(scanner.nextLine());
        int countWomen = Integer.parseInt(scanner.nextLine());
        int countTables = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean flag = false;

        for (int i = 1; i <= countMen; i++) {
            for (int j = 1; j <= countWomen; j++) {
                System.out.printf("(%d <-> %d) ", i, j);
                counter++;
                if (counter >= countTables) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }

        }

    }
}
