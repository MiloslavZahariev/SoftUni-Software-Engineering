package JavaProgramingBasics.OldExams.Exam28March2020;

import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anyFood = Integer.parseInt(scanner.nextLine());
        String stop = "";
        int dogFood = 0;

        while (true) {
            stop = scanner.nextLine();
            if (stop.equals("Adopted")) {
                break;
            } else {
                dogFood += Integer.parseInt(stop);
            }
        }

        if (anyFood*1000 >= dogFood){
            System.out.printf("Food is enough! Leftovers: %d grams.",(anyFood*1000) - dogFood);
        }else {
            System.out.printf("Food is not enough. You need %d grams more.",Math.abs((anyFood*1000) - dogFood));
        }

    }
}
