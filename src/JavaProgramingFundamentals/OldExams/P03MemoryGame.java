package JavaProgramingFundamentals.OldExams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

       
        int moves = 0;

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            moves++;
            String element = "-" + moves + "a";
            int[] indexes = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            if (itIsCheat(indexes, numList.size())) {
                numList.add(numList.size() / 2, element);
                numList.add(numList.size() / 2, element);
                System.out.println("Invalid input! Adding additional elements to the board");
                input = scanner.nextLine();
                continue;
            }

            if (numList.get(indexes[0]).equals(numList.get(indexes[1]))){
                System.out.printf("Congrats! You have found matching elements - %s!%n",numList.get(indexes[0]));
                if (indexes[0] > indexes[1]){
                    numList.remove(indexes[0]);
                    numList.remove(indexes[1]);
                }else{
                    numList.remove(indexes[1]);
                    numList.remove(indexes[0]);
                }
            }else {
                System.out.println("Try again!");
            }

            if (numList.size() == 0){
                System.out.printf("You have won in %d turns!",moves);
                return;
            }

            input = scanner.nextLine();
        }

        System.out.println("Sorry you lose :(");
        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
    }

    private static boolean itIsCheat(int[] indexes, int listSize) {
        if (indexes[0] == indexes[1]) {
            return true;
        }
        if (indexes[0] < 0 || indexes[1] < 0) {
            return true;
        }
        if (indexes[0] > listSize - 1 || indexes[1] > listSize - 1) {
            return true;
        }

        return false;
    }
}
