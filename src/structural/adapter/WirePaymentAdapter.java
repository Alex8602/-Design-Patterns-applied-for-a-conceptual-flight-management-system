package structural.adapter;

public class WirePaymentAdapter implements BookingPaymentAPI {
    private WirePayment wirePayment;

    public WirePaymentAdapter(WirePayment wirePayment) {
        this.wirePayment = wirePayment;
    }
    @Override
    public void processPaymentViaBooking(PaymentDetails details) {
        wirePayment.transmitThenVerifyAndProcess(details);
    }
}
