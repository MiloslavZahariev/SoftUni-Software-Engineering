package JavaProgramingAdvanced.IteratorsAndComparators.Exercise.ComparingObject;

public class Person implements Comparable<Person> {

   private String name;
   private int age;
   private String town;

    public Person(String name, int age, String town) {
        setName(name);
        setAge(age);
        setTown(town);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }


    @Override
    public int compareTo(Person other) {
        if(this.name.equals(other.getName()) && this.age == other.age && this.town.equals(other.getTown())){
            return 0;
        }


      return -1;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s",getName(),getAge(),getTown());
    }
}
