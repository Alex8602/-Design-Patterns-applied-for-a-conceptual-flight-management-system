package behavioral.command;

import creational.builder.Booking;

public class Cancel implements Command {
    private Booking booking;

    public Cancel(Booking booking) {
        this.booking = booking;
    }


    @Override
    public void execute() {
        System.out.println("Booking id: " + booking.getId() + " has requested cancellation");
    }
}
