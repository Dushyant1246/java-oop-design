import java.util.ArrayList;
import java.util.List;

// Represents an Order that contains multiple Products
class Order {
    private int orderId;
    private List<Product> products;

    // Constructor to initialize order with an ID
    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    // Method to add a product to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method to display order details
    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in Order:");
        double total = 0;
        for (Product product : products) {
            System.out.println("- " + product.getName() + " ($" + product.getPrice() + ")");
            total += product.getPrice();
        }
        System.out.println("Total Price: $" + total);
    }
}