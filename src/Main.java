import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Products
        ShoppingCart shoppingCart = new ShoppingCart();

        Product toothbrush = Catalogue.getProduct("Electric Toothbrush");
        Product babyAlarm = Catalogue.getProduct("Baby Alarm");

        shoppingCart.addLineItem(new LineItem(toothbrush, 3));
        shoppingCart.addLineItem(new LineItem(babyAlarm, 25));
        System.out.println(shoppingCart);
        System.out.println(shoppingCart.getTotalCost());

        Customer johnDoe = new Customer("John", 231231231443432L);
        johnDoe.addPaymentMethod("Credit Card", new CreditCard(231231231443432L));
        Optional<Order> order = johnDoe.checkout(shoppingCart, "Credit Card");
        System.out.println(order);

        Double totalShippingCost = shoppingCart.getLineItems().stream().mapToDouble(LineItem::calculateShippingCost).sum();

        System.out.println(totalShippingCost);

        // Customer
        Customer janeDoe = new Customer("Jane Doe", 23490234293540295L);
        Customer acme = new BusinessCustomer("Acme Productions", 2348923745023903L, BusinessCustomer.BusinessSize.MEDIUM);
        Customer accenture = new BusinessCustomer("Accenture GmbH", 23653452345023903L, BusinessCustomer.BusinessSize.LARGE);
        Customer greenPeace = new NonProfitCustomer("Green Peace", 23742985723052L);

        List<Customer> customers = List.of(janeDoe, acme, accenture, greenPeace);
        
        customers.forEach(customer -> System.out.println(customer.calculateDiscount()));

        Map<Double, Long> collect = customers.stream().collect(Collectors.groupingBy(Customer::calculateDiscount, Collectors.counting()));

        System.out.println(collect);
    }
}