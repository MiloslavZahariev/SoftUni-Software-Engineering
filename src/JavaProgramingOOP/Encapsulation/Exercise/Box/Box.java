package JavaProgramingOOP.Encapsulation.Exercise.Box;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        validationValue(length, "Length");
        this.length = length;
    }


    private void setWidth(double width) {
        validationValue(width, "Width");
        this.width = width;
    }

    private void setHeight(double height) {
        validationValue(height, "Height");
        this.height = height;
    }

    public double calculateSurfaceArea() {
        return 2 * height * width + 2 * height * length + 2 * width * length;
    }

    public double calculateLateralSurfaceArea() {
        return 2 * height * width + 2 * height * length;
    }

    public double calculateVolume() {
        return length * width * height;
    }

    private void validationValue(double value, String valueName) {
        if (value <= 0) {
            String errorMessage = valueName + " cannot be zero or negative.";
            throw new IllegalArgumentException(errorMessage);
        }
    }
}
