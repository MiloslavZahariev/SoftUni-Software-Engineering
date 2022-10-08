package JavaProgramingAdvanced.DefiningClasses.Exercise.P04RawData;

import java.util.Arrays;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tyre[] tyres = new Tyre[4];

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Tyre[] getTyres() {
        return tyres;
    }

    public Car(String[] carData) {
        this.model = carData[0];
        this.engine = new Engine(Integer.parseInt(carData[1]), Integer.parseInt(carData[2]));
        this.cargo = new Cargo(Integer.parseInt(carData[3]), carData[4]);
        int count = 0;
        for (int i = 0; i < 8; i += 2) {
            this.tyres[count] = new Tyre(Double.parseDouble(carData[5 + i]), Integer.parseInt(carData[6 + i]));
            count++;
        }
    }


    public boolean getPressure(Tyre[] tyres) {
        for (Tyre tyre : tyres) {
            if (tyre.getPressure() < 1){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return model;
    }
}
