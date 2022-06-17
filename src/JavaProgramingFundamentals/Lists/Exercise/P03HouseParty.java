package JavaProgramingFundamentals.Lists.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        List<String> guests = new ArrayList<>();

        for (int i = 0; i <numberOfCommands ; i++) {
            String command = scanner.nextLine();
            String name = command.split(" ")[0];

            if (command.contains("not") && guests.contains(name)){
                guests.remove(name);
            }else if(command.contains("not")){
                System.out.printf("%s is not in the list!%n",name);
            }else if (guests.contains(name)){
                System.out.printf("%s is already in the list!%n",name);
            }else {
                guests.add(name);
            }
        }

        printList(guests);
    }

    private static void printList(List<String> guests) {
        for (String element : guests) {
            System.out.println(element);
        }
    }
}
