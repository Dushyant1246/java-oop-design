
//Represents a Book with a title and an author.
class Book {
    private String title;
    private String author;

    // Constructor to initialize Book attributes
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter methods to access book details
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}