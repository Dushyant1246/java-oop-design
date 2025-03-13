// Represents an Employee who belongs to a Department
class Employee {
    private String name;

    // Constructor to initialize Employee details
    public Employee(String name) {
        this.name = name;
    }

    // Displays employee information
    public void displayEmployee() {
        System.out.println("  Employee: " + name);
    }
}