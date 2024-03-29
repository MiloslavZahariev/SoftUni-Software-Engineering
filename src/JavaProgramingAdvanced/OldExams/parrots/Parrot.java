package JavaProgramingAdvanced.OldExams.parrots;

public class Parrot {
    public String name;
    public String species;
    public boolean available;

    public Parrot(String name, String species) {
        this.name = name;
        this.species = species;
        this.available = true;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return String.format("Parrot (%s): %s",getSpecies(),getName());
    }
}
