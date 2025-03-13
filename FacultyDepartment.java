// Represents a Department (Composition: Departments belong to a University)
class FacultyDepartment {
    private String departmentName;

    // Constructor to initialize department name
    public FacultyDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    // Getter for department name
    public String getDepartmentName() {
        return departmentName;
    }
}