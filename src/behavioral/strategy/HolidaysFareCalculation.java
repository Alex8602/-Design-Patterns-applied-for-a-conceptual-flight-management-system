package behavioral.strategy;

import creational.builder.Booking;

public class HolidaysFareCalculation implements  FareCalculation {

    @Override
    public float calculateFare(Booking booking) {
        float fare = 0.0F;
        if (booking.getAdults() > 0) {
            fare += booking.getAdults() * 1.20F * booking.getSeatClass().getPrice();
        }
        if (booking.getChildren() > 0) {
            fare += booking.getChildren() * 1.0F * booking.getSeatClass().getPrice();
        }
        return fare;
    }
}
