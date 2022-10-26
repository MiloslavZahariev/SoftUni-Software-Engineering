package JavaProgramingAdvanced.OldExams.easterBasket;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Basket {
    private List<Egg> data;
    private String material;
    private int capacity;


    public Basket(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void addEgg(Egg egg) {
        if (data.size() < capacity) {
            data.add(egg);
        }
    }

    public boolean removeEgg(String color) {
        Egg tempEgg = getEgg(color);
        return data.remove(tempEgg);
    }


    public Egg getEgg(String color) {
        for (Egg egg : data) {
            if (egg.getColor().equals(color)) {
                return egg;
            }
        }
        return null;
    }

    public Egg getStrongestEgg() {
        return data.stream().max(Comparator.comparingInt(Egg::getStrength)).orElse(null);
    }

    public int getCount() {
        return data.size();
    }

    public String report() {
        StringBuilder sb = new StringBuilder(material).append(" basket contains:");
        for (Egg egg : data) {
            sb.append(System.lineSeparator()).append(egg);
        }
        return sb.toString();
    }

}
