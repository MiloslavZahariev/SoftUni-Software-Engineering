package JavaProgramingFundamentals.OldExams;

import java.util.Arrays;
import java.util.Scanner;

public class P02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int[] currentStateOfTheLift = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean flagForFullLift = false;

        while (people > 0 && !flagForFullLift) {

            for (int i = 0; i < currentStateOfTheLift.length; i++) {
                for (int j = currentStateOfTheLift[i]; j < 4; j++) {
                    if (people > 0) {
                        people -= 1;
                        currentStateOfTheLift[i] += 1;
                    }

                }
                if (currentStateOfTheLift[currentStateOfTheLift.length - 1] == 4) {
                    flagForFullLift = true;
                }
            }
            if (flagForFullLift && people > 0) {
                System.out.printf("There isn't enough space! %d people in a queue!%n", people);
            }
        }
        if (currentStateOfTheLift[currentStateOfTheLift.length - 1] != 4) {
            System.out.println("The lift has empty spots!");
        }
        printArray(currentStateOfTheLift);

    }

    private static void printArray(int[] currentStateOfTheLift) {
        for (int element : currentStateOfTheLift) {
            System.out.print(element + " ");
        }
    }
}
