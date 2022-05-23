package JavaProgramingBasics.ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFlower = scanner.nextLine();
        int countFlower = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double priceRoses = 5;
        double priceDahlias = 3.8;
        double priceTulips = 2.8;
        double priceNarcissus = 3;
        double priceGladiolus = 2.5;

        double price = 0;
        switch (typeFlower) {
            case "Roses" :
                price = countFlower * priceRoses;
                if (countFlower > 80) {
                    price = price * 0.9;
                }
                break;
            case "Dahlias" :
                price = countFlower * priceDahlias;
                if(countFlower > 90){
                    price = price * 0.85;
                }
                break;
            case "Tulips" :
                price = countFlower * priceTulips;
                if ( countFlower > 80){
                    price = price * 0.85;
                }
                break;
            case "Narcissus" :
                price = countFlower * priceNarcissus;
                if (countFlower < 120) {
                    price = price * 1.15;
                }
                break;
            case "Gladiolus" :
                price = countFlower * priceGladiolus;
                if (countFlower < 80){
                    price = price * 1.2;
                }
                break;
        }
        if (price <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",countFlower,typeFlower , budget - price);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.",price - budget);
        }
    }
}
