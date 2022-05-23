package JavaProgramingBasics.FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fee = Integer.parseInt(scanner.nextLine());

        double sneakersPrice = fee * 0.6;
        double outfitPrice = sneakersPrice * 0.8;
        double ballPrice = outfitPrice / 4 ;
        double accessoriesPrice = ballPrice /5;

        double total = fee + sneakersPrice + outfitPrice +ballPrice + accessoriesPrice;

        System.out.println(total);


        }

    }

