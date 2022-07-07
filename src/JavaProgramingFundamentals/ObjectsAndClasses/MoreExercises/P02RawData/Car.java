package JavaProgramingFundamentals.ObjectsAndClasses.MoreExercises.P02RawData;


import java.util.List;

public class Car {

    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tyre> tyreList;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public List<Tyre> getTyreList() {
        return tyreList;
    }

    public void setTyreList(List<Tyre> tyreList) {
        this.tyreList = tyreList;
    }

    public Car(String model, Engine engine, Cargo cargo, List<Tyre> tyre) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tyreList = tyre;
    }

    public boolean lowerPressure(List<Tyre> tyreList){
        for (Tyre tyre : tyreList) {
            if(tyre.getTyrePressure() < 1){
                return true;
            }
        }
        return false;
    }
}
