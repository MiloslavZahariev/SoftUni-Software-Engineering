package JavaProgramingBasics.OldExams.Exam20April2019;

import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double eggPrice = 0.45;
        double muffinPrice = 4;

        int eggs = guests * 2;
        double muffins = Math.ceil(guests*1.0 / 3);

        double totalEggsPrice = eggs * eggPrice;
        double totalMuffinsPrice = muffins * muffinPrice;
        double totalPrice = totalEggsPrice + totalMuffinsPrice;


        if (budget >= totalPrice ){
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.%n",muffins,eggs);
            System.out.printf("He has %.2f lv. left.",budget - totalPrice);
        }else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", totalPrice - budget);
        }

    }
}
