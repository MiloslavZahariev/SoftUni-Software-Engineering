package JavaProgramingAdvanced.StreamsFilesAndDirectories.Lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06SortLines {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String address = "resources/input.txt";

        Path path = Paths.get(address);

        List<String> lines = Files.lines(path).sorted().collect(Collectors.toList());


        Files.write(Paths.get("sorted-lines.txt"), lines);
    }
}
