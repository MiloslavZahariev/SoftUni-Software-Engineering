package JavaProgramingAdvanced.StreamsFilesAndDirectories.Lab;

import java.io.*;
import java.util.Scanner;

public class P05WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "resources/input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        FileOutputStream outputStream = new FileOutputStream("every-third-line.txt");

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));

        String line = reader.readLine();

        int lineCounter = 1;

        while (line != null) {

            if (lineCounter % 3 == 0) {
                writer.write(line);
                writer.newLine();
            }

            line = reader.readLine();
            lineCounter++;
        }

        reader.close();

        writer.close();
    }
}
