package Demo.OldExams.aquarium;

import java.util.LinkedHashSet;
import java.util.Set;

public class Aquarium {

    public String name;
    public int capacity;
    public int size;
    public Set<Fish> fishInPool;

    public Aquarium(String name, int capacity, int size) {
        this.name = name;
        this.capacity = capacity;
        this.size = size;
        this.fishInPool =new LinkedHashSet<>();
    }


    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public int getFishInPool() {
        return fishInPool.size();
    }

    public void add(Fish fish) {
        if (capacity > fishInPool.size())
            fishInPool.add(fish);
    }

    public boolean remove(String name) {
      Fish tempFish = findFish(name);
     return fishInPool.remove(tempFish);
    }

    public Fish findFish(String name) {
        for (Fish fish : fishInPool) {
            if (fish.getName().equals(name)) {
                return fish;
            }
        }
        return null;
    }

    public String report() {
        StringBuilder sb = new StringBuilder("Aquarium: ").append(name).append(" ^ Size: ").append(size);
        for (Fish fish : fishInPool) {
            sb.append(System.lineSeparator()).append(fish.toString());
        }

        return sb.toString();
    }
}
