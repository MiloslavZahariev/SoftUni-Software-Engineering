package JavaProgramingFundamentals.DataTypesandVariables.MoreExercises;

import java.util.Scanner;

public class P03FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberA = Double.parseDouble(scanner.nextLine());
        double numberB = Double.parseDouble(scanner.nextLine());

        double eps = 0.000001;

        double compare = Math.abs(numberA - numberB);

        if (compare > eps){
            System.out.println("False");
        }else{
            System.out.println("True");
        }
    }
}
