package JavaProgramingFundamentals.Methods.Exercise;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();

        printMiddleCharacters(textInput);

    }
    private static void printMiddleCharacters (String text){
        int indexOfMiddleCharacter = text.length()/2;
        if ( text.length() % 2 == 0){

            System.out.println(text.charAt(indexOfMiddleCharacter-1)  + "" + text.charAt(indexOfMiddleCharacter));
        }else {
            System.out.println(text.charAt(indexOfMiddleCharacter));
        }
    }
}
