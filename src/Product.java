public abstract class Product {
    private ProductType  productType;
    private final String name;
    private final Integer price;
    private final Integer discount;
    private  Double weight;

    public Product(String name, Integer price, Integer discount, ProductType  productType, Double weight) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.productType = productType;
        this.weight = weight;
    }

    public Product(String name, Integer price, Integer discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public abstract Double getPrice();

    public abstract Double calculateShippingCost();

    public ProductType getProductType() {
        return productType;
    }

    public Integer getDiscount() {
        return discount;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productType=" + productType +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", weight=" + weight +
                '}';
    }
}
