package JavaProgramingAdvanced.IteratorsAndComparators.Exercise.StrategyPattern;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person f, Person s) {
        if (f.getName().length() - s.getName().length() == 0) {
            String firstName = f.getName().toLowerCase();
            String secondName = s.getName().toLowerCase();
            return firstName.charAt(0) - secondName.charAt(0);
        }
        return f.getName().length() - s.getName().length();

    }
}
