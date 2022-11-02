import java.util.Optional;

public interface PaymentMethod {
    Optional<Payment> makePayment(Double amount);
}
