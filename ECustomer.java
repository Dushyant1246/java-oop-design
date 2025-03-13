import java.util.ArrayList;
import java.util.List;

// Represents a Customer who places multiple Orders
class ECustomer {
    private String name;
    private List<Order> orders;

    // Constructor to initialize customer name
    public ECustomer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Method to place an order
    public void placeOrder(Order order) {
        orders.add(order);
    }

    // Method to display all orders placed by the customer
    public void showOrders() {
        System.out.println("Customer: " + name);
        for (Order order : orders) {
            order.showOrderDetails();
            System.out.println();
        }
    }
}
/*
Product laptop = new Product("Laptop", 1200.00);
Product phone = new Product("Smartphone", 800.00);
Product headphones = new Product("Headphones", 150.00);

ECustomer customer1 = new ECustomer("John Doe");

Order order1 = new Order(101);
order1.addProduct(laptop);
order1.addProduct(headphones);

Order order2 = new Order(102);
order2.addProduct(phone);

customer1.placeOrder(order1);
customer1.placeOrder(order2);

customer1.showOrders();

Output:
Customer: John Doe
Order ID: 101
Products in Order:
- Laptop ($1200.0)
- Headphones ($150.0)
Total Price: $1350.0

Order ID: 102
Products in Order:
- Smartphone ($800.0)
Total Price: $800.0
 */