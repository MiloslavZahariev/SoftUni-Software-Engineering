package JavaProgramingBasics.OldExams.Exam18July2020;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String delivery = scanner.nextLine();
        double discount = 0;
        double priceForOne = 0.0;
        double deliveryPrice = 0.0;

        if (count <= 10) {
            System.out.println("Invalid order");
        }
        switch (type) {
            case "90X130":
                priceForOne = 110;
                if (count > 10 && count <= 30) {
                    discount = 1;
                } else if (count <= 60) {
                    discount = 0.95;
                } else {
                    discount = 0.92;
                }
                break;
            case "100X150":
                priceForOne = 140;
                if (count > 10 && count <= 40) {
                    discount = 1;
                } else if (count <= 60) {
                    discount = 0.94;
                } else {
                    discount = 0.90;
                }
                break;
            case "130X180":
                priceForOne = 190;
                if (count > 10 && count <= 20) {
                    discount = 1;
                } else if (count <= 50) {
                    discount = 0.93;
                } else {
                    discount = 0.88;
                }
                break;
            case "200X300":
                priceForOne = 250;
                if (count > 10 && count <= 25) {
                    discount = 1;
                } else if (count <= 50) {
                    discount = 0.91;
                } else {
                    discount = 0.86;
                }
                break;


        }

        if (delivery.equals("With delivery")) {
            deliveryPrice = 60;
        }
        double totalPrice = (priceForOne * count * discount) + deliveryPrice;

        if (count > 99) {
            totalPrice = totalPrice * 0.96;
        }
        if (count > 10) {
            System.out.printf("%.2f BGN", totalPrice);
        }
    }
}
