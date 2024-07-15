package structural.adapter;

public class PaymentDetails {
    private String holderFullName, transactionNumber;
    private float amount;

    public PaymentDetails(String holderID, String transactionNumber, float amount) {
        this.holderFullName = holderID;
        this.transactionNumber = transactionNumber;
        this.amount = amount;
    }

    public void display() {
        System.out.println("*** Payment Details ***");
        System.out.println("\tholder name: " + holderFullName);
        System.out.println("\ttransaction number: " + transactionNumber);
        System.out.println("\tamount to pay: " + amount);
        System.out.println("----------------------\n");
    }

    public String getHolderFullName() {
        return holderFullName;
    }

    public void setHolderFullName(String holderFullName) {
        this.holderFullName = holderFullName;
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

}
