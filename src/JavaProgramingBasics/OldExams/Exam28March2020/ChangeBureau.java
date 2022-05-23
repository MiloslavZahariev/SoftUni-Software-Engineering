package JavaProgramingBasics.OldExams.Exam28March2020;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitCoins = Integer.parseInt(scanner.nextLine());
        double yoans = Double.parseDouble(scanner.nextLine());
        double comision = Double.parseDouble(scanner.nextLine());

        double bitCoinPrice = 1168/ 1.95; // bitcoin to  eur
        double yoansPrice = 0.15 * 1.76 / 1.95;
        double all = bitCoinPrice * bitCoins + yoans * yoansPrice;


        System.out.printf("%.2f",all * ((100 - comision)/100));
    }
}
