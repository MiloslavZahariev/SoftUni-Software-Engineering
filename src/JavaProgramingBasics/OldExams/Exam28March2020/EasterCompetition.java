package JavaProgramingBasics.OldExams.Exam28March2020;

import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int bestPoints = 0;
        String winnerName ="";

        for (int i = 0; i < number; i++) {
            String name = scanner.nextLine();
            String input = scanner.nextLine();
            int totalPoints = 0;
            while (!input.equals("Stop")) {
                int points = Integer.parseInt(input);
                totalPoints += points;


                input = scanner.nextLine();
            }
          if(bestPoints < totalPoints){
              winnerName = name;
              bestPoints = totalPoints;
              System.out.printf("%s has %d points.%n",winnerName,bestPoints);
              System.out.printf("%s is the new number 1!%n",winnerName);
          }else {
              System.out.printf("%s has %d points.%n",name,totalPoints);
          }

        }

        System.out.printf("%s won competition with %d points!",winnerName,bestPoints);


    }
}
