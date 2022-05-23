package JavaProgramingBasics.FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentageOfUse = Double.parseDouble(scanner.nextLine());

        double volumeOfTank = length * width * height / 1000.0;
        double waterLiters = volumeOfTank - ( percentageOfUse * volumeOfTank /100 ) ;

        System.out.println(waterLiters);





    }
}
