package JavaProgramingAdvanced.DefiningClasses.Exercise.P08FamilyTree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String birthDate;
    private List<Person> parent = new ArrayList<>();
    private List<Person> child = new ArrayList<>();


    public Person(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Person(String value) {
        if (!value.contains("/")) {
            this.name = value;
        } else {
            this.birthDate = value;
        }
    }

    public List<Person> getParent() {
        return parent;
    }

    public void setParent(List<Person> parent) {
        this.parent = parent;
    }

    public List<Person> getChild() {
        return child;
    }

    public void setChild(List<Person> child) {
        this.child = child;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("%s %s", name, birthDate);
    }
}
