package JavaProgramingOOP.InterfacesAndAbstraction.Lab.SayHello;

public class Chinese extends BasePerson{


    public Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
