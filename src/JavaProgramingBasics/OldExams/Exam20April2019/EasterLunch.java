package JavaProgramingBasics.OldExams.Exam20April2019;


import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int muffin = Integer.parseInt(scanner.nextLine());
        int eggsPackage = Integer.parseInt(scanner.nextLine());
        int cookieKilograms = Integer.parseInt(scanner.nextLine());

        double muffinPrice = 3.20;
        double eggsPackagePrice = 4.35 ;
        double cookieKilogramPrice = 5.4;
        double eggsPaintPrice = 12 * eggsPackage * 0.15;

        double totalPrice = (muffin * muffinPrice) + ( eggsPackage * eggsPackagePrice) + (cookieKilograms * cookieKilogramPrice) +eggsPaintPrice;
        System.out.printf("%.2f",totalPrice);

    }
}
