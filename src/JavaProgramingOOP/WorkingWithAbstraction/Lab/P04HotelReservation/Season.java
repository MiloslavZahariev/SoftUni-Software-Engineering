package JavaProgramingOOP.WorkingWithAbstraction.Lab.P04HotelReservation;

public enum Season {
    SUMMER(4),
    AUTUMN(1),
    WINTER(3),
    SPRING(2)
    ;

    private int multiplyCoefficient;

    public int getMultiplyCoefficient() {
        return multiplyCoefficient;
    }

    public void setMultiplyCoefficient(int multiplyCoefficient) {
        this.multiplyCoefficient = multiplyCoefficient;
    }

    Season(int multiplyCoefficient) {
        this.multiplyCoefficient = multiplyCoefficient;
    }
}
