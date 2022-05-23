package JavaProgramingBasics.OldExams.Exam28March2020;

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());
        String end = "";
        double volumeOfBags = 0.0;
        int countBags = 0;

        while (true) {
            end = scanner.nextLine();
            if (end.equals("End")) {
                break;
            } else {
                volumeOfBags = Double.parseDouble(end);
                countBags++;
                if (countBags % 3 == 0) {
                    volumeOfBags = volumeOfBags *1.1;
                }
                capacity -= volumeOfBags;
            }
            if (capacity <= 0){
                break;
            }
        }
        if (capacity < 0) {
            System.out.println("No more space!");
            System.out.printf("Statistic: %d suitcases loaded.", countBags-1);
        } else {
            System.out.println("Congratulations! All suitcases are loaded!");
            System.out.printf("Statistic: %d suitcases loaded.", countBags);
        }
    }
}

