// Represents a Product in the e-commerce system
class Product {
    private String name;
    private double price;

    // Constructor to initialize product name and price
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter for product name
    public String getName() {
        return name;
    }

    // Getter for product price
    public double getPrice() {
        return price;
    }
}