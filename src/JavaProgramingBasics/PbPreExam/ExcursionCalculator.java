package JavaProgramingBasics.PbPreExam;

import java.util.Scanner;

public class ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double discount = 1;
        double pricePerPerson =0;

        if (people <= 5) {
            switch (season) {
                case "spring":
                    pricePerPerson = 50.0;
                    break;
                case "summer":
                    pricePerPerson = 48.5;
                    discount = 0.85;
                    break;
                case "autumn":
                    pricePerPerson = 60.0;
                    break;
                case "winter":
                    pricePerPerson = 86.0;
                    discount = 1.08;
                    break;
            }
        }else{
            switch (season) {
                case "spring":
                    pricePerPerson = 48.0;
                    break;
                case "summer":
                    pricePerPerson = 45.0;
                    discount = 0.85;
                    break;
                case "autumn":
                    pricePerPerson = 49.5;
                    break;
                case "winter":
                    pricePerPerson = 85.0;
                    discount = 1.08;
                    break;
            }

        }
        double totalPrice = people * pricePerPerson * discount;

        System.out.printf("%.2f leva.",totalPrice);
    }
}
