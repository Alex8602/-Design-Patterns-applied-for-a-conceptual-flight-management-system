package structural.adapter;

public class WirePayment implements WireOperations {
    @Override
    public void transmitThenVerifyAndProcess(PaymentDetails details) {
        System.out.println("Wire payment processed: ");
        details.display();
    }
}
