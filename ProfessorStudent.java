import java.util.ArrayList;
import java.util.List;

// Represents a Student who enrolls in Courses
class ProfessorStudent {
    private String name;
    private List<ProfessorCourse> courses;

    // Constructor to initialize student name
    public ProfessorStudent(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Getter for student name
    public String getName() {
        return name;
    }

    // Method to enroll a student in a course
    public void enrollCourse(ProfessorCourse course) {
        courses.add(course);
        course.enrollStudent(this);
    }

}
/*
Professor prof1 = new Professor("Dr. Smith");
Professor prof2 = new Professor("Dr. Johnson");

ProfessorStudent student1 = new ProfessorStudent("Alice");
ProfessorStudent student2 = new ProfessorStudent("Bob");
ProfessorStudent student3 = new ProfessorStudent("Charlie");

ProfessorCourse math = new ProfessorCourse("Mathematics");
ProfessorCourse physics = new ProfessorCourse("Physics");

prof1.teachCourse(math);
prof2.teachCourse(physics);

student1.enrollCourse(math);
student2.enrollCourse(math);
student3.enrollCourse(physics);

math.showCourseDetails();
physics.showCourseDetails();
}

Output:
Course: Mathematics
Professor: Dr. Smith
Enrolled Students:
- Alice
- Bob

Course: Physics
Professor: Dr. Johnson
Enrolled Students:
- Charlie
 */