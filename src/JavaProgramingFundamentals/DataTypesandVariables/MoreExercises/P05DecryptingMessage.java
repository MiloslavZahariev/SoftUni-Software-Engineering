package JavaProgramingFundamentals.DataTypesandVariables.MoreExercises;

import java.util.Scanner;

public class P05DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte key = Byte.parseByte(scanner.nextLine());
        byte interval = Byte.parseByte(scanner.nextLine());

        for (int i = 0; i < interval ; i++) {
            char symbol = scanner.nextLine().charAt(0);
            System.out.printf("%c",symbol + key);
        }
    }
}
