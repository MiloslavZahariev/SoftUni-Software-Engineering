package JavaProgramingAdvanced.IteratorsAndComparators.Exercise.EqualityLogic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        Set<Person> hashSet = new HashSet<>();
        Set<Person> treeSet = new TreeSet<>();

        for (int i = 0; i < numberOfPeople; i++) {
            String[] personData = scanner.nextLine().split(" ");

            Person person = new Person(personData[0], Integer.parseInt(personData[1]));
            hashSet.add(person);
            treeSet.add(person);
        }

        System.out.println(treeSet.size());
        System.out.println(hashSet.size());
    }
}
