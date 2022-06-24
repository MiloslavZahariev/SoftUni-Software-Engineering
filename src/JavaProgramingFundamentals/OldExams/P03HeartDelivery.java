package JavaProgramingFundamentals.OldExams;

import java.util.Arrays;
import java.util.Scanner;

public class P03HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] housesArr = Arrays.stream(scanner.nextLine().split("@"))
                .mapToInt(Integer::parseInt).toArray();

        int [] visitHouses = new int[housesArr.length];

        String input = scanner.nextLine();

        int index = 0;
        int lastIndex = 0;

        while (!input.equals("Love!")){
            int jumpLength = Integer.parseInt(input.split(" ")[1]);
            index = index + jumpLength;

            if(!isValidIndex(housesArr,index)){
                index = 0;
            }
            housesArr[index] -= 2;

            if(housesArr[index] == 0 && visitHouses[index] != 1){
                System.out.printf("Place %d has Valentine's day.%n",index);
                visitHouses[index] = 1;
                //lastIndex = index;
            }else if(visitHouses[index] == 1){
                System.out.printf("Place %d already had Valentine's day.%n",index);
            }


            input = scanner.nextLine();
        }

        System.out.printf("Cupid's last position was %d.%n",index);



        if(countingVisitinPLaces(visitHouses) == visitHouses.length){
            System.out.println("Mission was successful.");
        }else{
            System.out.printf("Cupid has failed %d places.%n", visitHouses.length - countingVisitinPLaces(visitHouses));
        }

    }

    private static int countingVisitinPLaces(int[] visitHouses) {
        int counter = 0;
        for (int element :visitHouses) {
            if (element == 1){
                counter++;
            }
        }
        return counter;
    }

    private static boolean isValidIndex( int[] arr , int index){
        return arr.length > index && index >= 0;
    }
}
