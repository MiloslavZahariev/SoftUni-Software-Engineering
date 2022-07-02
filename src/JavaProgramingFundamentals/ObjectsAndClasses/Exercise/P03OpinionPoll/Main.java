package JavaProgramingFundamentals.ObjectsAndClasses.Exercise.P03OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPerson = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < countPerson; i++) {
            String personData = scanner.nextLine();
            String name = personData.split(" ")[0];
            int age = Integer.parseInt(personData.split(" ")[1]);
            if (age > 30) {
                Person person = new Person(name, age);
                personList.add(person);
            }
        }

        printingList(personList);
    }

    private static void printingList(List<Person> personList) {
        for (Person person : personList){
            System.out.println(person.toString());
        }
    }
}
