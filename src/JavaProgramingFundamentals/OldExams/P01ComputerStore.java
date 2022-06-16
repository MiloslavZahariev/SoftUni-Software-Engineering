package JavaProgramingFundamentals.OldExams;

import java.util.Scanner;

public class P01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double totalPriceWithoutTax = 0;
        double discount = 0.9;

        while (!input.equals("special") && !input.equals("regular")) {
            double price = Double.parseDouble(input);
            if (price >= 0) {
                totalPriceWithoutTax += price;
            } else {
                System.out.println("Invalid price!");
            }

            input = scanner.nextLine();
        }
        double totalPrice = 0;
        if (input.equals("special")) {
            totalPrice = (totalPriceWithoutTax * 1.2) * discount;
        } else {
            totalPrice = totalPriceWithoutTax * 1.2;
        }

        if (totalPrice > 0){
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n",totalPriceWithoutTax);
            System.out.printf("Taxes: %.2f$%n",totalPriceWithoutTax * 0.2);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$%n",totalPrice);

        }else {
            System.out.println("Invalid order!");
        }
    }
}
