package JavaProgramingFundamentals.ExamPreparation;

import java.util.*;

public class P03NeedForSpeed3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<Integer>> carMap = new LinkedHashMap<>();
        int carsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < carsCount; i++) {
            String input = scanner.nextLine();
            String model = input.split("\\|")[0];
            int mileage = Integer.parseInt(input.split("\\|")[1]);
            int fuel = Integer.parseInt(input.split("\\|")[2]);

            List<Integer> infoList = new ArrayList<>();
            infoList.add(mileage);
            infoList.add(fuel);
            carMap.put(model, infoList);
        }

        String commandInput = scanner.nextLine();
        while (!commandInput.equals("Stop")) {
            String command = commandInput.split(" : ")[0];
            if (command.equals("Drive")) {
                String car = commandInput.split(" : ")[1];
                int neededFuel = Integer.parseInt(commandInput.split(" : ")[3]);
                int distance = Integer.parseInt(commandInput.split(" : ")[2]);

                if (carMap.get(car).get(1) >= neededFuel) {
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, neededFuel);
                    int currentFuel = carMap.get(car).get(1);
                    int currentMileage = carMap.get(car).get(0);
                    carMap.get(car).set(1, currentFuel - neededFuel);
                    carMap.get(car).set(0, currentMileage + distance);
                    if (carMap.get(car).get(0) >= 100000) {
                        System.out.printf("Time to sell the %s!%n", car);
                        carMap.remove(car);
                    }
                }else{
                    System.out.println("Not enough fuel to make that ride");
                }

            } else if (command.equals("Refuel")) {
                String car = commandInput.split(" : ")[1];
                int addingFuel = Integer.parseInt(commandInput.split(" : ")[2]);
                int currentFuel = carMap.get(car).get(1);
                if(currentFuel + addingFuel <= 75){
                    System.out.printf("%s refueled with %s liters%n",car,addingFuel);
                    carMap.get(car).set(1,currentFuel + addingFuel);
                }else{
                    System.out.printf("%s refueled with %s liters%n",car,75 - currentFuel);
                    carMap.get(car).set(1,75);
                }

            } else if (command.equals("Revert")) {
                String car = commandInput.split(" : ")[1];
                int kilometers = Integer.parseInt(commandInput.split(" : ")[2]);
                int currentKilometers = carMap.get(car).get(0);
                carMap.get(car).set(0, currentKilometers - kilometers);
                if(currentKilometers - kilometers < 10000){
                    carMap.get(car).set(0,10000);
                }else{
                    System.out.printf("%s mileage decreased by %d kilometers%n",car,kilometers);
                }
            }

            commandInput = scanner.nextLine();
        }

        carMap.entrySet().forEach(entry -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                entry.getKey(),entry.getValue().get(0),entry.getValue().get(1)));
    }
}
