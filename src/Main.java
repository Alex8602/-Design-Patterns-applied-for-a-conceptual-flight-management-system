import behavioral.command.*;
import behavioral.strategy.FareStrategy;
import behavioral.strategy.HolidaysFareCalculation;
import creational.builder.Booking;
import creational.factory_method.Factory;
import creational.factory_method.SeatClass;
import creational.factory_method.SeatClassFactory;
import creational.factory_method.SeatClassType;
import structural.adapter.BookingPaymentAPI;
import structural.adapter.CardPayment;
import structural.adapter.CardPaymentAdapter;
import structural.adapter.PaymentDetails;

public class Main {
    public static void main(String[] args) {
        Factory classSeatFactory = new SeatClassFactory();
        SeatClass firstClass = classSeatFactory.create(SeatClassType.FIRST_CLASS, 5, 2, 25, 2055);
        firstClass.decreasePrice(10);
        firstClass.display();

        Booking booking = new Booking.BookingBuilder("12AS", "OTP", "BCN", "12-06-24", firstClass)
                .setInsurance()
                .setTransport()
                .build();

        booking.display();

        FareStrategy fareStrategy = new FareStrategy();
        fareStrategy.setFareCalculation(new HolidaysFareCalculation());

        PaymentDetails details = new PaymentDetails("12", "23331", fareStrategy.getFare(booking));
        BookingPaymentAPI paymentAPI = new CardPaymentAdapter(new CardPayment());
        paymentAPI.processPaymentViaBooking(details);

        Command command = new CheckIn(booking);
        command.execute();
        command = new Cancel(booking);
        command.execute();
        command = new Refund(booking);
        command.execute();
    }
}
