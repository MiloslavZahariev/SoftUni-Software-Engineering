package JavaProgramingAdvanced.SetsAndMapsAdvanced.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P08UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeMap<String, LinkedHashMap<String, Integer>> users = new TreeMap<>();

        while (!input.equals("end")) {
            String[] inputParts = input.split(" ");
            String userName = inputParts[2].substring(5);
            String ipAddress = inputParts[0].substring(3);

            users.putIfAbsent(userName, new LinkedHashMap<>());
            users.get(userName).putIfAbsent(ipAddress, 0);
            int currentAttacks = users.get(userName).get(ipAddress);
            users.get(userName).put(ipAddress, currentAttacks + 1);


            input = scanner.nextLine();
        }


        for (Map.Entry<String, LinkedHashMap<String, Integer>> user : users.entrySet()) {
            System.out.println(user.getKey() + ": ");
            String text = "";
            for (Map.Entry<String, Integer> ipAttacks : user.getValue().entrySet()) {
                 text += String.join(",", (ipAttacks.getKey() + " => " + ipAttacks.getValue()) + ", ");
            }

            text = text.substring(0,text.length()-2) +".";
            System.out.println(text);
        }




    }

}

