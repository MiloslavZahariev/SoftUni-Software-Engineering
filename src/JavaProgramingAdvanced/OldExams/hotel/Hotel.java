package JavaProgramingAdvanced.OldExams.hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private int capacity;
    private List<Person> roster;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();
    }

    public void add(Person person) {
        if (capacity > roster.size()) {
            roster.add(person);
        }
    }

    public boolean remove(String name) {
        for (int i = 0; i < roster.size(); i++) {
            if (roster.get(i).getName().equals(name)) {
                roster.remove(i);
                return true;
            }
        }
        return false;
    }

    public Person getPerson(String name, String hometown) {
        return roster.stream()
                .filter(p -> p.getName().equals(name) && p.getHometown().equals(hometown))
                .findFirst()
                .orElse(null);
    }

    public int getCount() {
        return roster.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder("The people in the JavaProgramingAdvanced.OldExams.hotel ").append(name).append(" are:");
        for (Person person : roster) {
            sb.append(System.lineSeparator()).append(person);
        }
        return sb.toString();
    }
}
