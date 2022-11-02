public enum ProductType {
    PHYSICAL(Catalogue.SHIPPING_RATE),
    DIGITAL(0D);

    private final Double shippingRate;

    ProductType(Double shippingRate) {
        this.shippingRate = shippingRate;
    }

    public double getShippingCost(Double weight) {
        return weight * shippingRate;
    }

    @Override
    public String toString() {
        return "ProductType{" +
                "shippingRate=" + shippingRate +
                '}';
    }
}
