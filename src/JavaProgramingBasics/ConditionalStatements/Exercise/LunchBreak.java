package JavaProgramingBasics.ConditionalStatements.Exercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String novelName = scanner.nextLine();
        int timeOfNovel = Integer.parseInt(scanner.nextLine());
        int timeOfBreak = Integer.parseInt(scanner.nextLine());

        double timeForLunch = timeOfBreak / 8.0 ;
        double timeForRest = timeOfBreak / 4.0 ;

        double clearBreakTime = timeOfBreak - timeForLunch - timeForRest;
        double abs = Math.abs(clearBreakTime - timeOfNovel);

        if (timeOfNovel <= clearBreakTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",novelName ,Math.ceil(abs));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",novelName ,Math.ceil(abs));
        }
    }
}
