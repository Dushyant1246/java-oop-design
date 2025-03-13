import java.util.ArrayList;
import java.util.List;

// Represents a Student who can enroll in multiple courses
class Student {
    private String rollNumber;
    private List<Course> courses; // Many-to-Many association

    // Constructor to initialize student details
    public Student(String rollNumber) {
        this.rollNumber = rollNumber;
        this.courses = new ArrayList<>();
    }

    // Enrolls student in a course
    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this); // Ensuring bidirectional association
        }
    }

    // Displays courses the student is enrolled in
    public void listCourses() {
        System.out.println(rollNumber + " is enrolled in the following courses:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }

    // Getter for student rollNumber
    public String getRollNumber() {
        return rollNumber;
    }

    // Adds a course to student's list (used for bidirectional association)
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }
}