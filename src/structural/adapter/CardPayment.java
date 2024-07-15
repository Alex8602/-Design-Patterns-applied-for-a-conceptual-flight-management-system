package structural.adapter;

public class CardPayment implements CardOperations {

    @Override
    public void authorizeAndProcess(PaymentDetails details) {
        System.out.println("Card payment processed: ");
        details.display();
    }
}
