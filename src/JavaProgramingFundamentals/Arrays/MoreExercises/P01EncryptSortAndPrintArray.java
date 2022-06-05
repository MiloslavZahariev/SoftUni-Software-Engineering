package JavaProgramingFundamentals.Arrays.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P01EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int namesCount = Integer.parseInt(scanner.nextLine());
        int[] codeNames = new int[namesCount];

        for (int i = 0; i < namesCount; i++) {
            String name = scanner.nextLine();
            int code = 0;
            for (int j = 0; j < name.length(); j++) {
                char symbol = name.charAt(j);
                switch (symbol) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        code += symbol * name.length();
                        break;
                    default:
                        code += symbol / name.length();
                }
            }
            codeNames[i] = code;
        }
        Arrays.sort(codeNames);

        for (int i = 0; i < codeNames.length; i++) {
            System.out.println(codeNames[i]);
        }
    }
}
