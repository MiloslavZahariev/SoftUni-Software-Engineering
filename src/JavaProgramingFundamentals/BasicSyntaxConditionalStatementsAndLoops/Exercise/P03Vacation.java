package JavaProgramingFundamentals.BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupNumber = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();

        double discount = 1;
        double singlePrice = 0;

        switch (groupType) {
            case "Students":
                switch (day) {
                    case "Friday":
                        singlePrice = 8.45;
                        break;
                    case "Saturday":
                        singlePrice = 9.80;
                        break;
                    case "Sunday":
                        singlePrice = 10.46;
                        break;
                }
                if (groupNumber >= 30) {
                    discount = 0.85;
                }
                break;
            case "Business":
                switch (day) {
                    case "Friday":
                        singlePrice = 10.90;
                        break;
                    case "Saturday":
                        singlePrice = 15.60;
                        break;
                    case "Sunday":
                        singlePrice = 16;
                        break;
                }
                if (groupNumber >= 100) {
                    groupNumber = groupNumber - 10;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        singlePrice = 15;
                        break;
                    case "Saturday":
                        singlePrice = 20;
                        break;
                    case "Sunday":
                        singlePrice = 22.5;
                        break;
                }
                if (groupNumber >= 10 && groupNumber <= 20) {
                  discount = 0.95;
                }
                break;
        }

        double totalPrice = singlePrice * groupNumber * discount ;

        System.out.printf("Total price: %.2f",totalPrice);
    }
}
