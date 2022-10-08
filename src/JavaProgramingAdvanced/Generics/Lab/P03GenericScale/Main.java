package JavaProgramingAdvanced.Generics.Lab.P03GenericScale;

public class Main {
    public static void main(String[] args) {


        String mimi = "Nikolay";
        String niki = "Nikolay";

        Scale<String> scale = new Scale<>(mimi, niki);

        System.out.println(scale.getHeavier());
    }
}
