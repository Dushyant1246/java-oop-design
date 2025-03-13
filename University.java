import java.util.ArrayList;
import java.util.List;

// Represents a University (Composition with Departments, Aggregation with Faculties)
class University {
    private String universityName;
    private List<FacultyDepartment> departments; // Composition: University owns Departments
    private List<Faculty> faculties; // Aggregation: Faculty members can exist independently

    // Constructor to initialize university name
    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Adds a department to the university (Composition)
    public void addDepartment(String deptName) {
        departments.add(new FacultyDepartment(deptName));
    }

    // Adds a faculty member to the university (Aggregation)
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Displays all departments
    public void listDepartments() {
        System.out.println("Departments in " + universityName + ":");
        for (FacultyDepartment dept : departments) {
            System.out.println("- " + dept.getDepartmentName());
        }
    }

    // Displays all faculty members
    public void listFaculties() {
        System.out.println("Faculties in " + universityName + ":");
        for (Faculty faculty : faculties) {
            System.out.println("- " + faculty.getName());
        }
    }

    // Deleting a university also deletes all departments (Composition)
    public void deleteUniversity() {
        System.out.println(universityName + " is being deleted...");
        departments.clear(); // Deleting all departments (Composition)
    }
}
/*
University uni = new University("Tech University");

uni.addDepartment("Computer Science");
uni.addDepartment("Mechanical Engineering");

Faculty profJohn = new Faculty("Dr. John");
Faculty profEmma = new Faculty("Dr. Emma");

uni.addFaculty(profJohn);
uni.addFaculty(profEmma);

uni.listDepartments();
uni.listFaculties();

uni.deleteUniversity();

uni.listDepartments();

Output:
Departments in Tech University:
- Computer Science
- Mechanical Engineering
Faculties in Tech University:
- Dr. John
- Dr. Emma
Tech University is being deleted...
Departments in Tech University:
 */