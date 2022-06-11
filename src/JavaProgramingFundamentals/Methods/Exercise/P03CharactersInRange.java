package JavaProgramingFundamentals.Methods.Exercise;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);

        if (firstSymbol < secondSymbol) {
            printSequenceOfChars(firstSymbol, secondSymbol);
        }else{
            printSequenceOfChars(secondSymbol,firstSymbol);
        }
    }

    private static void printSequenceOfChars(char a, char b) {

        for (int i = a + 1; i < b; i++) {
            System.out.printf("%c ", i);
        }
    }
}
