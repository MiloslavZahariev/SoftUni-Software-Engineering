package JavaProgramingAdvanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P01CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[][] firstMatrix = new int[dimensions[0]][dimensions[1]];

        for (int i = 0; i < dimensions[0]; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            firstMatrix[i] = arr;
        }
        dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[][] secondMatrix = new int[dimensions[0]][dimensions[1]];

        for (int i = 0; i < dimensions[0]; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            secondMatrix[i] = arr;
        }

        boolean areEqual = firstMatrix.length == secondMatrix.length;
        if(areEqual){
            for (int i = 0; i < firstMatrix.length ; i++) {
                int[] firstArr = firstMatrix[i];
                int[] secondArr = secondMatrix[i];

                if(firstArr.length == secondArr.length){
                    for (int j = 0; j < firstArr.length ; j++) {
                        if(firstArr[j] != secondArr[j]){
                            areEqual = false;
                            break;
                        }
                    }
                }else{
                    areEqual = false;
                    break;
                }
            }
        }

        System.out.println(areEqual ? "equal" : "not equal");


    }
}
