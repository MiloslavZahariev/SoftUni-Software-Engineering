package JavaProgramingAdvanced.DefiningClasses.Lab.P02Constructors;
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

            Car car = carData.length == 1
                    ? new Car(carData[0])
                    : new Car(carData[0], carData[1], Integer.parseInt(carData[2]));

            carList.add(car);
        }

        carList.forEach(e -> System.out.print(e.toString()));
    }
}
