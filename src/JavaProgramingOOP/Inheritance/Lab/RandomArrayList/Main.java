package JavaProgramingOOP.Inheritance.Lab.RandomArrayList;


public class Main {
    public static void main(String[] args) {

        RandomArrayList<String> list = new RandomArrayList<String>();

        list.add("15");
        list.add("615");
        list.add("25");
        list.add("4");

        System.out.println(list.getRandomElement());
    }
}
