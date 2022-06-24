package JavaProgramingFundamentals.OldExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> journalList =
                Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList
                        ());

        String command = scanner.nextLine();

        while (!command.equals("Craft!")) {
            String item = command.split(" ")[2];

            switch (command.split(" ")[0]) {
                case "Collect":
                    addingItem(journalList, item);
                    break;
                case "Drop":
                    removingItem(journalList,item);
                    break;
                case "Combine":
                 item = command.split(" ")[3];
                    combiningItems(journalList,item);
                    break;
                case "Renew":
                    changePositionOfItem(journalList,item);
                    break;
            }


            command = scanner.nextLine();
        }

        System.out.println(journalList.toString().replaceAll("[\\[\\]]", ""));
    }

    private static void combiningItems(List<String> journalList, String item) {
        String oldItem = item.split(":")[0];
        String newItem = item.split(":")[1];

        if(journalList.contains(oldItem)){
            for (int i = 0; i <journalList.size() ; i++) {
                if(journalList.get(i).equals(oldItem)){
                    journalList.add(i+1,newItem);
                    break;
                }
            }
        }

    }

    private static void changePositionOfItem(List<String> journalList, String item) {
        if(journalList.contains(item)){
            journalList.remove(item);
            journalList.add(item);
        }
    }

    private static void removingItem(List<String> journalList, String item) {
        if(journalList.contains(item)){
            journalList.remove(item);
        }
    }

    private static void addingItem(List<String> journalList, String item) {
        if (!journalList.contains(item)){
            journalList.add(item);
        }
    }

}

