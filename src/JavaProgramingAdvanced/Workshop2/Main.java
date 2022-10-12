package JavaProgramingAdvanced.Workshop2;

public class Main {
    public static void main(String[] args) {


        LinkedList<Double> list = new LinkedList<>();
        list.addFirst(3.5);
        list.addFirst(3.2);
        list.addFirst(5.2);
        list.addFirst(12.5);
        list.addFirst(31.5);

        System.out.println(list.removeLast());
        System.out.println(list.removeFirst());


        list.forEach(System.out::println);

    }
}
