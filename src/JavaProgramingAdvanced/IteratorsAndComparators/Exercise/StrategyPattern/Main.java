package JavaProgramingAdvanced.IteratorsAndComparators.Exercise.StrategyPattern;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        NameComparator nameComparator = new NameComparator();
        AgeComparator ageComparator = new AgeComparator();

        Set<Person> people = new TreeSet<>(nameComparator);
        Set<Person> people2 = new TreeSet<>(ageComparator);

        for (int i = 0; i < numberOfPeople; i++) {
            String[] personData = scanner.nextLine().split(" ");

            Person person = new Person(personData[0], Integer.parseInt(personData[1]));
            people.add(person);
            people2.add(person);
        }

        for (Person person : people) {
            System.out.println(person);
        }

        for (Person person : people2) {
            System.out.println(person);
        }

    }
}
