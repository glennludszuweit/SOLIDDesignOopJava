public class DigitalProduct extends Product{
    private final Integer price;

    public DigitalProduct(String name, Integer price, Integer discount) {
        super(name, price, discount);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price * (100 - getDiscount()/100.0);
    }

    @Override
    public Double calculateShippingCost() {
        return 0D;
    }
}
