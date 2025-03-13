import java.util.ArrayList;
import java.util.List;

// Represents a Department that belongs to a Company
class Department {
    private String name;
    private List<Employee> employees; // List to store employees in the department

    // Constructor to initialize Department with a name
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Adds an employee to the department
    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }

    // Displays department and its employees
    public void displayDepartment() {
        System.out.println(" Department: " + name);
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }
}