package JavaProgramingBasics.ForLoop.MoreExercises;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());
        double billForWatter = 0.0;
        double billForInternet = 0.0;
        double totalBillForElectricity = 0.0;
        double otherBills = 0.0;

        for (int i = 0; i < months; i++) {
            double billForElectricity = Double.parseDouble(scanner.nextLine());
            totalBillForElectricity += billForElectricity;
            billForWatter += 20;
            billForInternet += 15;
            otherBills += (billForElectricity + 20 + 15) * 1.2;
        }

        System.out.printf("Electricity: %.2f lv%n",totalBillForElectricity);
        System.out.printf("Water: %.2f lv%n",billForWatter);
        System.out.printf("Internet: %.2f lv%n",billForInternet);
        System.out.printf("Other: %.2f lv%n",otherBills);
        System.out.printf("Average: %.2f lv%n",(otherBills + billForInternet + billForWatter + totalBillForElectricity)/months);
    }
}
