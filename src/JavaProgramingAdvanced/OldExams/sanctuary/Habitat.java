package JavaProgramingAdvanced.OldExams.sanctuary;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Habitat {

    private List<Elephant> data;
    private int capacity;

    public Habitat(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Elephant elephant) {
        if (capacity > data.size()) {
            data.add(elephant);
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

    public Elephant getElephant(String retiredFrom) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getRetiredFrom().equals(retiredFrom)) {
                return data.get(i);
            }
        }
        return null;
    }

    public Elephant getOldestElephant() {
        return data.stream().max(Comparator.comparingInt(Elephant::getAge)).orElse(null);
    }

    public int getAllElephants() {
        return data.size();
    }

    public String getReport() {
        StringBuilder sb = new StringBuilder("Saved elephants in the park:");
        for (Elephant elephant : data) {
            sb.append(System.lineSeparator()).append(elephant.getName()).append(" came from: ").append(elephant.getRetiredFrom());
        }


        return sb.toString();
    }

}
