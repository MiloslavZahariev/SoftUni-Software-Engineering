package shelter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shelter {

    private List<Animal> data;
    private int capacity;

    public Shelter(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Animal animal) {
        if (capacity > data.size()) {
            data.add(animal);
        }
    }

    public boolean remove(String name) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getName().equals(name)) {
                data.remove(i);
                return true;
            }
        }
        return false;
    }

    public Animal getAnimal(String name, String caretaker) {
        return data.stream()
                .filter(a -> a.getName().equals(name) && a.getCaretaker().equals(caretaker))
                .findFirst()
                .orElse(null);
    }

    public Animal getOldestAnimal() {
        return data.stream().max(Comparator.comparingInt(Animal::getAge)).orElse(null);
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder("The shelter has the following animals:");
        for (Animal animal : data) {
            sb.append(System.lineSeparator()).append(animal.getName()).append(" ").append(animal.getCaretaker());
        }
        return sb.toString();
    }


}
