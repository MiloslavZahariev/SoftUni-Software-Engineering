package JavaProgramingAdvanced.IteratorsAndComparators.Exercise.ComparingObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String name = input.split(" ")[0];
            int age = Integer.parseInt(input.split(" ")[1]);
            String town = input.split(" ")[2];

            Person person = new Person(name, age, town);
            people.add(person);

            input = scanner.nextLine();
        }

        int index = Integer.parseInt(scanner.nextLine()) - 1;

        Person mainPerson = people.get(index);
        int matches = 0;

        for (Person person : people) {
            if (person.compareTo(mainPerson) == 0) {
               matches++;
            }
        }

        if(matches >1){
            System.out.printf("%d %d %d%n",matches,people.size() - matches , people.size());
        }else {
            System.out.println("No matches");
        }
    }
}
