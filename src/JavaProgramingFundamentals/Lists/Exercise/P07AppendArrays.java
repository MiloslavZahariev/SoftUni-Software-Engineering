package JavaProgramingFundamentals.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class P07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        for (int i = list.size() - 1; i >= 0; i--) {
            String element = list.get(i);

            printElement(element);
        }


        System.out.println();
    }

    private static void printElement(String element) {
        List<String> elements = Arrays.stream(element.split(" +")).collect(Collectors.toList());

        for (String ele : elements) {
            if (!ele.equals("")) {
                System.out.print(ele + " ");
            }
        }
    }
}
