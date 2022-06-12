package JavaProgramingFundamentals.Methods.MoreExercises;

import java.util.Scanner;

public class P01DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();

        switch (firstInput) {
            case "int":
                int integerInput = Integer.parseInt(scanner.nextLine());
                printingData(integerInput);
                break;
            case "real":
                double doubleInput = Double.parseDouble(scanner.nextLine());
                printingData(doubleInput);
                break;
            case "string":
                String stringInput = scanner.nextLine();
                printingData(stringInput);
                break;
        }
    }

    private static void printingData (int n ){
        System.out.println(n * 2);
    }
    private static void printingData (double n ){
        System.out.printf("%.2f", n * 1.5);
    }
    private static void printingData (String n ){
        System.out.println("$" + n + "$");
    }

}
