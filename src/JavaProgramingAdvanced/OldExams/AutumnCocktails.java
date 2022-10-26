package JavaProgramingAdvanced.OldExams;

import java.util.*;

public class AutumnCocktails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ingredientsInput = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] freshnessInput = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> ingredientsQueue = new ArrayDeque<>();
        Deque<Integer> freshnessStack = new ArrayDeque<>();

        Arrays.stream(ingredientsInput).forEach(ingredientsQueue::offer);
        Arrays.stream(freshnessInput).forEach(freshnessStack::push);

        Map<String, Integer> cocktailMap = new TreeMap<>();
        cocktailMap.put("Pear Sour", 0);
        cocktailMap.put("The Harvest", 0);
        cocktailMap.put("Apple Hinny", 0);
        cocktailMap.put("High Fashion", 0);

        while (!ingredientsQueue.isEmpty() && !freshnessStack.isEmpty()) {
            int currentIngredient = ingredientsQueue.poll();
            if (currentIngredient == 0) {
                continue;
            }
            int currentFreshness = freshnessStack.pop();

            int multiplication = currentFreshness * currentIngredient;
            int currentCount = 0;

            switch (multiplication) {
                case 150:
                    currentCount = cocktailMap.get("Pear Sour");
                    cocktailMap.put("Pear Sour", currentCount + 1);
                    break;
                case 250:
                    currentCount = cocktailMap.get("The Harvest");
                    cocktailMap.put("The Harvest", currentCount + 1);
                    break;
                case 300:
                    currentCount = cocktailMap.get("Apple Hinny");
                    cocktailMap.put("Apple Hinny", currentCount + 1);
                    break;
                case 400:
                    currentCount = cocktailMap.get("High Fashion");
                    cocktailMap.put("High Fashion", currentCount + 1);
                    break;
                default:
                    currentIngredient += 5;
                    ingredientsQueue.offer(currentIngredient);
                    break;
            }
        }

        boolean isPartyTime = true;
        StringBuilder sb = new StringBuilder();

        for (var entry : cocktailMap.entrySet()) {
            if (entry.getValue() <= 0) {
                isPartyTime = false;
            } else {
                sb.append("# ").append(entry.getKey()).append(" --> ").append(entry.getValue()).append(System.lineSeparator());
            }
        }

        if (isPartyTime) {
            System.out.println("It's party time! The cocktails are ready!");
        }else {
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");
        }
        if(!ingredientsQueue.isEmpty()){
            int sum = 0;

            for (Integer integer : ingredientsQueue) {
                sum += integer;
            }
            System.out.printf("Ingredients left: %d%n",sum);
        }
        System.out.println(sb.toString());
    }
}
