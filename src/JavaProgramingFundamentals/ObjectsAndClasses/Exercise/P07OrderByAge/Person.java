package JavaProgramingFundamentals.ObjectsAndClasses.Exercise.P07OrderByAge;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String iD;
    private int age;

    public Person(String name, String iD, int age) {
        this.name = name;
        this.iD = iD;
        this.age = age;
    }
    @Override
    public String toString(){
        return String.format("%s with ID: %s is %d years old.",this.name,this.iD,this.age);
    }
}
