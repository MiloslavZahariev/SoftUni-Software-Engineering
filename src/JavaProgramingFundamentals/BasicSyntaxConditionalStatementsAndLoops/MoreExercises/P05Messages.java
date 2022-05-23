package JavaProgramingFundamentals.BasicSyntaxConditionalStatementsAndLoops.MoreExercises;
import java.util.Scanner;

public class P05Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lettersCount = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= lettersCount; i++) {
            String command = scanner.nextLine();
            int numberOfDigits = command.length();
            int mainDigit = Integer.parseInt(command);
            if (mainDigit == 0) {
                System.out.print(" ");
                continue;
            }
            mainDigit = mainDigit % 10;

            int offset = (mainDigit - 2) * 3;
            int letterIndex = 0;
            if (mainDigit == 8 || mainDigit == 9) {
                letterIndex = (offset + numberOfDigits);
            } else {
                letterIndex = (offset + numberOfDigits - 1);
            }

            System.out.printf("%c", letterIndex + 97);
        }
    }
}
