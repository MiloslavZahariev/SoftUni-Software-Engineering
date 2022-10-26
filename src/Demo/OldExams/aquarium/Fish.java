package Demo.OldExams.aquarium;

import java.util.Objects;

public class Fish implements Comparable<Fish> {

    public String name;
    public String color;
    public int fins;


    public Fish(String name, String color, int fins) {
        this.name = name;
        this.color = color;
        this.fins = fins;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getFins() {
        return fins;
    }

    @Override
    public String toString() {
        return String.format("Fish: %s%nColor: %s%nNumber of fins: %d", name, color, fins);
    }

    @Override
    public int compareTo(Fish other) {
        return name.compareTo(other.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fish fish = (Fish) o;
        return Objects.equals(name, fish.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
