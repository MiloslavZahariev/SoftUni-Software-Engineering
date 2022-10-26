package JavaProgramingOOP.WorkingWithAbstraction.Lab.P04HotelReservation;

public enum Discount {
    VIP(20),
    SECONDVISIT(10),
    NONE(0),
    ;

    private double percent;

    Discount(double percent) {
        this.percent = percent / 100;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
