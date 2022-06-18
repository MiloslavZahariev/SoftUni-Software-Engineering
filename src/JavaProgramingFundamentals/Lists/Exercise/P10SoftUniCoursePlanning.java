package JavaProgramingFundamentals.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> lessons = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String commandLine = scanner.nextLine();

        while (!commandLine.equals("course start")) {
            String command = commandLine.split(":")[0];
            String lessonTitle = commandLine.split(":")[1];

            switch (command) {
                case "Add":
                    appendingLesson(lessons, lessonTitle);
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandLine.split(":")[2]);
                    insertingLesson(lessons, lessonTitle, index);
                    break;
                case "Remove":
                    removingLesson(lessons, lessonTitle);
                    break;
                case "Swap":
                    String lessonTitle2 = commandLine.split(":")[2];
                    swappingLessons(lessons, lessonTitle, lessonTitle2);
                    break;
                case "Exercise":
                    addingExercise(lessons, lessonTitle);
                    break;
            }


            commandLine = scanner.nextLine();
        }

        printLessons(lessons);
    }

    private static void addingExercise(List<String> lessons, String lessonTitle) {
        int lessonIndex = 0;
        if (lessons.contains(lessonTitle + "-Exercise")){
            return;
        }
        if (lessons.contains(lessonTitle)) {
            for (int i = 0; i < lessons.size(); i++) {
                if (lessons.get(i).equals(lessonTitle)) {
                    lessonIndex = i;
                }
            }
            lessons.add(lessonIndex + 1, lessonTitle + "-Exercise");

        } else {
            appendingLesson(lessons, lessonTitle);
            addingExercise(lessons, lessonTitle);
        }
    }

    private static void swappingLessons(List<String> lessons, String lessonTitle, String lessonTitle2) {
        int firstIndex = 0;
        int secondIndex = 0;
        if (lessons.contains(lessonTitle) && lessons.contains(lessonTitle2)) {

            for (int i = 0; i < lessons.size(); i++) {
                if (lessons.get(i).equals(lessonTitle)) {
                    firstIndex = i;
                }
                if (lessons.get(i).equals(lessonTitle2)) {
                    secondIndex = i;
                }
            }
            lessons.set(secondIndex, lessonTitle);
            lessons.set(firstIndex, lessonTitle2);
        }
        if (lessons.contains(lessonTitle + "-Exercise") && lessons.contains(lessonTitle2 + "-Exercise")) {
            lessons.set(secondIndex + 1, lessonTitle + "-Exercise");
            lessons.set(firstIndex + 1, lessonTitle2 + "-Exercise");
        } else {

            if (lessons.contains(lessonTitle + "-Exercise")) {
                String firstExercise = lessons.get(firstIndex + 1);
                lessons.remove(firstIndex + 1);
                insertingLesson(lessons, firstExercise, secondIndex + 1);
            }
            if (lessons.contains(lessonTitle2 + "-Exercise")) {
                String secondExercise = lessons.get(secondIndex + 1);
                lessons.remove(secondIndex + 1);
                insertingLesson(lessons, secondExercise, firstIndex + 1);
            }
        }
    }


    private static void removingLesson(List<String> lessons, String lessonTitle) {
        if (lessons.contains(lessonTitle)) {
            lessons.remove(lessonTitle);
            lessons.remove(lessonTitle + "-Exercise");
        }
    }

    private static void insertingLesson(List<String> lessons, String lessonTitle, int index) {
        if (!lessons.contains(lessonTitle)) {
            lessons.add(index, lessonTitle);
        }
    }

    private static void appendingLesson(List<String> lessons, String lessonTitle) {
        if (!lessons.contains(lessonTitle)) {
            lessons.add(lessonTitle);
        }
    }

    private static void printLessons(List<String> lessons) {
        for (int i = 0; i < lessons.size(); i++) {
            System.out.println(1 + i + "." + lessons.get(i));
        }
    }
}
