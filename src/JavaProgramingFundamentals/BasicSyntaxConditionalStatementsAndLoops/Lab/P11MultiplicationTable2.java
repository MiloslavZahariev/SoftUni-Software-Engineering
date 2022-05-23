package JavaProgramingFundamentals.BasicSyntaxConditionalStatementsAndLoops.Lab;
import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        if (times > 10) {
            System.out.printf("%d X %d = %d%n", num, times, num * times);
        } else {
            for (int i = times; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", num, i, num * i);
            }

        }
    }
}
