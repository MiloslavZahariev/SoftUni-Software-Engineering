package JavaProgramingOOP.Inheritance.Exercise.NeedForSpeed;

public class Main {
    public static void main(String[] args) {


        Vehicle car = new CrossMotorcycle(20,220);

        car.drive(2);
        System.out.println(car.getFuel());
    }
}
