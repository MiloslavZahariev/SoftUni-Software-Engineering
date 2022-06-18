package JavaProgramingFundamentals.Lists.MoreExercises;

import java.util.*;
import java.util.stream.Collectors;

public class P04MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> mixedList = new ArrayList<>();

        int smallestListSize = 0;
        int constrain1 = 0;
        int constrain2 = 0;


        int firstListSize = firstList.size();
        int secondListSize = secondList.size();
        if (firstListSize < secondListSize) {
            smallestListSize = firstListSize;
            constrain1 = secondList.get(0);
            constrain2 = secondList.get(1);

        } else if (secondListSize < firstListSize) {
            smallestListSize = secondListSize;
            constrain1 = firstList.get(firstListSize - 1);
            constrain2 = firstList.get(firstListSize - 2);
        }


        for (int i = 0; i < smallestListSize; i++) {
            mixedList.add(firstList.get(i));
            mixedList.add(secondList.get(secondListSize - 1 - i));
        }

        printMixedList(constrain1, constrain2, mixedList);
    }

    private static void printMixedList(int constrain1, int constrain2, List<Integer> mixedList) {
        int lowerConstrain = Math.min(constrain1,constrain2);
        int upperConstrain = Math.max(constrain1,constrain2);

        Collections.sort(mixedList);
        for (int i = 0; i < mixedList.size() ; i++) {
            if (mixedList.get(i) > lowerConstrain &&mixedList.get(i) < upperConstrain ){
                System.out.print(mixedList.get(i) + " ");
            }
        }
    }
}

