package JavaProgramingBasics.FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int workHours = Integer.parseInt(scanner.nextLine());

        int totalNylon = nylon + 2;
        double totalPaint = paint * 1.1;

        double priceMaterials = totalNylon * 1.50 + totalPaint * 14.50 + thinner * 5 + 0.40;

        double priceWorkman = (priceMaterials * 30 / 100) * workHours;

        double totalPrice = priceMaterials + priceWorkman;

        System.out.println(totalPrice);



    }
}
