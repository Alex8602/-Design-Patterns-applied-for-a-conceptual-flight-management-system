package behavioral.strategy;

import creational.builder.Booking;

public interface FareCalculation {
    float calculateFare(Booking booking);
}
