import java.util.ArrayList;
import java.util.List;

// Represents a Professor who teaches Courses
class Professor {
    private String name;
    private List<ProfessorCourse> courses;

    // Constructor to initialize professor name
    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Getter for professor's name
    public String getName() {
        return name;
    }

    // Method to assign a professor to a course
    public void teachCourse(ProfessorCourse course) {
        courses.add(course);
        course.assignProfessor(this);
    }
}