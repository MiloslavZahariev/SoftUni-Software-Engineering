package JavaProgramingOOP.WorkingWithAbstraction.Lab.P02PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] coordinates = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        Point bottomLeft = new Point(coordinates[0], coordinates[1]);
        Point topRight = new Point(coordinates[2], coordinates[3]);

        int countOfPoints = Integer.parseInt(scanner.nextLine());

        Rectangle rectangle = new Rectangle(bottomLeft,topRight);

        for (int i = 0; i < countOfPoints; i++) {
            int[] pointCoordinates = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

            Point pointToCheck = new Point(pointCoordinates[0],pointCoordinates[1]);

            System.out.println(rectangle.contains(pointToCheck));
        }
    }
}
