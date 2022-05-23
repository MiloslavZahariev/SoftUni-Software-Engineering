package JavaProgramingBasics.OldExams.Exam28March2020;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesOfWalks = Integer.parseInt(scanner.nextLine());
        int countsOfWalks = Integer.parseInt(scanner.nextLine());
        int takenCalories = Integer.parseInt(scanner.nextLine());

        int burnedCalories = minutesOfWalks * 5 * countsOfWalks;

        if (takenCalories <= burnedCalories *2){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.",burnedCalories);
        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.",burnedCalories);
        }
    }
}
