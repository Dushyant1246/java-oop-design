import java.util.ArrayList;
import java.util.List;

// Represents a GradeStudent with multiple subjects
class GradeStudent {
    private String name;
    private List<Subject> subjects;

    public GradeStudent(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(String subjectName, int marks) {
        subjects.add(new Subject(subjectName, marks));
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public String getName() {
        return name;
    }
}
/*
GradeStudent student = new GradeStudent("John");
student.addSubject("Maths", 90);
student.addSubject("Science", 85);

System.out.println("Student: " + student.getName());
for (Subject subject : student.getSubjects()) {
    System.out.println("Subject: " + subject.getName() + ", Marks: " + subject.getMarks());
}

double average = GradeCalculator.calculateAverage(student);
String grade = GradeCalculator.getGrade(average);
System.out.println("Average Marks: " + average);
System.out.println("Grade: " + grade);

Output:
Student: John
Subject: Maths, Marks: 90
Subject: Science, Marks: 85
Average Marks: 87.5
Grade: B
 */