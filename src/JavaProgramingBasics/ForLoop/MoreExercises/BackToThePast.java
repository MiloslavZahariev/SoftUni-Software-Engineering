package JavaProgramingBasics.ForLoop.MoreExercises;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int lifeYear = Integer.parseInt(scanner.nextLine());

        double spendMoney = 0.0 ;
        int age = 17;
        int startYear = 1800;

        for (int i = 1800; i <= lifeYear ; i++) {
            age ++;
            if ( i % 2 == 0){
                spendMoney += 12000;
            }else {
                spendMoney += 12000 + (50*age);
            }
        }
        if(money - spendMoney >= 0){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",money - spendMoney);
        }else  {
            System.out.printf("He will need %.2f dollars to survive.",Math.abs(money - spendMoney));
        }


    }
}
