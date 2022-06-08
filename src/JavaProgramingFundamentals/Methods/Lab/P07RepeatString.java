package JavaProgramingFundamentals.Methods.Lab;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();
        int nInput = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(textInput,nInput));
    }

    public static String repeatString (String text,int n){
        String result = "";
        for (int i = 0; i < n ; i++) {
            result += text;
        }

        return result;
    }
}
