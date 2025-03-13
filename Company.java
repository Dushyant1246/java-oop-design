import java.util.ArrayList;
import java.util.List;

class Company {
    private String name;
    private List<Department> departments; // List to store departments

    // Constructor to initialize company with a name
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Adds a department to the company
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    // Adds an employee to a specific department
    public void addEmployeeToDepartment(String departmentName, String employeeName) {
        for (Department dept : departments) {
            if (dept != null && dept.getName().equals(departmentName)) {
                dept.addEmployee(employeeName);
                return;
            }
        }
        System.out.println("Department not found!");
    }

    // Displays company details along with departments and employees
    public void displayCompany() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.displayDepartment();
        }
    }
}
/*
Company company = new Company("TechCorp");

company.addDepartment("IT");
company.addDepartment("HR");

company.addEmployeeToDepartment("IT", "Alice");
company.addEmployeeToDepartment("IT", "Bob");
company.addEmployeeToDepartment("HR", "Charlie");

company.displayCompany();

// Simulating deletion of company (Composition ensures departments and employees are deleted)
company = null;
System.gc();

Output:
Company: TechCorp
 Department: IT
  Employee: Alice
  Employee: Bob
 Department: HR
  Employee: Charlie
 */