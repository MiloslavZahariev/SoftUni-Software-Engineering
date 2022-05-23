package JavaProgramingBasics.ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volumeInLiters = Integer.parseInt(scanner.nextLine());
        int p1Debit = Integer.parseInt(scanner.nextLine());
        int p2Debit = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double allDebit = p1Debit * hours + p2Debit * hours;
        double diff = Math.abs(volumeInLiters - allDebit);
        double percentageBothPipes = (allDebit / volumeInLiters * 100);
        double percentagePipe1 = ((p1Debit * hours) / allDebit * 100);
        double percentagePipe2 = ((p2Debit * hours) / allDebit * 100);
        if ( volumeInLiters >= allDebit){
        System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percentageBothPipes , percentagePipe1 , percentagePipe2);

        }else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours , diff);
        }

        }
}
