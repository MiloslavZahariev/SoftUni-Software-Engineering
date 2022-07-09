package JavaProgramingFundamentals.ObjectsAndClasses.MoreExercises.P03CarSalesman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countEngines = Integer.parseInt(scanner.nextLine());
        List<Engine> engineList = new ArrayList<>();
        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < countEngines; i++) {
            List<String> engineData = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            String engineModel = engineData.get(0);
            String power = engineData.get(1);
            Engine engine = new Engine(engineModel, power);
            if (engineData.size() == 3) {
                String value = engineData.get(2);
                if (itIsNumber(value)) {
                    engine.setDisplacement(value);

                } else {
                    engine.setEfficiency(value);
                }
            } else if (engineData.size() == 4) {
                String value1 = engineData.get(2);
                String value2 = engineData.get(3);
                if (itIsNumber(value1)) {
                    engine.setDisplacement(value1);
                    engine.setEfficiency(value2);
                } else {
                    engine.setDisplacement(value2);
                    engine.setEfficiency(value1);
                }
            }

            engineList.add(engine);
        }


        int countsCar = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < countsCar; i++) {
            List<String> carData = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            String model = carData.get(0);
            String engineName = carData.get(1);
            Engine engine = findingEngineFromList(engineList, engineName);

            Car car = new Car(model,engine);

            if (carData.size() == 3) {
                String value = carData.get(2);
                if (itIsNumber(value)) {
                    car.setWeight(value);

                } else {
                    car.setColor(value);
                }
            } else if (carData.size() == 4) {
                String value1 = carData.get(2);
                String value2 = carData.get(3);
                if (itIsNumber(value1)) {
                    car.setWeight(value1);
                    car.setColor(value2);
                } else {
                    car.setWeight(value2);
                    car.setColor(value1);
                }
            }

            carList.add(car);

        }


        for (Car car : carList) {
            System.out.println(car.toString());
        }
    }

    private static Engine findingEngineFromList(List<Engine> engineList, String engineName) {
        Engine engine1 = new Engine(null,null);
        for (Engine engine : engineList) {
            if (engine.getEngineModel().equals(engineName)) {
                engine1 = engine;
            }
        }
        return engine1;
    }

    private static boolean itIsNumber(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
