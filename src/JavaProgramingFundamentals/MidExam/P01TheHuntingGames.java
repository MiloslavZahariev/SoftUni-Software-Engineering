package JavaProgramingFundamentals.MidExam;

import java.util.Scanner;

public class P01TheHuntingGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int numberOfPlayers = Integer.parseInt(scanner.nextLine());
        double groupEnergy = Double.parseDouble(scanner.nextLine());

        double waterPerDay = Double.parseDouble(scanner.nextLine());
        double foodPerDay = Double.parseDouble(scanner.nextLine());


        double totalWater = days * numberOfPlayers * waterPerDay;
        double totalFood = days * numberOfPlayers * foodPerDay;

        for (int i = 1; i <=days ; i++) {
            double energyLost = Double.parseDouble(scanner.nextLine());

            if (groupEnergy - energyLost <= 0){
                System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.",totalFood,totalWater);
                return;
            }
            groupEnergy -= energyLost;



            if (i % 2 == 0 ){
                groupEnergy += groupEnergy * 0.05;
                totalWater *= 0.7;
            }
            if (i % 3 == 0 ){
                totalFood -= totalFood/numberOfPlayers;
                groupEnergy += groupEnergy * 0.1;
            }


        }

        System.out.printf("You are ready for the quest. You will be left with - %.2f energy!",groupEnergy);
    }
}
