package JavaProgramingBasics.ForLoop.MoreExercises;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int priceForWeight = 0;
        int totalWeight = 0;
        double busWeight =0.0;
        double truckWeight =0.0;
        double trainWeight =0.0;

        for (int i = 0; i < count; i++) {
            int weight = Integer.parseInt(scanner.nextLine());

            if (weight <= 3) {
                priceForWeight += weight * 200;
                totalWeight += weight;
                busWeight += weight;
            } else if (weight <= 11) {
                priceForWeight += weight * 175;
                totalWeight += weight;
                truckWeight += weight;
            } else {
                priceForWeight += weight * 120;
                totalWeight += weight;
                trainWeight += weight;
            }

        }
        System.out.printf("%.2f%n", priceForWeight * 1.0 / totalWeight);
        System.out.printf("%.2f%%%n", busWeight*100 / totalWeight);
        System.out.printf("%.2f%%%n", truckWeight*100 / totalWeight);
        System.out.printf("%.2f%%%n", trainWeight*100 / totalWeight);
    }
}
