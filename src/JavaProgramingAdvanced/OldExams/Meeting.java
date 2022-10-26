package JavaProgramingAdvanced.OldExams;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Meeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String maleInput = scanner.nextLine();
        Deque<Integer> maleStack = new ArrayDeque<>();
        Arrays.stream(maleInput.split(" ")).map(Integer::parseInt).forEach(maleStack::push);

        String femaleInput = scanner.nextLine();
        Deque<Integer> femaleQueue = new ArrayDeque<>();
        Arrays.stream(femaleInput.split(" ")).map(Integer::parseInt).forEach(femaleQueue::offer);

        int matches = 0;

        while (!maleStack.isEmpty() && !femaleQueue.isEmpty()) {
            int currentMale = maleStack.peek();
            int currentFemale = femaleQueue.peek();

            if (currentMale <= 0) {
                maleStack.pop();
                continue;
            }
            if (currentFemale <= 0) {
                femaleQueue.poll();
                continue;
            }

            if (currentMale % 25 == 0) {
                maleStack.pop();
                maleStack.pop();
                continue;
            }
            if (currentFemale % 25 == 0) {
                femaleQueue.poll();
                femaleQueue.poll();
                continue;
            }


            if (currentMale == currentFemale) {
                maleStack.pop();
                femaleQueue.poll();
                matches++;
            } else {
                maleStack.pop();
                maleStack.push(currentMale - 2);
                femaleQueue.poll();
            }

        }

        System.out.println("Matches: " + matches);
        if(maleStack.isEmpty()){
            System.out.println("Males left: none");
        }else {
            System.out.print("Males left: ");
            System.out.println(maleStack.toString().replace("[","").replace("]",""));
        }

        if(femaleQueue.isEmpty()){
            System.out.println("Females left: none");
        }else {
            System.out.print("Females left: ");
            System.out.println(femaleQueue.toString().replace("[","").replace("]",""));
        }

    }
}
