package JavaProgramingFundamentals.BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int stopNum = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = startNum; i <= stopNum ; i++) {
            System.out.printf("%d ",i);
            sum += i;
        }
        System.out.println();
        System.out.printf("Sum: %d",sum);
    }
}
