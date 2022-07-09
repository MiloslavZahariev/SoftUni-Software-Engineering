package JavaProgramingFundamentals.MapsLambdAndStreamAPI.Exercise;

import java.util.*;

public class P06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courseMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
        String courseName = input.split(" : ")[0];
        String studentName = input.split(" : ")[1];

        List<String> studentList = new ArrayList<>();

        courseMap.putIfAbsent(courseName,studentList);
        courseMap.get(courseName).add(studentName);


            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : courseMap.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue().size());
            for (int i = 0; i <entry.getValue().size() ; i++) {
                System.out.printf("-- %s%n",entry.getValue().get(i));
            }
        }

    }
}
