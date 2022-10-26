package Demo.OldExams;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int stamatInitCaff = 0;

        int[] caffeineInput = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] energyInput = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> caffeineStack = new ArrayDeque<>();
        Deque<Integer> energyQueue = new ArrayDeque<>();

        Arrays.stream(caffeineInput).forEach(caffeineStack::push);
        Arrays.stream(energyInput).forEach(energyQueue::offer);

        while (!caffeineStack.isEmpty() && !energyQueue.isEmpty()) {
            int currentCaffeine = caffeineStack.pop();
            int currentEnergy = energyQueue.poll();

            int multiply = currentCaffeine * currentEnergy;

            if (stamatInitCaff + multiply <= 300) {
                stamatInitCaff += multiply;
            } else {
                energyQueue.offer(currentEnergy);
                stamatInitCaff -= 30;
                if (stamatInitCaff < 0) {
                    stamatInitCaff = 0;
                }
            }


        }

        if(energyQueue.isEmpty()){
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        }else {
            System.out.printf("Drinks left: %s%n",energyQueue.toString().replace("[","").replace("]",""));
        }

        System.out.printf("Stamat is going to sleep with %d mg caffeine.%n",stamatInitCaff);



        System.out.println();

    }


}
