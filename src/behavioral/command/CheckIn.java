package behavioral.command;

import creational.builder.Booking;

public class CheckIn implements Command {
    private Booking booking;

    public CheckIn(Booking booking) {
        this.booking = booking;
    }

    @Override
    public void execute() {
        System.out.println("Booking id " + booking.getId() + " checked in");
    }
}
