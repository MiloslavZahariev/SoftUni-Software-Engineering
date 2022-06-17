package JavaProgramingFundamentals.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int capacityOfWagon = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("end")){

            if(input.contains("Add")){
                int newPassengers = Integer.parseInt(input.split(" ")[1]);
                numList.add(newPassengers);
            }else {
                int newPassengers = Integer.parseInt(input.split(" ")[0]);

                for (int i = 0; i <numList.size() ; i++) {
                    if(numList.get(i) + newPassengers <= capacityOfWagon){
                        int totalPassengerInWagon = numList.get(i) + newPassengers;
                        numList.set(i,totalPassengerInWagon);
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }

        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
    }
}
