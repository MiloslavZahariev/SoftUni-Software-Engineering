package JavaProgramingFundamentals.ObjectsAndClasses.MoreExercises.P02RawData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> carsList = new ArrayList<>();

        int numbersOfCars = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numbersOfCars; i++) {
            List<String> inputList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            String model = inputList.get(0);
            Engine engine = new Engine(Integer.parseInt(inputList.get(1)), Integer.parseInt(inputList.get(2)));
            Cargo cargo = new Cargo(Integer.parseInt(inputList.get(3)), inputList.get(4));

            List<Tyre> tyreList = new ArrayList<>();
            fillingAllTyresData(inputList, tyreList);

            Car car = new Car(model, engine, cargo, tyreList);
            carsList.add(car);
        }

        String command = scanner.nextLine();

        for (Car car : carsList) {
            switch (command) {
                case "fragile":
                    if (car.getCargo().getCargoType().equals(command) && car.lowerPressure(car.getTyreList())) {
                        System.out.println(car.getModel());
                    }
                    break;
                case "flamable":
                    if (car.getCargo().getCargoType().equals(command) && car.getEngine().getEnginePower() > 250){
                        System.out.println(car.getModel());
                    }
                    break;
            }
        }
    }

    private static void fillingAllTyresData(List<String> inputList, List<Tyre> tyreList) {
        for (int j = 0; j < 8; j += 2) {
            double tyrePressure = Double.parseDouble(inputList.get(5 + j));
            int tyreAge = Integer.parseInt(inputList.get(6 + j));
            Tyre tyre = new Tyre(tyrePressure, tyreAge);
            tyreList.add(tyre);
        }
    }
}
