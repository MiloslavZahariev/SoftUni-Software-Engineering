package JavaProgramingAdvanced.DefiningClasses.Exercise.P04RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOFCars = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < numberOFCars; i++) {
            String[] carData = scanner.nextLine().split(" ");
            Car car = new Car(carData);
            cars.add(car);
        }

        String command = scanner.nextLine();
        printingResult(command, cars);

        System.out.println();
    }

    private static void printingResult(String command, List<Car> cars) {
        switch (command) {
            case "fragile":
                cars.stream()
                        .filter(car -> car.getCargo().getType().equals("fragile"))
                        .filter(car -> car.getPressure(car.getTyres()))
                        .forEach(System.out::println);
                break;
            case "flamable":
                cars.stream().filter(car -> car.getCargo().getType().equals("flamable"))
                        .filter(car -> car.getEngine().getPower() >250)
                        .forEach(System.out::println);
                break;
        }
    }
}
