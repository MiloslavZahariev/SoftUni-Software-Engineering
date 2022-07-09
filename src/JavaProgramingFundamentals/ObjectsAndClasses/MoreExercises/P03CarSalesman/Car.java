package JavaProgramingFundamentals.ObjectsAndClasses.MoreExercises.P03CarSalesman;

public class Car {

    private String carModel;
    private Engine engine;
    private String weight = "n/a";
    private String color = "n/a";

    public Car(String carModel, Engine engine) {
        this.carModel = carModel;
        this.engine = engine;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s:%n  %s:%n    Power: %s%n    Displacement: %s%n    Efficiency: %s%n  Weight: %s%n  Color: %s"
                , carModel, engine.getEngineModel(), engine.getPower(), engine.getDisplacement(), engine.getEfficiency()
                , weight, color);
    }
}
