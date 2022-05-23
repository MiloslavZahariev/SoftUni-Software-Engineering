package JavaProgramingBasics.FirstStepsInCoding.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area = Double.parseDouble(scanner.nextLine());
        double discount = area * 7.61 * 0.18;
        double finalPrice = area * 7.61 - discount;

        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
