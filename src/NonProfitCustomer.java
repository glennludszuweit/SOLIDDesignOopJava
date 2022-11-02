public class NonProfitCustomer extends Customer{
    public NonProfitCustomer(String name, Long creditCardNumber) {
        super(name, creditCardNumber);
    }

    @Override
    public Double calculateDiscount() {
        return 15D;
    }

    @Override
    public String toString() {
        return "NonProfitCustomer{" +
                super.toString() +
        '}';
    }
}
