package JavaProgramingAdvanced.SetsAndMapsAdvanced.Exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNames = Integer.parseInt(scanner.nextLine());

        Set<String> names = new LinkedHashSet<>();

        for (int i = 0; i < numberOfNames; i++) {
            String name = scanner.nextLine();

            names.add(name);
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
