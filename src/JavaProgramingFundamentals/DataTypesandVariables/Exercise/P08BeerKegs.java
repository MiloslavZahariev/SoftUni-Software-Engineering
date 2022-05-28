package JavaProgramingFundamentals.DataTypesandVariables.Exercise;

import java.util.Scanner;

public class P08BeerKegs {
    public P08BeerKegs() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double maxVolume = 4.9E-324D;
        String maxModel = "";

        for(int i = 1; i <= n; ++i) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = 3.141592653589793D * Math.pow(radius, 2.0D) * (double)height;
            if (volume > maxVolume) {
                maxVolume = volume;
                maxModel = model;
            }
        }

        System.out.println(maxModel);
    }
}
