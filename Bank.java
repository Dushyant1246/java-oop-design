import java.util.ArrayList;
import java.util.List;

class Bank {
    private String name;
    private List<Customer> customers; // List to store associated customers

    // Constructor to initialize bank with a name
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Opens an account for a new customer and associates them with the bank
    public void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println("Account opened for " + customer.getName() + " at " + name);
    }

    // Displays all customers associated with the bank
    public void listCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers in " + name);
        } else {
            System.out.println("Customers of " + name + ":");
            for (Customer customer : customers) {
                System.out.println("- " + customer.getName());
            }
        }
    }
}
/*
Bank bank = new Bank("ABC Bank");
Customer customer1 = new Customer("Alice", 5000.0, bank);
Customer customer2 = new Customer("Bob", 3000.0, bank);

bank.openAccount(customer1);
bank.openAccount(customer2);

customer1.viewBalance();
customer2.viewBalance();

bank.listCustomers();

Output:
Account opened for Alice at ABC Bank
Account opened for Bob at ABC Bank
Alice's Balance: $5000.0
Bob's Balance: $3000.0
Customers of ABC Bank:
- Alice
- Bob
 */