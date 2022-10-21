package Demo.OldExams.parrots;

import java.util.ArrayList;
import java.util.List;

public class Cage {
    public String name;
    public int capacity;
    public List<Parrot> data;


    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }


    public void add(Parrot parrot) {
        if (capacity > data.size()) {
            data.add(parrot);
        }
    }


    public int count() {
        return data.size();
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

    public Parrot sellParrot(String name) {
        for (Parrot datum : data) {
            if (datum.getName().equals(name)) {
                datum.setAvailable(false);
                return datum;
            }
        }
        return null;
    }

    public List<Parrot> sellParrotBySpecies(String species) {
        List<Parrot> sellingList = new ArrayList<>();
        for (Parrot datum : data) {
            if (datum.getSpecies().equals(species)) {
                sellingList.add(sellParrot(datum.name));
            }
        }
        return sellingList;
    }

    public String report() {
        StringBuilder sb = new StringBuilder("Parrots available at ").append(getName());
        for (Parrot datum : data) {
            if (datum.isAvailable()) {
                sb.append(System.lineSeparator()).append(datum);
            }
        }
        return sb.toString();
    }


    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
