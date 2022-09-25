package JavaProgramingAdvanced.StreamsFilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class P02WriteToFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "resources/input.txt";

        FileInputStream i = new FileInputStream(path);

        FileOutputStream outputStream = new FileOutputStream("resources/02.WriteToFileOutput.txt");

        int bytes = i.read();

        Set<Character> punctuationTable = Set.of(',', '.', '!', '?');

        while (bytes != -1) {

            char symbol = (char) bytes;

            boolean isPunctuation = punctuationTable.contains(symbol);

            if (!isPunctuation) {
                outputStream.write(symbol);
            }


            bytes = i.read();
        }
    }
}
