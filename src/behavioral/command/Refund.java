package behavioral.command;

import creational.builder.Booking;

public class Refund implements Command {
    private Booking booking;

    public Refund(Booking booking) {
        this.booking = booking;
    }


    @Override
    public void execute() {
        System.out.println("Booking id: "+ booking.getId() + " requested refund");
    }
}
