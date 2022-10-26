package JavaProgramingOOP.WorkingWithAbstraction.Lab.P04HotelReservation;

public class PriceCalculator {

    public static double calculateHolidayPrice(double pricePerDay, int days, Season season, Discount discount) {
        double price = pricePerDay * days;
        price *= season.getMultiplyCoefficient();
        price = price - (price * discount.getPercent());

        return price;
    }
}
