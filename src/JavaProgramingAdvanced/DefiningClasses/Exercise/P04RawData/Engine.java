package JavaProgramingAdvanced.DefiningClasses.Exercise.P04RawData;

public class Engine {
    private int speed;
    private int power;

    public Engine(int engineSpeed, int enginePower) {
        this.speed = engineSpeed;
        this.power = enginePower;
    }

    public int getEngineSpeed() {
        return speed;
    }

    public void setEngineSpeed(int engineSpeed) {
        this.speed = engineSpeed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
