package JavaProgramingAdvanced.DefiningClasses.Exercise.P08FamilyTree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        String input = scanner.nextLine();
        Person mainPerson = new Person(input);
        Set<String> connection = new LinkedHashSet<>();

        input = scanner.nextLine();
        people.add(mainPerson);
        while (!input.equals("End")) {
            if (input.contains("-")) {
                connection.add(input);
            } else {
                String name = input.split(" ")[0] + " " + input.split(" ")[1];
                String birthDate = input.split(" ")[2];
                if (!checkNameInList(name, birthDate, people)) {
                    Person person = new Person(name, birthDate);
                    people.add(person);
                }
                if (!checkBirthDate(name, birthDate, people)) {
                    Person person = new Person(name, birthDate);
                    people.add(person);
                }

            }


            input = scanner.nextLine();
        }

        findConnection(people, connection);

        printingFamilyTree(people);
    }

    private static void printingFamilyTree(List<Person> people) {
        Person mainPerson = people.get(0);
        List<Person> parents = mainPerson.getParent();
        List<Person> children = mainPerson.getChild();


        System.out.println(mainPerson);
        System.out.println("Parents:");
        for (Person parent : parents) {
            System.out.println(parent);
        }
        System.out.println("Children:");
        for (Person kid : children) {
            System.out.println(kid);
        }


    }

    private static void findConnection(List<Person> people, Set<String> connection) {
        Person mainPerson = people.get(0);

        for (String con : connection) {
            String parent = con.split(" - ")[0];
            String child = con.split(" - ")[1];

            for (Person person : people) {
                if (person.getName().equals(parent) || person.getBirthDate().equals(parent)){
                    for (Person kid: people) {
                        if(kid.getName().equals(child) || kid.getBirthDate().equals(child)){
                            List<Person> childList = person.getChild();
                            List<Person> parentList = kid.getParent();
                            childList.add(kid);
                            parentList.add(person);

                            person.setChild(childList);
                            kid.setParent(parentList);
                        }
                    }
                }
            }


        }
    }


    private static boolean checkBirthDate(String name, String birthDate, List<Person> people) {
        for (Person person : people) {
            if (person.getBirthDate() != null && person.getBirthDate().equals(birthDate)) {
                person.setName(name);
                return true;
            }
        }
        return false;

    }

    private static boolean checkNameInList(String name, String birthDate, List<Person> people) {
        for (Person person : people) {
            if (person.getName() != null && person.getName().equals(name)) {
                person.setBirthDate(birthDate);
                return true;
            }
        }
        return false;
    }
}
