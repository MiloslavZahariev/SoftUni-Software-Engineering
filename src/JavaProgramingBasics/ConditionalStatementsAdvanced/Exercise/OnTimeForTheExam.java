package JavaProgramingBasics.ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int comeHour = Integer.parseInt(scanner.nextLine());
        int comeMinutes = Integer.parseInt(scanner.nextLine());


        int examHourToMin = examHour * 60;
        int comeHourToMin = comeHour * 60;
        int totalExamMin = examMinutes + examHourToMin;
        int totalComeMin = comeMinutes + comeHourToMin;

        int diffMinutes = Math.abs(totalComeMin - totalExamMin);

        int hours = diffMinutes / 60;
        int minutes = diffMinutes % 60;
        String tupiMinutes = "";

        if (minutes <=9){
            tupiMinutes = "0"+minutes;
        }else {
            tupiMinutes = String.valueOf(minutes);
        }

        if (totalComeMin == totalExamMin) {
            System.out.println("On time");
        } else if (totalComeMin > totalExamMin) {
            if (diffMinutes <= 59) {
                System.out.printf("Late%n%d minutes after the start", diffMinutes);
            } else {
                System.out.printf("Late%n%d:%s hours after the start", hours, tupiMinutes);
            }
        } else if (totalComeMin + 30 >= totalExamMin) {
            if (diffMinutes <= 59) {
                System.out.printf("On time%n%d minutes before the start", diffMinutes);
            } else {
                System.out.printf("On time%n%d:%s hours before the start", hours, tupiMinutes);
            }
        } else {
            if (diffMinutes <= 59) {
                System.out.printf("Early%n%d minutes before the start", diffMinutes);
            } else {
                System.out.printf("Early%n%d:%s hours before the start", hours, tupiMinutes);
            }
        }
    }
}



