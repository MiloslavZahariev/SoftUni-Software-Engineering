package JavaProgramingAdvanced.StreamsFilesAndDirectories.exercise;

import java.io.*;

public class P05LineNumbers {
    public static void main(String[] args) throws IOException {


        String path = "resources/01._Sum Lines_Ресурси/04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputLineNumbers.txt";

        BufferedReader br = new BufferedReader(new FileReader(path));
        PrintWriter pw = new PrintWriter(new FileWriter("resources/01._Sum Lines_Ресурси/04. Java-Advanced-Files-and-Streams-Exercises-Resources/output.txt"));
        String line = br.readLine();
        int counter = 1;
        while (line != null) {
            pw.println(counter + ". " + line);
            counter++;
            line = br.readLine();
        }
        pw.close();
    }
}
