package JavaProgramingAdvanced.StreamsFilesAndDirectories.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P01SumLines {
    public static void main(String[] args) throws IOException {


        String path = "resources/01._Sum Lines_Ресурси/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        String line = bufferedReader.readLine();
        while (line != null) {
            long sum = 0;
            char[] characterFromLine = line.toCharArray();
            for ( char character : characterFromLine) {
                sum += character;
            }
            System.out.println(sum);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();

    }
}
