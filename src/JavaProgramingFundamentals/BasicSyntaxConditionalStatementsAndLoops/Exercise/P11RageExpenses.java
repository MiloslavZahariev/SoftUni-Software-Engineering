package JavaProgramingFundamentals.BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gameLost = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetCount = gameLost / 2;
        int mouseCount = gameLost / 3;
        int keyboardCount = gameLost / 6;
        int displayCount = gameLost / 12;

        double totalSum = (headsetCount * headsetPrice) + (mouseCount * mousePrice) + (keyboardCount * keyboardPrice) + (displayCount * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.",totalSum);

    }
}
