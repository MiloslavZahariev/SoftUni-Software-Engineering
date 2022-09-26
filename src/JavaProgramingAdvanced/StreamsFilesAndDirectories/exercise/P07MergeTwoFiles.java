package JavaProgramingAdvanced.StreamsFilesAndDirectories.exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class P07MergeTwoFiles {
    public static void main(String[] args)throws IOException {

        Path firstFile  = Paths.get("resources/01._Sum Lines_Ресурси/04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputOne.txt");
        List<String> firstFileLines = Files.readAllLines(firstFile);

        Path secondFile  = Paths.get("resources/01._Sum Lines_Ресурси/04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputTwo.txt");
        List<String> secondFileLines = Files.readAllLines(secondFile);

        Path output =Paths.get("resources/01._Sum Lines_Ресурси/04. Java-Advanced-Files-and-Streams-Exercises-Resources/output.txt");
        Files.write(output,firstFileLines);
        Files.write(output,secondFileLines, StandardOpenOption.APPEND);


    }

}
