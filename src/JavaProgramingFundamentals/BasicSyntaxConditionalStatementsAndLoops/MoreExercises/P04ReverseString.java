package JavaProgramingFundamentals.BasicSyntaxConditionalStatementsAndLoops.MoreExercises;
import java.util.Scanner;

public class P04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String text = scanner.nextLine();
       String reverseText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            char currentSymbol = text.charAt(i);
            reverseText += currentSymbol;
        }
        System.out.println(reverseText);

    }
}
