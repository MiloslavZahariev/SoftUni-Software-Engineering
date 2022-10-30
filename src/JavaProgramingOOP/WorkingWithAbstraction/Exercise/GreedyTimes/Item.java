package JavaProgramingOOP.WorkingWithAbstraction.Exercise.GreedyTimes;

import java.util.Objects;

public class Item implements Comparable<Item>{

    private ItemType itemType;
    private String itemName;
    private long amount;

    public Item(String itemName, long amount) {
        this.itemType = findItemType(itemName);
        this.itemName = itemName;
        this.amount = amount;
    }


    private ItemType findItemType(String name) {
        ItemType itemType = null;
        if (name.length() == 3) {
            itemType = ItemType.CASH;
        } else if (name.toLowerCase().endsWith("gem")) {
            itemType = ItemType.GEM;
        } else if (name.toLowerCase().equals("gold")) {
            itemType = ItemType.GOLD;
        }

        return itemType;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public long getAmount() {
        return amount;
    }

    public String getItemName() {
        return itemName;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(itemName.toLowerCase(), item.itemName.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName.toLowerCase());
    }


    @Override
    public int compareTo(Item other) {
        return other.getItemName().compareTo(getItemName());
    }
}
