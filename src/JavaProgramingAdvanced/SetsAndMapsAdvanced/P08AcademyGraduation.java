package JavaProgramingAdvanced.SetsAndMapsAdvanced;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class P08AcademyGraduation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Double> gradeByStudents = new TreeMap<>();

        while (n-- > 0) {
            String name = scanner.nextLine();

            double[] grades = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

            double sum = 0;
            for (double grade : grades) {
                sum += grade;
            }
            gradeByStudents.put(name, sum / grades.length);
        }

        for (Map.Entry<String, Double> entry : gradeByStudents.entrySet()) {
            System.out.printf("%s is graduated with %s%n", entry.getKey(), entry.getValue());
        }

    }


}
