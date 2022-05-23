package JavaProgramingBasics.OldExams.Exam18July2020;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceForOver20kg = Double.parseDouble(scanner.nextLine());
        double bagKilograms = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int countBags = Integer.parseInt(scanner.nextLine());
        double priceForKg = 0.0;

        if (bagKilograms < 10) {
            priceForKg = priceForOver20kg * 0.2;
        } else if (bagKilograms <= 20) {
            priceForKg = priceForOver20kg * 0.5;
        } else {
            priceForKg = priceForOver20kg;
        }

        if (days > 30) {
            priceForKg = priceForKg * 1.1;
        } else if (days >= 7){
            priceForKg = priceForKg * 1.15;
        }else{
            priceForKg = priceForKg * 1.4;
        }

        System.out.printf("The total price of bags is: %.2f lv.",countBags * priceForKg);

    }
}
