package JavaProgramingBasics.ForLoop.MoreExercises;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());
        int doctors = 7;
        int okPatients = 0;
        int notOkPatients = 0;


        for (int i = 1; i <= period; i++) {
            int patients = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0 && notOkPatients > okPatients) {
                doctors++;
            }
            if (doctors < patients) {
                notOkPatients -= doctors - patients;
                okPatients += doctors;
            } else {
                okPatients += patients;
            }
        }
        System.out.printf("Treated patients: %d.%n", okPatients);
        System.out.printf("Untreated patients: %d.", notOkPatients);

    }
}

