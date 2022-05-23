package JavaProgramingBasics.ForLoop.MoreExercises;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacityOfStadium = Integer.parseInt(scanner.nextLine());
        int totalFans = Integer.parseInt(scanner.nextLine());
        int sectorAFans = 0;
        int sectorBFans = 0;
        int sectorVFans = 0;
        int sectorGFans = 0;

        for (int i = 0; i < totalFans; i++) {
            String sector = scanner.nextLine();

            switch (sector) {
                case "A":
                    sectorAFans++;
                    break;
                case "B":
                    sectorBFans++;
                    break;
                case "V":
                    sectorVFans++;
                    break;
                case "G":
                    sectorGFans++;
                    break;
            }

        }
            System.out.printf("%.2f%%%n",100.0*sectorAFans/totalFans);
            System.out.printf("%.2f%%%n",100.0*sectorBFans/totalFans);
            System.out.printf("%.2f%%%n",100.0*sectorVFans/totalFans);
            System.out.printf("%.2f%%%n",100.0*sectorGFans/totalFans);
            System.out.printf("%.2f%%%n",100.0*totalFans/capacityOfStadium);
    }
}
