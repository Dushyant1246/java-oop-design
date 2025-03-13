// Represents a Customer who has an account in a bank.
class Customer {
    private String name;
    private double balance;
    private Bank bank; // Association with a Bank

    // Constructor to initialize customer details
    public Customer(String name, double initialBalance, Bank bank) {
        this.name = name;
        this.balance = initialBalance;
        this.bank = bank;
    }

    // Getter method for customer's name
    public String getName() {
        return name;
    }

    // Displays the customer's current balance
    public void viewBalance() {
        System.out.println(name + "'s Balance: $" + balance);
    }
}