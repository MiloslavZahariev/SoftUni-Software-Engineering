package JavaProgramingAdvanced.StackAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class P09PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfFlowers = Integer.parseInt(scanner.nextLine());

        int[] flowers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> tempStack = new ArrayDeque<>();

        int dayCounter =0;

        for (int i = 0; i < numberOfFlowers; i++) {
            stack.push(flowers[i]);
        }
        while (true) {
            int currentStackSize = stack.size();
            for (int i = 0; i < currentStackSize; i++) {
                int currentFlower = stack.pop();
                if (!stack.isEmpty() && currentFlower > stack.peek()) {

                } else {
                    tempStack.push(currentFlower);
                }
            }
            if (!tempStack.isEmpty()) {
                int currentTempStackSize = tempStack.size();{
                    if(currentStackSize == currentTempStackSize){
                        break;
                    }
                }
                for (int i = 0; i < currentTempStackSize; i++) {
                    if (!tempStack.isEmpty()) {
                        stack.push(tempStack.pop());
                    }
                }
            } else {
                break;
            }

            dayCounter++;
        }

        System.out.println(dayCounter);
    }
}