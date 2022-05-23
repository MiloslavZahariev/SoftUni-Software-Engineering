package JavaProgramingBasics.ForLoop.Exercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageLily = Integer.parseInt(scanner.nextLine());
        double washerPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int savedMoney = 0;
        int toys = 0;

        for (int i = 2; i <= ageLily ; i+=2) {
            savedMoney += ((i/2) * 10) - 1; // saved money without brother`s debs :)
        }
        for (int j = 1; j <= ageLily; j+=2) {
            toys++;
        }
        double totalMoney = savedMoney + (toys * toyPrice);
        if(totalMoney >= washerPrice) {
            System.out.printf("Yes! %.2f",Math.abs(totalMoney - washerPrice));
        }else {
            System.out.printf("No! %.2f",Math.abs(totalMoney - washerPrice));
        }
    }
}
