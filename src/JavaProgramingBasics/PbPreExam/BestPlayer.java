package JavaProgramingBasics.PbPreExam;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int goals = 0;
        int hatTrick = 0;
        int bestResult = 0;
        String winName = "";

        while (true) {
            name = scanner.nextLine();
            if (name.equals("END")) {
                break;
            }
            goals = Integer.parseInt(scanner.nextLine());
            if (goals >= 3) {
                hatTrick = 1;
            }
            if (goals > bestResult) {
                winName = name;
                bestResult = goals;
            }
            if (goals >= 10) {
                break;
            }
        }
        System.out.printf("%s is the best player!%n",winName);
        if (hatTrick == 1){
            System.out.printf("He has scored %d goals and made a hat-trick !!!",bestResult);
        }else {
            System.out.printf("He has scored %d goals.",bestResult);
        }
    }
}