import java.util.ArrayList;
import java.util.List;

// Represents a School that contains multiple students (Aggregation)
class School {
    private String name;
    private List<Student> students; // Aggregation: School contains students

    // Constructor to initialize school with a rollNumber
    public School(String rollNumber) {
        this.name = rollNumber;
        this.students = new ArrayList<>();
    }

    // Adds a student to the school
    public void addStudent(Student student) {
        students.add(student);
    }

    // Displays all students in the school
    public void listStudents() {
        System.out.println("Students in " + name + ":");
        for (Student student : students) {
            System.out.println("- " + student.getRollNumber());
        }
    }
}
/*
School school = new School("Greenwood High");

Student alice = new Student("Alice");
Student bob = new Student("Bob");

school.addStudent(alice);
school.addStudent(bob);

Course math = new Course("Mathematics");
Course science = new Course("Science");

alice.enrollInCourse(math);
alice.enrollInCourse(science);
bob.enrollInCourse(math);

school.listStudents();

alice.listCourses();
bob.listCourses();

math.listEnrolledStudents();
science.listEnrolledStudents();

Output:
Students in Greenwood High:
- Alice
- Bob
Alice is enrolled in the following courses:
- Mathematics
- Science
Bob is enrolled in the following courses:
- Mathematics
Course: Mathematics has the following students:
- Alice
- Bob
Course: Science has the following students:
- Alice
 */