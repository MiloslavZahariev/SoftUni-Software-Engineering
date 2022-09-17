package JavaProgramingFundamentals.FinalExam;

import java.util.*;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> peopleMap = new LinkedHashMap<>();

        String commandLine = scanner.nextLine();
        while (!commandLine.equals("Statistics")) {
            String command = commandLine.split("=")[0];
            String username = commandLine.split("=")[1];

            switch (command) {
                case "Add":
                    int sent = Integer.parseInt(commandLine.split("=")[2]);
                    int received = Integer.parseInt(commandLine.split("=")[3]);
                    List<Integer> infoList = new ArrayList<>();
                    infoList.add(sent);
                    infoList.add(received);
                    peopleMap.putIfAbsent(username, infoList);
                    break;
                case "Message":
                    String receiver = commandLine.split("=")[2];
                    if (peopleMap.containsKey(username) && peopleMap.containsKey(receiver)) {
                        peopleMap.get(username).set(0, peopleMap.get(username).get(0) + 1);
                        peopleMap.get(receiver).set(1, peopleMap.get(receiver).get(1) + 1);

                        if (peopleMap.get(username).get(0) + peopleMap.get(username).get(1) == capacity) {
                            System.out.printf("%s reached the capacity!%n", username);
                            peopleMap.remove(username);
                        }

                        if (peopleMap.get(receiver).get(0) + peopleMap.get(receiver).get(1) == capacity) {
                            System.out.printf("%s reached the capacity!%n", receiver);
                            peopleMap.remove(receiver);
                        }
                    }

                    break;
                case "Empty":
                    if (username.equals("All")) {
                        peopleMap = new LinkedHashMap<>();
                    } else {
//                        if (peopleMap.containsKey(username)) {
//                            List<Integer> zeroList = new ArrayList<>();
//                            zeroList.add(0);
//                            zeroList.add(0);
//
//                            peopleMap.put(username, zeroList);
//                        }
                        peopleMap.remove(username);
                    }


                    break;
            }


            commandLine = scanner.nextLine();
        }

        System.out.printf("Users count: %d%n", peopleMap.size());

        for (Map.Entry<String, List<Integer>> entry : peopleMap.entrySet()) {
            System.out.printf("%s - %d%n", entry.getKey(), entry.getValue().get(0) + entry.getValue().get(1));
        }

    }
}
