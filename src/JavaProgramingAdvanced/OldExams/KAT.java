package JavaProgramingAdvanced.OldExams;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class KAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> licenceQueue = new ArrayDeque<>();
        Deque<Integer> carsStack = new ArrayDeque<>();

        String[] licenceInput = scanner.nextLine().split(", ");
        String[] carsInput = scanner.nextLine().split(", ");

        for (String licence : licenceInput) {
            licenceQueue.offer(Integer.parseInt(licence));
        }

        for (String car : carsInput) {
            carsStack.push(Integer.parseInt(car));
        }

        int dayCounter = 0;
        int registeredCars = 0;

        while (!licenceQueue.isEmpty() && !carsStack.isEmpty()) {
            dayCounter++;

            int tempCars = carsStack.poll();
            int tempLicence = licenceQueue.pop();

            if (tempCars * 2 > tempLicence) {
                registeredCars += tempLicence / 2;
                tempCars -= tempLicence / 2;
                carsStack.offer(tempCars);

            } else if (tempLicence > tempCars * 2) {
                registeredCars += tempCars;
                tempLicence -= tempCars * 2;
                licenceQueue.offer(tempLicence);
            } else {
                registeredCars += tempCars;
            }


        }

        System.out.printf("%d cars were registered for %d days!%n", registeredCars, dayCounter);
        if (licenceQueue.isEmpty() && carsStack.isEmpty()) {
            System.out.println("Good job! There is no queue in front of the KAT!");
        } else if (!licenceQueue.isEmpty()) {
            System.out.printf("%d license plates remain!%n", calculateRemains(licenceQueue));
        } else {
            System.out.printf("%d cars remain without license plates!%n",calculateRemains(carsStack));
        }
    }

    private static int calculateRemains(Deque<Integer> remains) {
        int totalRemains = 0;
        for (int q : remains) {
            totalRemains += q;
        }
        return totalRemains;
    }
}
