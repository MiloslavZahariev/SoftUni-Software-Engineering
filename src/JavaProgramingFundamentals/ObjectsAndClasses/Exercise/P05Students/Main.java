package JavaProgramingFundamentals.ObjectsAndClasses.Exercise.P05Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < countStudents; i++) {
            String studentData = scanner.nextLine();

            String firstName = studentData.split(" ")[0];
            String lastName = studentData.split(" ")[1];
            double grade = Double.parseDouble(studentData.split(" ")[2]);

            Student student = new Student(firstName,lastName,grade);
            studentList.add(student);
        }

        studentList.sort(Comparator.comparing(Student::getGrade).reversed());

        printingList(studentList);
    }

    private static void printingList(List<Student> studentList) {
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
    }
}
