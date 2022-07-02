package JavaProgramingFundamentals.ObjectsAndClasses.Exercise.P06VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String vehicleData = scanner.nextLine();
        List<Vehicle> vehicleList = new ArrayList<>();
        while (!vehicleData.equals("End")) {
            String type = vehicleData.split(" ")[0];
            String model = vehicleData.split(" ")[1];
            String color = vehicleData.split(" ")[2];
            int power = Integer.parseInt(vehicleData.split(" ")[3]);

            Vehicle vehicle = new Vehicle(type, model, color, power);
            vehicleList.add(vehicle);

            vehicleData = scanner.nextLine();
        }

        String searchModel = scanner.nextLine();
        while (!searchModel.equals("Close the Catalogue")) {
            for (int i = 0; i < vehicleList.size(); i++) {
                if (searchModel.equals(vehicleList.get(i).getModel())) {
                    printingVehicleData(vehicleList.get(i));
                }
            }

            searchModel = scanner.nextLine();
        }
        printingAvarageHorsePower(vehicleList);
    }

    private static void printingAvarageHorsePower(List<Vehicle> vehicleList) {
        double carSum = 0;
        double truckSum = 0;
        int carCounter = 0;
        int truckCounter = 0;
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getType().equals("car")) {
                carSum += vehicle.getPower();
                carCounter++;
            } else {
                truckSum += vehicle.getPower();
                truckCounter++;
            }
        }
        if (carCounter > 0) {
            System.out.printf("Cars have average horsepower of: %.2f.%n", carSum / carCounter);
        } else {
            System.out.println("Cars have average horsepower of: 0.00.");
        }

        if (truckSum > 0) {
            System.out.printf("Trucks have average horsepower of: %.2f.%n", truckSum / truckCounter);
        }else{
            System.out.println("Trucks have average horsepower of: 0.00.");
        }

    }

    private static void printingVehicleData(Vehicle vehicle) {

        if (vehicle.getType().equals("car")) {
            System.out.println("Type: Car");
        } else {
            System.out.println("Type: Truck");
        }

        System.out.printf("Model: %s%n", vehicle.getModel());
        System.out.printf("Color: %s%n", vehicle.getColor());
        System.out.printf("Horsepower: %d%n", vehicle.getPower());
    }
}
