package JavaProgramingOOP.InterfacesAndAbstraction.Exercise.BirthdayCelebrations;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Birthable> list = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split(" ");

            String kind = tokens[0];

            Birthable birthable = null;
            switch (kind) {
                case "Citizen":
                    String citizenName = tokens[1];
                    int citizenAge = Integer.parseInt(tokens[2]);
                    String citizenId = tokens[3];
                    String citizenBirthDate = tokens[4];
                    birthable = new Citizen(citizenName, citizenAge, citizenId, citizenBirthDate);
                    break;
                case "Pet":
                    String petName = tokens[1];
                    String petBirthDate = tokens[2];
                    birthable = new Pet(petName, petBirthDate);
                    break;
                case "Robot":
                    break;
            }
            if (birthable != null) {
                list.add(birthable);
            }

            input = scanner.nextLine();
        }

        String searchYear = scanner.nextLine();

        list.stream()
                .filter(k -> k.getBirthDate().endsWith(searchYear))
                .forEach(p -> System.out.println(p.getBirthDate()));

    }
}
