package JavaProgramingAdvanced.DefiningClasses.Exercise.P07Google;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Person> people = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String[] personData = input.split(" ");
            String name = personData[0];
            String type = personData[1];

            Person person = new Person(name);
            people.putIfAbsent(name, person);
            Person currentPerson = people.get(name);

            switch (type) {
                case "company":
                    String companyName = personData[2];
                    String department = personData[3];
                    double salary = Double.parseDouble(personData[4]);
                    currentPerson.setCompany(new Company(companyName, department, salary));
                    break;

                case "pokemon":
                    String pokemonName = personData[2];
                    String pokemonType = personData[3];
                    List<Pokemon> currentPokemonList = currentPerson.getPokemons();
                    currentPokemonList.add(new Pokemon(pokemonName, pokemonType));
                    break;

                case "parents":
                    String parentName = personData[2];
                    String parentBirthday = personData[3];
                    List<Parent> currentParentsList = currentPerson.getParents();
                    currentParentsList.add(new Parent(parentName, parentBirthday));
                    break;

                case "children":
                    String childrenName = personData[2];
                    String childrenBirthday = personData[3];
                    List<Children> currentKidsList = currentPerson.getKids();
                    currentKidsList.add(new Children(childrenName, childrenBirthday));
                    break;

                case "car":
                    String carModel = personData[2];
                    int carSpeed = Integer.parseInt(personData[3]);
                    currentPerson.setCar(new Car(carModel, carSpeed));
                    break;

            }


            people.put(name, currentPerson);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        printingPerson(people.get(input));
    }

    private static void printingPerson(Person person) {
        System.out.println(person.getName());
        System.out.println("Company:");
        if (person.getCompany() != null) {
            System.out.println(person.getCompany());
        }
        System.out.println("Car:");
        if (person.getCar() != null) {
            System.out.println(person.getCar());
        }
        System.out.println("Pokemon:");
        if (person.getPokemons() != null) {
            for ( Pokemon pokemon : person.getPokemons() ) {
                System.out.println(pokemon);
            }
        }
        System.out.println("Parents:");
        if(person.getParents() !=null){
            for (Parent parent : person.getParents()) {
                System.out.println(parent);
            }
        }
        System.out.println("Children:");
        if(person.getKids() !=null){
            for (Children children : person.getKids()) {
                System.out.println(children);
            }
        }



    }
}
