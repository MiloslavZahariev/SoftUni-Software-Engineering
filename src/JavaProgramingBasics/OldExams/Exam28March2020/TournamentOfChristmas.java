package JavaProgramingBasics.OldExams.Exam28March2020;

import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String finish = "";
        String winOrLose = "";
        int winCount = 0;
        int looseCount = 0;
        double dayMoney = 0;
        int dayWinCount = 0;
        int dayLoseCount = 0;

        for (int i = 1; i <= days; i++) {
            double money = 0;
            int winCountDay = 0;
            int loseCountDay = 0;
            while (true) {
                finish = scanner.nextLine();
                if (finish.equals("Finish")) {
                    break;
                } else {
                    winOrLose = scanner.nextLine();
                }
                if (winOrLose.equals("win")) {
                    winCount++;
                    winCountDay++;
                    money += 20;
                } else {
                    looseCount++;
                    loseCountDay++;
                }
            }
            if (winCountDay > loseCountDay) {
                dayMoney += money * 1.1;
                dayWinCount++;
            } else {
                dayMoney += money;
                dayLoseCount++;
            }
        }
        if (dayWinCount > dayLoseCount) {
            dayMoney = dayMoney * 1.2;

        }
        if (winCount > looseCount){
            System.out.printf("You won the tournament! Total raised money: %.2f",dayMoney);
        }else {
            System.out.printf("You lost the tournament! Total raised money: %.2f",dayMoney);
        }
    }
}
