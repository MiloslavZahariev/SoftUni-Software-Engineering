package JavaProgramingFundamentals.DataTypesandVariables.Lab;

import java.util.Scanner;

public class P11RefactorVolumeOfPyramid {
    public P11RefactorVolumeOfPyramid() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = 0.0;
        System.out.print("Length: ");
        length = Double.parseDouble(scanner.nextLine());
        double width = 0.0;
        System.out.print("Width: ");
        width = Double.parseDouble(scanner.nextLine());
        double height = 0.0;
        System.out.print("Height: ");
        height = Double.parseDouble(scanner.nextLine());
        double volume = 0.0;
        volume = length * height * width / 3.0;
        System.out.printf("Pyramid Volume: %.2f", volume);
    }
}
