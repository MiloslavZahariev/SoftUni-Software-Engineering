package JavaProgramingOOP.Polymorphism.Lab.Shapes;

public class Main {
    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle(4.0,5.0);

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());


        Circle circle = new Circle(10.0);

        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
    }
}
