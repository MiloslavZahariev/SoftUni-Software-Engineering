package JavaProgramingAdvanced.DefiningClasses.Exercise.P05CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countOfEngines = Integer.parseInt(scanner.nextLine());

        Map<String, Engine> engines = new HashMap<>();
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < countOfEngines; i++) {
            String[] engineData = scanner.nextLine().split(" ");
            String model = engineData[0];
            int power = Integer.parseInt(engineData[1]);

            Engine engine = new Engine(model, power);

            if (engineData.length == 3) {
                String parameter = engineData[2];
                char firstSymbol = parameter.charAt(0);
                if (Character.isDigit(firstSymbol)) {
                    engine = new Engine(model, power, Integer.parseInt(parameter));
                } else {
                    engine = new Engine(model, power, parameter);
                }

            } else if (engineData.length == 4) {
                int displacement = Integer.parseInt(engineData[2]);
                String efficiency = engineData[3];
                engine = new Engine(model, power, displacement, efficiency);
            }

            engines.put(model, engine);
        }


        int countOfCars = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < countOfCars; i++) {
            String[] carData = scanner.nextLine().split(" ");
            String model = carData[0];
            String engineModel = carData[1];
            Engine currentEngine = engines.get(engineModel);
            Car car = new Car(model, currentEngine);

            if (carData.length == 3) {
                String parameter = carData[2];
                char firstSymbol = parameter.charAt(0);
                if (Character.isDigit(firstSymbol)) {
                    car = new Car(model, currentEngine, Integer.parseInt(parameter));
                } else {
                    car = new Car(model, currentEngine, parameter);
                }
            } else if (carData.length == 4) {
                int weight = Integer.parseInt(carData[2]);
                String color = carData[3];
                car = new Car(model, currentEngine, weight, color);
            }

            cars.add(car);
        }

        printingData(cars);
    }

    private static void printingData(List<Car> cars) {
        for (Car car : cars) {
            String displacement = "n/a";
            String weight = "n/a";
            System.out.printf("%s:%n", car.getModel());
            System.out.printf("%s:%n", car.getEngine().getModel());
            System.out.printf("Power: %d%n", car.getEngine().getPower());
            if (car.getEngine().getDisplacement() != -1) {
                displacement = String.valueOf(car.getEngine().getDisplacement());
            }
            System.out.printf("Displacement: %s%n", displacement);
            System.out.printf("Efficiency: %s%n", car.getEngine().getEfficiency());
            if (car.getWeight() != -1) {
                weight = String.valueOf(car.getWeight());
            }
            System.out.printf("Weight: %s%n", weight);
            System.out.printf("Color: %s%n", car.getColor());

        }
    }
}
