package JavaProgramingFundamentals.DataTypesandVariables.Exercise;

import java.util.Scanner;

public class P11Snowballs {
    public P11Snowballs() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte numberOfSnowballs = Byte.parseByte(scanner.nextLine());
        double bestSnowballValue = 0.0D;
        short bestSnowballSnow = 0;
        short bestSnowballTime = 0;
        byte bestSnowballQuality = 0;

        for (int i = 0; i < numberOfSnowballs; ++i) {
            short snowballSnow = Short.parseShort(scanner.nextLine());
            short snowballTime = Short.parseShort(scanner.nextLine());
            byte snowballQuality = Byte.parseByte(scanner.nextLine());
            double snowballValue = Math.pow((snowballSnow / (snowballTime * 1.0)), snowballQuality);
            if (bestSnowballValue < snowballValue) {
                bestSnowballValue = snowballValue;
                bestSnowballSnow = snowballSnow;
                bestSnowballTime = snowballTime;
                bestSnowballQuality = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", bestSnowballSnow, bestSnowballTime, bestSnowballValue, bestSnowballQuality);
    }
}
