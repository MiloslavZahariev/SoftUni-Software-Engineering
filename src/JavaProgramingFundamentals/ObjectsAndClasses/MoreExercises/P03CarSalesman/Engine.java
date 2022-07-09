package JavaProgramingFundamentals.ObjectsAndClasses.MoreExercises.P03CarSalesman;

public class Engine {

    private String engineModel;
    private String Power;
    private String Displacement = "n/a";
    private String Efficiency = "n/a";

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public String getPower() {
        return Power;
    }

    public void setPower(String power) {
        Power = power;
    }

    public String getDisplacement() {
        return Displacement;
    }

    public void setDisplacement(String displacement) {
        Displacement = displacement;
    }

    public String getEfficiency() {
        return Efficiency;
    }

    public void setEfficiency(String efficiency) {
        Efficiency = efficiency;
    }

    public Engine(String engineModel, String power) {
        this.engineModel = engineModel;
        Power = power;
    }

}
