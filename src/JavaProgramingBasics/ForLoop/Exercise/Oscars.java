package JavaProgramingBasics.ForLoop.Exercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfActor = scanner.nextLine();
        double pointsOfActor = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String nameOfEvaluating = scanner.nextLine();
            double pointsOfEvaluating = Double.parseDouble(scanner.nextLine());
            pointsOfActor += pointsOfEvaluating * nameOfEvaluating.length() / 2;
            if (pointsOfActor > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameOfActor, pointsOfActor);
                break;
            }

        }
        if (pointsOfActor < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", nameOfActor, 1250.5 - pointsOfActor);
        }
    }
}