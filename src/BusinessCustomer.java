public class BusinessCustomer  extends Customer{
    public enum BusinessSize {
        SMALL,
        MEDIUM,
        LARGE
    }
    private final BusinessSize size;

    public BusinessCustomer(String name, Long creditCardNumber, BusinessSize size) {
        super(name, creditCardNumber);
        this.size = size;
    }

    @Override
    public Double calculateDiscount() {
        return switch (size) {
            case SMALL -> 5D;
            case MEDIUM -> 10D;
            case LARGE -> 20D;
            default -> throw new AssertionError("Unknown size type: " + this);
        };
    }

    @Override
    public String toString() {
        return "BusinessCustomer{" +
                super.toString() +
                "size=" + size +
                '}';
    }
}
