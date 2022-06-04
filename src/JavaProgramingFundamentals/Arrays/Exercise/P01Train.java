package JavaProgramingFundamentals.Arrays.Exercise;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countOfWagons = Integer.parseInt(scanner.nextLine());
        int[] wagonsArr = new int[countOfWagons];
        int totalPeople = 0;

        for (int i = 0; i < countOfWagons; i++) {
            wagonsArr[i] = Integer.parseInt(scanner.nextLine());
            totalPeople += wagonsArr[i];
        }

        for (int element : wagonsArr) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(totalPeople);
    }
}
