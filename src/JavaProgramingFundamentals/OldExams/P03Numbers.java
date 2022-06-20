package JavaProgramingFundamentals.OldExams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        int sum = 0;
        for (Integer value : numList) {
            sum += value;
        }

        double averageNum = (1.0 * sum) / numList.size();

        Collections.sort(numList);
        Collections.reverse(numList);

        int counter = 0;
        for (Integer integer : numList) {
            if (integer > averageNum && counter < 5) {
                System.out.print(integer + " ");
                counter++;
            }
        }

        if (counter == 0){
            System.out.println("No");
        }
    }
}
