package JavaProgramingFundamentals.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> distance = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        int sumRemoved = 0;
        while (distance.size() != 0) {
            int index = Integer.parseInt(scanner.nextLine());
            if (index < 0) {
                int firstElement = distance.get(0);
                int lastElement = distance.get(distance.size() - 1);
                sumRemoved += firstElement;
                distance.set(0, lastElement);
                modifyList(distance, firstElement);

            } else if (index > distance.size() - 1) {
                int firstElement = distance.get(0);
                int lastElement = distance.get(distance.size() - 1);
                sumRemoved += lastElement;
                distance.set(distance.size() - 1, firstElement);
                modifyList(distance, lastElement);
            } else {
                int removedElement = distance.get(index);
                distance.remove(index);
                sumRemoved += removedElement;
                modifyList(distance, removedElement);

            }
        }

        System.out.println(sumRemoved);
    }

    public static void modifyList(List<Integer> list, int removedElement) {
        for (int i = 0; i < list.size() ; i++) {
            int currentElement = list.get(i);
            if (currentElement <= removedElement){
                currentElement += removedElement;
            }else {
                currentElement -= removedElement;
            }
            list.set(i,currentElement);
        }

    }
}
