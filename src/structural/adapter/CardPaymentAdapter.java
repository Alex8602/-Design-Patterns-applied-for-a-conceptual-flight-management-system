package structural.adapter;

public class CardPaymentAdapter implements BookingPaymentAPI {
    private CardPayment cardPayment;

    public CardPaymentAdapter(CardPayment cardPayment) {
        this.cardPayment = cardPayment;
    }
    @Override
    public void processPaymentViaBooking(PaymentDetails paymentDetails) {
        cardPayment.authorizeAndProcess(paymentDetails);
    }
}
