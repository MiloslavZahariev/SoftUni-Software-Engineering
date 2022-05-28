package JavaProgramingFundamentals.DataTypesandVariables.Lab;

import java.util.Scanner;

public class P01ConvertMetersToKilometers {
    public P01ConvertMetersToKilometers() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int meters = Integer.parseInt(scanner.nextLine());
        double kilometers = (double)meters / 1000.0D;
        System.out.printf("%.2f", kilometers);
    }
}
