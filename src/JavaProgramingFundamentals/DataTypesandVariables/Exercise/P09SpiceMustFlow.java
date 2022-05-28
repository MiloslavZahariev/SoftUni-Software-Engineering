package JavaProgramingFundamentals.DataTypesandVariables.Exercise;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public P09SpiceMustFlow() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int source = Integer.parseInt(scanner.nextLine());
        int days = 0;

        int totalSpices;
        for(totalSpices = 0; source >= 100; source -= 10) {
            int spices = source - 26;
            totalSpices += spices;
            ++days;
        }

        System.out.println(days);
        if (totalSpices >= 26) {
            totalSpices -= 26;
        }

        System.out.println(totalSpices);
    }
}
