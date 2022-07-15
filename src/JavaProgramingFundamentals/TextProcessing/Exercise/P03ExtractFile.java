package JavaProgramingFundamentals.TextProcessing.Exercise;

import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();
        String[] foldersName = path.split("\\\\");

        String fileName = foldersName[foldersName.length - 1].split("\\.")[0];
        String extension = foldersName[foldersName.length - 1].split("\\.")[1];


        System.out.printf("File name: %s%n",fileName);
        System.out.printf("File extension: %s%n",extension);
    }
}
