package JavaProgramingAdvanced.SetsAndMapsAdvanced.Exercises;

import java.util.Scanner;
import java.util.TreeSet;

public class P03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCompounds = Integer.parseInt(scanner.nextLine());

        TreeSet<String> elements = new TreeSet<>();

        for (int i = 0; i < numberOfCompounds; i++) {
            String[] compound = scanner.nextLine().split(" ");
            for (String element : compound) {
                elements.add(element);
            }
        }

        String result = String.join(" ", elements);

        System.out.println(result);

    }
}
