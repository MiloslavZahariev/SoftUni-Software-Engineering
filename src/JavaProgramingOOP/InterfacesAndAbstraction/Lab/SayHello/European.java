package JavaProgramingOOP.InterfacesAndAbstraction.Lab.SayHello;

public class European extends BasePerson{


    public European(String name) {
        super(name);
    }


    @Override
    public String sayHello() {
        return "Hello";
    }
}
