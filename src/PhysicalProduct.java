public class PhysicalProduct extends Product{
    private final Integer price;
    public PhysicalProduct(String name, Integer price, Integer discount,ProductType  productType, Double weight) {
        super(name, price, discount, productType, weight);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        double shippingCost = getProductType().getShippingCost(getWeight());
        return price * (100 - getDiscount()/100.0) + shippingCost;
    }

    @Override
    public Double calculateShippingCost() {
        return getProductType().getShippingCost(getWeight());
    }
}
