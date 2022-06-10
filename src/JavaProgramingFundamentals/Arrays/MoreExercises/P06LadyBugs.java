package JavaProgramingFundamentals.Arrays.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P06LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] indexOfBugsArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] field = new int[fieldSize];


        for (int i = 0; i < indexOfBugsArr.length; i++) {
            if (indexOfBugsArr[i] >= 0 && indexOfBugsArr[i] < fieldSize) {
                field[indexOfBugsArr[i]] = 1;

            }
        }
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandArr = command.split(" ");
            int firstPosition = Integer.parseInt(commandArr[0]);
            if (firstPosition < 0 || firstPosition >= field.length) {
                command = scanner.nextLine();
                continue;
            }
            int travelLength = Integer.parseInt(commandArr[2]);
            if(travelLength == 0 ){
                command = scanner.nextLine();
                continue;
            }
            if(Math.abs(travelLength) > fieldSize){
                travelLength = 2 * fieldSize;
            }

            String direction = commandArr[1];
            int nextPosition = 0;
            switch (direction) {
                case "right":
                    nextPosition = firstPosition + travelLength;
                    break;
                case "left":
                    nextPosition = firstPosition - travelLength;
                    break;
            }

            while (nextPosition < field.length && nextPosition >= 0) {
                if (field[firstPosition] == 1) {
                    if (field[nextPosition] != 1) {
                        field[nextPosition] = 1;
                        field[firstPosition] = 0;
                        break;
                    } else {
                        switch (direction) {
                            case "right":
                                nextPosition += travelLength;
                                break;
                            case "left":
                                nextPosition -= travelLength;
                                break;
                        }
                    }
                } else {
                    field[firstPosition] = 0;
                    break;
                }
            }
            if (nextPosition >= field.length || nextPosition < 0) {
                field[firstPosition] = 0;
            }
            command = scanner.nextLine();
        }
        System.out.println(Arrays.toString(field)
                .replace("[", "")
                .replace("]", "")
                .replace(",", ""));
    }
}
