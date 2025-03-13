import java.util.ArrayList;
import java.util.List;

// Represents a Course in the University
class ProfessorCourse {
    private String courseName;
    private Professor professor;
    private List<ProfessorStudent> students;

    // Constructor to initialize course name
    public ProfessorCourse(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Method to assign a professor to the course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    // Method to enroll a student in the course
    public void enrollStudent(ProfessorStudent student) {
        students.add(student);
    }

    // Method to display course details
    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "Not Assigned"));
        System.out.println("Enrolled Students:");
        for (ProfessorStudent student : students) {
            System.out.println("- " + student.getName());
        }
        System.out.println();
    }
}