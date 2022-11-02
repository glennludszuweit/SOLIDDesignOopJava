import java.util.UUID;

public class Payment {
    private PaymentMethod paymentMethod;
    private Double amount;
    private UUID id;

    public Payment(PaymentMethod paymentMethod, Double amount, UUID id) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.id = id;
    }
}
