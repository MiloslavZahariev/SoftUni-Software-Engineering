package JavaProgramingAdvanced.IteratorsAndComparators.Exercise.EqualityLogic;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return String.format("%s %d", name, age);
    }

    @Override
    public int compareTo(Person other) {
        if(name.compareTo(other.name) == 0){
            return age - other.age;
        }
        return name.compareTo(other.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
