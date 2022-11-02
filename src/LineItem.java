public class LineItem {
    private final Product product;
    private final Integer quantity;

    public LineItem (Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Double calculateShippingCost() {
        return product.calculateShippingCost() * quantity;
    }

    public Product getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return "LineItem{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
