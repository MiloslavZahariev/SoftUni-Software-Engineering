package JavaProgramingFundamentals.MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03TheAngryCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays
                .stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int entryPoint = Integer.parseInt(scanner.nextLine());
        String typeOfItem = scanner.nextLine();

        int entryPointRating = integerList.get(entryPoint);

        switch (typeOfItem) {

            case "cheap":
                if (leftSumOfcheap(integerList, entryPoint, entryPointRating) >= rightSumOfcheap(integerList, entryPoint, entryPointRating)) {
                    System.out.printf("Left - %d", leftSumOfcheap(integerList, entryPoint, entryPointRating));
                } else {
                    System.out.printf("Right - %d", rightSumOfcheap(integerList, entryPoint, entryPointRating));
                }
                break;
            case "expensive":
                if (leftSumOfExpensive(integerList, entryPoint, entryPointRating) >= rightSumOfExpensive(integerList, entryPoint, entryPointRating)){
                    System.out.printf("Left - %d", leftSumOfExpensive(integerList,entryPoint,entryPointRating));
                }else{
                    System.out.printf("Right - %d",rightSumOfExpensive(integerList, entryPoint, entryPointRating));
                }


                    break;
        }

        System.out.println();
    }

    private static int rightSumOfExpensive(List<Integer> integerList, int entryPoint, int entryPointRating) {
        int sum = 0;
        for (int i = entryPoint + 1; i < integerList.size(); i++) {
            if (integerList.get(i) >= entryPointRating) {
                sum += integerList.get(i);
            }
        }
        return sum;
    }

    private static int leftSumOfExpensive(List<Integer> integerList, int entryPoint, int entryPointRating) {
        int sum = 0;
        for (int i = 0; i < entryPoint; i++) {
            if (integerList.get(i) >= entryPointRating) {
                sum += integerList.get(i);
            }
        }
        return sum;
    }

    private static int rightSumOfcheap(List<Integer> integerList, int entryPoint, int entryPointRating) {
        int sum = 0;
        for (int i = entryPoint + 1; i < integerList.size(); i++) {
            if (integerList.get(i) < entryPointRating) {
                sum += integerList.get(i);
            }
        }
        return sum;
    }

    private static int leftSumOfcheap(List<Integer> integerList, int entryPoint, int entryPointRating) {
        int sum = 0;
        for (int i = 0; i < entryPoint; i++) {
            if (integerList.get(i) < entryPointRating) {
                sum += integerList.get(i);
            }
        }
        return sum;
    }
}
