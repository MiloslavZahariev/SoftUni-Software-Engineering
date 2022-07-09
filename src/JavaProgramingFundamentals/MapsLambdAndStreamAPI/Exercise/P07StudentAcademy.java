package JavaProgramingFundamentals.MapsLambdAndStreamAPI.Exercise;

import java.util.*;

public class P07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> gradeMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String studentName = scanner.nextLine();
            double currentGrade = Double.parseDouble(scanner.nextLine());

            gradeMap.putIfAbsent(studentName, new ArrayList<>());
            gradeMap.get(studentName).add(currentGrade);

        }

        for (Map.Entry<String, List<Double>> entry : gradeMap.entrySet()) {
            double sumGrade = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                sumGrade += entry.getValue().get(i);
            }
            double averageGrade = sumGrade / entry.getValue().size();
            if (averageGrade >= 4.5) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), averageGrade);
            }
        }

    }
}
