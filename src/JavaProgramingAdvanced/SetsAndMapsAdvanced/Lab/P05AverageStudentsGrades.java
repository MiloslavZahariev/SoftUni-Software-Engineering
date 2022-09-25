package JavaProgramingAdvanced.SetsAndMapsAdvanced.Lab;

import java.util.*;

public class P05AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsWithGrades = new TreeMap<>();

        for (int i = 0; i < numberOfStudents; i++) {
            String[] inputLine = scanner.nextLine().split(" ");
            studentsWithGrades.putIfAbsent(inputLine[0], new ArrayList<>());
            studentsWithGrades.get(inputLine[0]).add(Double.parseDouble(inputLine[1]));
        }


        for (var entry : studentsWithGrades.entrySet()) {
            System.out.printf("%s -> ",entry.getKey());
             printAverageGrade(entry.getValue());

        }

    }

    private static void printAverageGrade(List<Double> value) {
        double averageGrade = 0;
        for (int i = 0; i < value.size(); i++) {
            System.out.printf("%.2f ",value.get(i));
            averageGrade += value.get(i);
        }

        System.out.printf("(avg: %.2f)%n",averageGrade/value.size());
    }
}
