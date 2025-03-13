import java.util.List;

// GradeCalculator class to compute grades
class GradeCalculator {
    public static double calculateAverage(GradeStudent student) {
        List<Subject> subjects = student.getSubjects();
        if (subjects.isEmpty()) return 0;

        int totalMarks = 0;
        for (Subject subject : subjects) {
            totalMarks += subject.getMarks();
        }
        return (double) totalMarks / subjects.size();
    }

    public static String getGrade(double average) {
        if (average >= 90) return "A";
        else if (average >= 75) return "B";
        else if (average >= 60) return "C";
        else if (average >= 40) return "D";
        else return "F";
    }
}