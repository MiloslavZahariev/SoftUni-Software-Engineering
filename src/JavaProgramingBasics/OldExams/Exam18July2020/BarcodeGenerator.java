package JavaProgramingBasics.OldExams.Exam18July2020;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secNumber = Integer.parseInt(scanner.nextLine());

        int firstNumber1 = firstNumber / 1000;
        int firstNumber2 = (firstNumber / 100) % 10;
        int firstNumber3 = (firstNumber / 10) % 10;
        int firstNumber4 = firstNumber % 10;

        int secNumber1 = secNumber / 1000;
        int secNumber2 = (secNumber / 100) % 10;
        int secNumber3 = (secNumber / 10) % 10;
        int secNumber4 = secNumber % 10;

        int newNumber1 = 0;
        int newNumber2 = 0;
        int newNumber3 = 0;
        int newNumber4 = 0;


        for (int i = firstNumber1; i <= secNumber1; i++) {
            if (i % 2 != 0) {
                newNumber1 = i;
                for (int j = firstNumber2; j <= secNumber2; j++) {
                    if (j % 2 != 0) {
                        newNumber2 = j;
                        for (int k = firstNumber3; k <= secNumber3; k++) {
                            if (k % 2 != 0) {
                                newNumber3 = k;
                                for (int l = firstNumber4; l <= secNumber4; l++) {
                                    if (l % 2 != 0) {
                                        newNumber4 = l;

                                        System.out.printf("%d%d%d%d ", newNumber1,newNumber2,newNumber3,newNumber4);


                                    }
                                }

                            }
                        }
                    }
                }


            }
        }
    }
}