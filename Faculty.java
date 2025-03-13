// Represents a Faculty member (Aggregation: Faculty can exist without a Department)
class Faculty {
    private String name;

    // Constructor to initialize faculty name
    public Faculty(String name) {
        this.name = name;
    }

    // Getter for faculty name
    public String getName() {
        return name;
    }
}