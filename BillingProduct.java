// Class representing a product in the store
class BillingProduct {
    private String name;
    private double pricePerUnit;
    private double quantity;

    // Constructor
    public BillingProduct(String name, double pricePerUnit, double quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    // Method to calculate total price of this product
    public double getTotalPrice() {
        return pricePerUnit * quantity;
    }

    // Display product details
    public void displayBillingProduct() {
        System.out.println(name + " (" + quantity + " units at $" + pricePerUnit + " per unit)");
    }
}
