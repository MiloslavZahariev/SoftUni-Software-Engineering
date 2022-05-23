package JavaProgramingBasics.PbPreExam;

import java.util.Scanner;

public class PCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceProcessor = Double.parseDouble(scanner.nextLine());
        double priceVideoCard = Double.parseDouble(scanner.nextLine());
        double priceRAM = Double.parseDouble(scanner.nextLine());
        int countRAM = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double processorAndCardPrice = ((priceProcessor + priceVideoCard) - (discount * (priceProcessor + priceVideoCard))) * 1.57;
        double totalRAMPrice = priceRAM * countRAM * 1.57;

        double totalPrice = totalRAMPrice + processorAndCardPrice;

        System.out.printf("Money needed - %.2f leva.",totalPrice);

    }
}
