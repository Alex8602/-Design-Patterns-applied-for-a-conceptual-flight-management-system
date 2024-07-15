package creational.builder;

import creational.factory_method.SeatClass;

public class Booking {
    private String id, origin, destination, departureDate, returnDate;
    private int adults, children;
    private boolean hasInsurance, hasTransport;
    private SeatClass seatClass;
    private Booking(BookingBuilder builder) {
        this.id = builder.id;
        this.origin = builder.origin;
        this.destination = builder.destination;
        this.departureDate = builder.departureDate;
        this.returnDate = builder.returnDate;
        this.adults = builder.adults;
        this.children = builder.children;
        this.hasTransport = builder.hasTransport;
        this.hasInsurance = builder.hasInsurance;
        this.seatClass = builder.seatClass;
    }

    public void display() {
        System.out.println("*** Booking ***");
        System.out.println("\tID: " + id);
        System.out.println("\torigin: " + origin);
        System.out.println("\tdestination: " + destination);
        System.out.println("\tdeparture date: " + departureDate);
        System.out.println("\treturn date: " + returnDate);
        System.out.println("\tadults " + adults);
        System.out.println("\tchildren: " + children);
        System.out.println("\thas insurance: " + hasInsurance);
        System.out.println("\thas transport: " + hasTransport);
        System.out.println("\tseat class: ");
        seatClass.display();
    }

    public static class BookingBuilder {
        private String id, origin, destination, departureDate, returnDate;
        private int adults, children;
        private boolean hasInsurance, hasTransport;
        private SeatClass seatClass;

        public BookingBuilder(String id, String origin, String destination, String departureDate, SeatClass seatClass) {
            this.id = id;
            this.origin = origin;
            this.destination = destination;
            this.departureDate = departureDate;
            this.seatClass = seatClass;
            returnDate = "-";
            adults = 1;
            children = 0;
            hasInsurance = hasTransport = false;
        }

        public BookingBuilder setReturnDate(String returnDate) {
            this.returnDate = returnDate;
            return this;
        }

        public BookingBuilder setNumberOfAdultPassengers(int numberOfAdultPassengers) {
            this.adults = numberOfAdultPassengers;
            return this;
        }

        public BookingBuilder setNumberOfUnderagePassengers(int numberOfUnderagePassengers) {
            this.children = numberOfUnderagePassengers;
            return this;
        }

        public BookingBuilder setInsurance(){
            this.hasInsurance = true;
            return this;
        }

        public BookingBuilder setTransport() {
            this.hasTransport = true;
            return this;
        }

        public Booking build() {
            return new Booking(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public int getAdults() {
        return adults;
    }

    public int getChildren() {
        return children;
    }

    public boolean isHasInsurance() {
        return hasInsurance;
    }

    public boolean isHasTransport() {
        return hasTransport;
    }

    public SeatClass getSeatClass() {
        return seatClass;
    }
}
