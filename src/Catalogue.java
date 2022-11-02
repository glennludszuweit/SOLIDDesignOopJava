
import java.util.Map;


public class Catalogue {
    public final static Double SHIPPING_RATE = 5D;

    private static final Map<String, Product> productMap = Map.of(
            "Electric Toothbrush", new PhysicalProduct("Electric Toothbrush", 350, 5, ProductType.PHYSICAL, 44.5),
            "Baby Alarm", new PhysicalProduct("Baby Alarm", 400, 6, ProductType.PHYSICAL,4.8),
            "Eloquent Javascript", new DigitalProduct("Eloquent Javascript", 400, 6)
    );

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }
}
