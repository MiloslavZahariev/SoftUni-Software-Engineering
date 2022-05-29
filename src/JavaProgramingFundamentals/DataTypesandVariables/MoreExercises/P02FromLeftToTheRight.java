
package JavaProgramingFundamentals.DataTypesandVariables.MoreExercises;

import java.util.Scanner;

public class P02FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersOfLines = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < numbersOfLines; i++) {

            long number1 = scanner.nextLong();
            long number2 = scanner.nextLong();

          long  bigNumber = Math.abs(Math.max(number1, number2));

            int sum = 0;
            while (bigNumber > 0){
                sum += bigNumber % 10;
                bigNumber /= 10;


        }
            System.out.println(sum );
    }


}

}
