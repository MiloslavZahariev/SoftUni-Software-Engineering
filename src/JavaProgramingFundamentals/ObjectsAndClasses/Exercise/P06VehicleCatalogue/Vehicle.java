package JavaProgramingFundamentals.ObjectsAndClasses.Exercise.P06VehicleCatalogue;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int power;

    public Vehicle(String type, String model, String color, int power) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.power = power;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
