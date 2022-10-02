package JavaProgramingAdvanced.DefiningClasses.Lab.P01CarInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCars = Integer.parseInt(scanner.nextLine());

        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < numberOfCars; i++) {
            String[] carData = scanner.nextLine().split(" ");

            String brand = carData[0];
            String model = carData[1];
            int horsePower = Integer.parseInt(carData[2]);

            Car car = new Car(brand,model,horsePower);

            carList.add(car);
        }

        carList.forEach(e -> System.out.print(e.toString()));
    }
}
