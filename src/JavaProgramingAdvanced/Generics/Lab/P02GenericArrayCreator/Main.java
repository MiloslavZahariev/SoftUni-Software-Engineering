package JavaProgramingAdvanced.Generics.Lab.P02GenericArrayCreator;

public class Main {
    public static void main(String[] args) {


        String[] names = ArrayCreator.create(2, "Miloslav");

        for (String name: names) {
            System.out.println(name);
        }
    }
}
