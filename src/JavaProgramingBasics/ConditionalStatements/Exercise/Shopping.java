package JavaProgramingBasics.ConditionalStatements.Exercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards =Integer.parseInt(scanner.nextLine());
        int processor =Integer.parseInt(scanner.nextLine());
        int ramMemory =Integer.parseInt(scanner.nextLine());

        double videoCardsPrice = videoCards * 250 ;
        double processorPrice = videoCardsPrice * 0.35 * processor;
        double ramMemoryPrice = videoCardsPrice * 0.1 * ramMemory;

        double finalPrice = 0;

        if (videoCards > processor) {
            finalPrice = (videoCardsPrice + processorPrice + ramMemoryPrice) * 0.85 ;
        }else  {
            finalPrice = videoCardsPrice + processorPrice + ramMemoryPrice;
        }

       if (budget >= finalPrice){
           System.out.printf("You have %.2f leva left!",budget - finalPrice);
       }else{
           System.out.printf("Not enough money! You need %.2f leva more!", finalPrice - budget);
       }
    }
}
