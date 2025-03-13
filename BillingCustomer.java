import java.util.ArrayList;
import java.util.List;

// Class representing a customer
class BillingCustomer {
    private String name;
    private List<BillingProduct> productList;

    // Constructor
    public BillingCustomer(String name) {
        this.name = name;
        this.productList = new ArrayList<>();
    }

    // Method to add a product to the customer's shopping list
    public void addBillingProduct(BillingProduct product) {
        productList.add(product);
    }

    // Get the list of products purchased
    public List<BillingProduct> getBillingProducts() {
        return productList;
    }

    // Display customer details
    public void displayBillingCustomer() {
        System.out.println("BillingCustomer: " + name);
        System.out.println("BillingProducts Purchased:");
        for (BillingProduct product : productList) {
            product.displayBillingProduct();
        }
    }
}
/*
BillingCustomer customer = new BillingCustomer("Alice");

customer.addBillingProduct(new BillingProduct("Apples", 3, 2)); // 2 kg at $3 per kg
customer.addBillingProduct(new BillingProduct("Milk", 2, 1));   // 1 liter at $2 per liter

customer.displayBillingCustomer();

double totalBill = BillGenerator.generateBill(customer);
System.out.println("Total Bill Amount: $" + totalBill);

Output:
BillingCustomer: Alice
BillingProducts Purchased:
Apples (2.0 units at $3.0 per unit)
Milk (1.0 units at $2.0 per unit)
Total Bill Amount: $8.0
 */