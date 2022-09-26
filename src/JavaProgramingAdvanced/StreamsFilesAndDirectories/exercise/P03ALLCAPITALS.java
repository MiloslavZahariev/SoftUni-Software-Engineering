package JavaProgramingAdvanced.StreamsFilesAndDirectories.exercise;

import java.io.*;
import java.util.Locale;

public class P03ALLCAPITALS {
    public static void main(String[] args) throws IOException {


        String path = "resources/01._Sum Lines_Ресурси/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt";

        PrintWriter pw = new PrintWriter(new FileWriter("resources/01._Sum Lines_Ресурси/04. Java-Advanced-Files-and-Streams-Exercises-Resources/output.txt"));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        bufferedReader.lines().forEach(line -> pw.print(line.toUpperCase()));

        bufferedReader.close();
        pw.close();

    }

}
