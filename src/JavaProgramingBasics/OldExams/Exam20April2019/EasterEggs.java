package JavaProgramingBasics.OldExams.Exam20April2019;

import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countEggs = Integer.parseInt(scanner.nextLine());
        int counterRed = 0;
        int counterOrange = 0;
        int counterBlue = 0;
        int counterGreen = 0;
        String champColor = "";
        int champCounter = 0;

        for (int i = 0; i < countEggs; i++) {
            String color = scanner.nextLine();

            switch (color) {
                case "red":
                    counterRed++;
                    break;
                case "orange":
                    counterOrange++;
                    break;
                case "blue":
                    counterBlue++;
                    break;
                case "green":
                    counterGreen++;
                    break;
            }
        }

            if (counterRed > counterBlue && counterRed > counterOrange && counterRed > counterGreen) {
                champColor = "red";
                champCounter = counterRed;
            }else if (counterBlue > counterOrange && counterBlue> counterGreen){
                champColor = "blue";
                champCounter = counterBlue;
            }else if (counterOrange > counterGreen){
                champColor = "orange";
                champCounter = counterOrange;
            }else {
                champCounter = counterGreen;
                champColor = "green";
            }

        System.out.printf("Red eggs: %d%n", counterRed);
        System.out.printf("Orange eggs: %d%n", counterOrange);
        System.out.printf("Blue eggs: %d%n", counterBlue);
        System.out.printf("Green eggs: %d%n", counterGreen);
        System.out.printf("Max eggs: %d -> %s",champCounter,champColor);



    }
}
