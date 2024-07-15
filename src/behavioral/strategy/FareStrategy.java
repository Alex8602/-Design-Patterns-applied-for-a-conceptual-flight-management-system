package behavioral.strategy;

import creational.builder.Booking;

public class FareStrategy {
    private FareCalculation fareCalculation;

    public void setFareCalculation(FareCalculation fareCalculation) {
        this.fareCalculation = fareCalculation;
    }

    public float getFare(Booking booking) {
        return this.fareCalculation.calculateFare(booking);
    }
}
