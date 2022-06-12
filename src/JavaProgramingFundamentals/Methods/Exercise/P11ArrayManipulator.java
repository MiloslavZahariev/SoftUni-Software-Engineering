package JavaProgramingFundamentals.Methods.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P11ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] integerArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")) {

            if (command[0].equals("exchange")) {
                int index = Integer.parseInt(command[1]);
                integerArray = Arrays.copyOf(splitAndExchangeArray(integerArray, index), integerArray.length);

            } else if (command[0].equals("max")) {
                String evenOrOdd = command[1];
                if ((getMaxEvenOrOddIndex(integerArray, evenOrOdd) >= 0)) {
                    System.out.println(getMaxEvenOrOddIndex(integerArray, evenOrOdd));
                }
            } else if (command[0].equals("min")) {
                String evenOrOdd = command[1];
                if ((getMaxEvenOrOddIndex(integerArray, evenOrOdd) >= 0)) {
                    System.out.println(getMinEvenOrOddIndex(integerArray, evenOrOdd));
                }
            } else if (command[0].equals("first")) {
                String evenOrOdd = command[2];
                int index = Integer.parseInt(command[1]);
                if (index <= integerArray.length) {
                    System.out.println(Arrays.toString(getFirstNNumbers(integerArray, index, evenOrOdd)));
                } else {
                    System.out.println("Invalid count");
                }

            } else if (command[0].equals("last")) {
                String evenOrOdd = command[2];
                int index = Integer.parseInt(command[1]);
                if (index <= integerArray.length) {
                    System.out.println(Arrays.toString(getLastNNumbers(integerArray, index, evenOrOdd)));
                } else {
                    System.out.println("Invalid count");
                }

            }


            command = scanner.nextLine().split(" ");
        }

        System.out.println(Arrays.toString(integerArray));

    }

    private static int[] splitAndExchangeArray(int[] arr, int separator) {

        if (separator >= 0 && separator < arr.length) {
            int[] exchangeArr = new int[arr.length];
            int index = arr.length - 1 - separator;
            for (int i = 0; i <= separator; i++) {
                exchangeArr[index] = arr[i];
                index++;
            }
            index = 0;
            for (int i = separator + 1; i < arr.length; i++) {
                exchangeArr[index] = arr[i];
                index++;
            }
            return exchangeArr;
        }
        System.out.println("Invalid index");
        return arr;
    }

    private static int getMaxEvenOrOddIndex(int[] arr, String command) {
        int maxNumber = Integer.MIN_VALUE;
        int maxIndex = Integer.MIN_VALUE;
        boolean noEven = true;
        boolean noOdds = true;

        for (int i = 0; i < arr.length; i++) {
            if (command.equals("even") && arr[i] % 2 == 0) {
                int maxEven = arr[i];
                if (maxEven >= maxNumber) {
                    maxNumber = maxEven;
                    maxIndex = i;
                    noEven = false;
                }
            } else if (command.equals("odd") && arr[i] % 2 != 0) {
                int maxOdd = arr[i];
                if (maxOdd >= maxNumber) {
                    maxNumber = maxOdd;
                    maxIndex = i;
                    noOdds = false;
                }
            }
        }
        if ((command.equals("even") && noEven) || (command.equals("odd") && noOdds)) {
            System.out.println("No matches");
        }
        return maxIndex;
    }

    private static int getMinEvenOrOddIndex(int[] arr, String command) {
        int minNumber = Integer.MAX_VALUE;
        int minIndex = Integer.MAX_VALUE;
        boolean noEven = true;
        boolean noOdds = true;

        for (int i = 0; i < arr.length; i++) {
            if (command.equals("even") && arr[i] % 2 == 0) {
                int minEven = arr[i];
                if (minEven <= minNumber) {
                    minNumber = minEven;
                    minIndex = i;
                    noEven = false;
                }
            } else if (command.equals("odd") && arr[i] % 2 != 0) {
                int maxOdd = arr[i];
                if (maxOdd <= minNumber) {
                    minNumber = maxOdd;
                    minIndex = i;
                    noOdds = false;
                }
            }
        }
        if ((command.equals("even") && noEven) || (command.equals("odd") && noOdds)) {
            System.out.println("No matches");
        }
        return minIndex;
    }

    private static int[] getFirstNNumbers(int[] arr, int index, String command) {

        int evenCounter = 0;
        int oddCounter = 0;
        for (int element : arr) {
            if (element % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }
        if (index > evenCounter && command.equals("even")) {
            index = evenCounter;
        } else if (index > oddCounter && command.equals("odd")) {
            index = oddCounter;
        }

        int counter = 0;

        int[] firstNumbersArr = new int[index];
        for (int element : arr) {
            if (command.equals("even") && element % 2 == 0) {
                firstNumbersArr[counter] = element;
                counter++;
                if (counter == index) {
                    break;
                }
            } else if (command.equals("odd") && element % 2 != 0) {
                firstNumbersArr[counter] = element;
                counter++;
                if (counter == index) {
                    break;
                }
            }
        }

        return firstNumbersArr;
    }

    private static int[] getLastNNumbers(int[] arr, int index, String command) {

        int evenCounter = 0;
        int oddCounter = 0;
        for (int element : arr) {
            if (element % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }
        if (index > evenCounter && command.equals("even")) {
            index = evenCounter;
        } else if (index > oddCounter && command.equals("odd")) {
            index = oddCounter;
        }

        int counter = 0;

        int[] lastNumbersArr = new int[index];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (command.equals("even") && arr[i] % 2 == 0) {
                lastNumbersArr[counter] = arr[i];
                counter++;
                if (counter == index) {
                    break;
                }
            } else if (command.equals("odd") && arr[i] % 2 != 0) {
                lastNumbersArr[counter] = arr[i];
                counter++;
                if (counter == index) {
                    break;
                }
            }
        }

        int[] reverseLastNumbersArr = new int[lastNumbersArr.length];

        for (int i = 0; i < lastNumbersArr.length ; i++) {
            reverseLastNumbersArr[i] = lastNumbersArr[lastNumbersArr.length -1 - i];
        }

        return reverseLastNumbersArr;
    }
}
