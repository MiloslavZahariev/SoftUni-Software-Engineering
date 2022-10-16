package Demo.OldExams;

import java.util.*;

public class ItsChocolateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] milkValues = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        double[] cacaoValues = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Deque<Double> milkQueue = new ArrayDeque<>();
        Deque<Double> cacaoStack = new ArrayDeque<>();

        Map<String, Integer> chocolateMap = new TreeMap<>();
        chocolateMap.put("Milk Chocolate", 0);
        chocolateMap.put("Dark Chocolate", 0);
        chocolateMap.put("Baking Chocolate", 0);

        for (Double milkValue : milkValues) {
            milkQueue.offer(milkValue);
        }
        for (Double cacaoValue : cacaoValues) {
            cacaoStack.push(cacaoValue);
        }

        while (!milkQueue.isEmpty() && !cacaoStack.isEmpty()) {

            double currentMilkValue = milkQueue.poll();
            double currentCacaoValue = cacaoStack.pop();

            double percent = currentCacaoValue / (currentMilkValue + currentCacaoValue);

            if (percent == 0.3) {
                int currentCount = chocolateMap.get("Milk Chocolate");
                chocolateMap.put("Milk Chocolate", currentCount + 1);
            } else if (percent == 0.5) {
                int currentCount = chocolateMap.get("Dark Chocolate");
                chocolateMap.put("Dark Chocolate", currentCount + 1);
            } else if (percent == 1.0) {
                int currentCount = chocolateMap.get("Baking Chocolate");
                chocolateMap.put("Baking Chocolate", currentCount + 1);
            } else {
                currentMilkValue += 10;
                milkQueue.offer(currentMilkValue);
            }

        }

        if (chocolateMap.get("Milk Chocolate") > 0 && chocolateMap.get("Dark Chocolate") > 0
                && chocolateMap.get("Baking Chocolate") > 0){
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
            for (Map.Entry<String, Integer> entry : chocolateMap.entrySet()) {
                System.out.printf("# %s --> %d%n",entry.getKey(),entry.getValue());
            }

        }else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
            for (Map.Entry<String, Integer> entry : chocolateMap.entrySet()) {
                if(entry.getValue()> 0){
                    System.out.printf("# %s --> %d%n",entry.getKey(),entry.getValue());
                }
            }

        }


    }
}
