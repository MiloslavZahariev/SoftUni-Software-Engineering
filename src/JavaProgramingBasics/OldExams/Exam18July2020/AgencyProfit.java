package JavaProgramingBasics.OldExams.Exam18July2020;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String avioCompany = scanner.nextLine();
        int ticketAdult = Integer.parseInt(scanner.nextLine());
        int ticketKids = Integer.parseInt(scanner.nextLine());
        double ticketAdultPrice = Double.parseDouble(scanner.nextLine());
        double debs = Double.parseDouble(scanner.nextLine());
        double profit = 0;

        double ticketKidsPrice = ticketAdultPrice * 0.3;

        profit = ((ticketAdult * ticketAdultPrice + ticketKids * ticketKidsPrice) + (ticketAdult + ticketKids) * debs) *0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",avioCompany,profit);

    }
}
