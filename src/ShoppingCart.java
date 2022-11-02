import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ShoppingCart {
    private final List<LineItem> lineItems = new ArrayList<>();

    public void addLineItem(LineItem lineItem) {
        lineItems.add(lineItem);
    }

    public Double getTotalCost() {
        return lineItems.stream().mapToDouble(LineItem::getPrice).sum();
    }

    @Override
    public String toString() {
        return "Cart{" +
                "products=" + lineItems +
                '}';
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }
}
