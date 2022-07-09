package JavaProgramingFundamentals.MapsLambdAndStreamAPI.Exercise;

import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<String>> companyUsersMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String companyName = input.split(" -> ")[0];
            String employeeId = input.split(" -> ")[1];

            companyUsersMap.putIfAbsent(companyName, new ArrayList<>());
            if (!companyUsersMap.get(companyName).contains(employeeId)){
                companyUsersMap.get(companyName).add(employeeId);
            }
                input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : companyUsersMap.entrySet()) {
            System.out.println(entry.getKey());
            for (String element : entry.getValue()) {
                System.out.printf("-- %s%n",element);
            }
        }

    }
}
