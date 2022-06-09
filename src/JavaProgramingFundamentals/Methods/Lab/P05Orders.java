package JavaProgramingFundamentals.Methods.Lab;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String orderInput = scanner.nextLine();
        int countOrderInput = Integer.parseInt(scanner.nextLine());

        double totalPrice = calculatesTheTotalPrice(orderInput, countOrderInput);
        System.out.printf("%.2f", totalPrice);

    }

    public static double calculatesTheTotalPrice(String order, int countOrder) {

        double price = 0.0;
        switch (order) {
            case "coffee":
                price = 1.5;
                break;
            case "water":
                price = 1.0;
                break;
            case "coke":
                price = 1.4;
                break;
            case "snacks":
                price = 2.0;
                break;
        }
        return price * countOrder;
    }
}
