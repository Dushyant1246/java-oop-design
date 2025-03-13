import java.util.ArrayList;
import java.util.List;

// Represents a Course that students can enroll in
class Course {
    private String courseName;
    private List<Student> enrolledStudents; // Many-to-Many association

    // Constructor to initialize course with a rollNumber
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Enrolls a student in the course
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.addCourse(this); // Ensuring bidirectional association
        }
    }

    // Displays students enrolled in this course
    public void listEnrolledStudents() {
        System.out.println("Course: " + courseName + " has the following students:");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getRollNumber());
        }
    }

    // Getter for course name
    public String getCourseName() {
        return courseName;
    }
}