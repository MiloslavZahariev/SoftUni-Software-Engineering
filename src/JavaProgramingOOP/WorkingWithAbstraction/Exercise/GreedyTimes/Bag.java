package JavaProgramingOOP.WorkingWithAbstraction.Exercise.GreedyTimes;

import java.util.*;

public class Bag {

    private long capacity;
    private static long currentCapacity;
    private long gold;
    private Set<Item> gems;
    private Set<Item> cashes;

    private boolean goldTest = false;

    public Bag(long capacity) {
        this.capacity = capacity;
        this.gold = 0;
        this.gems = new TreeSet<>();
        this.cashes = new TreeSet<>();

    }

    public void put(Item item) {
        if (haveCapacity(item) && item.getItemType() != null) {
            switch (item.getItemType()) {
                case GOLD:
                    gold += item.getAmount();
                    goldTest = true;
                    currentCapacity += item.getAmount();
                    break;
                case GEM:
                    if (isConditionTrue(gold, getTotalAmount(gems), item.getAmount())) {
                        boolean isContain = false;
                        for (Item gem : gems) {
                            if (gem.getItemName().equalsIgnoreCase(item.getItemName())) {
                                gem.setAmount(gem.getAmount() + item.getAmount());
                                isContain = true;
                                break;
                            }
                        }
                        if (!isContain) {
                            gems.add(item);
                        }

                        currentCapacity += item.getAmount();
                    }
                    break;
                case CASH:
                    if (isConditionTrue(getTotalAmount(gems), getTotalAmount(cashes), item.getAmount())) {
                        boolean isContain = false;
                        for (Item cash : cashes) {
                            if (cash.getItemName().equals(item.getItemName())) {
                                cash.setAmount(cash.getAmount() + item.getAmount());
                                isContain = true;
                            }
                        }
                        if (!isContain) {
                            cashes.add(item);
                        }


                        currentCapacity += item.getAmount();
                    }
                    break;
            }
        }

    }


    private boolean isConditionTrue(long biggerAmount, long smallAmount, long amount) {
        return biggerAmount >= smallAmount + amount;
    }

    private long getTotalAmount(Set<Item> items) {
        long totalAmount = 0;
        for (Item item : items) {
            totalAmount += item.getAmount();
        }
        return totalAmount;
    }


    private boolean haveCapacity(Item item) {
        return capacity >= currentCapacity + item.getAmount();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (goldTest) {
            sb.append("<Gold> $").append(gold).append(System.lineSeparator());
            sb.append("##Gold - ").append(gold).append(System.lineSeparator());
        }
        if (!gems.isEmpty()) {
            sb.append("<Gem> $").append(getTotalAmount(gems)).append(System.lineSeparator());
            for (Item gem : gems) {
                sb.append("##").append(gem.getItemName()).append(" - ").append(gem.getAmount()).append(System.lineSeparator());
            }
        }
        if (!cashes.isEmpty()) {
            sb.append("<Cash> $").append(getTotalAmount(cashes)).append(System.lineSeparator());
            for (Item cash : cashes) {
                sb.append("##").append(cash.getItemName()).append(" - ").append(cash.getAmount()).append(System.lineSeparator());
            }
        }

        return sb.toString();
    }
}
