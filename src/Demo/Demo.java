package Demo;

public class Demo {
    public static void main(String[] args) {


        print(1);
    }

    public static void print(int i){
        if(i >= 11){
            return;
        }

        System.out.println(i + " ");
        print(++i);

        System.out.println(i + " ");
    }
}
