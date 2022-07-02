package JavaProgramingFundamentals.ObjectsAndClasses.Exercise.P07OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        List<Person> personList = new ArrayList<>();

        while (!inputLine.equals("End")){
            String name = inputLine.split(" ")[0];
            String iD = inputLine.split(" ")[1];
            int age = Integer.parseInt(inputLine.split(" ")[2]);

            Person person = new Person(name,iD,age);
            personList.add(person);

            inputLine = scanner.nextLine();
        }

        personList.sort(Comparator.comparing(Person::getAge));
        printingList(personList);

    }

    private static void printingList(List<Person> studentList) {
        for (Person person : studentList) {
            System.out.println(person.toString());
        }
    }
}
