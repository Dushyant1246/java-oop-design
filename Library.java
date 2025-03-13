import java.util.ArrayList;
import java.util.List;


//Represents a Library that contains multiple Book objects.
class Library {
    private List<Book> books; // List to store books in the library

    // Constructor to initialize the book list
    public Library() {
        this.books = new ArrayList<>();
    }


    //Method to add a book to the library's collection.
    public void addBook(Book book) {
        books.add(book);
    }


    //Method to Display the books available in the library.
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Library contains:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
/*
Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
Book book2 = new Book("1984", "George Orwell");
Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

Library library = new Library();

library.addBook(book1);
library.addBook(book2);
library.addBook(book3);

library.displayBooks();

Output:
Library contains:
Book{Title='The Great Gatsby', Author='F. Scott Fitzgerald'}
Book{Title='1984', Author='George Orwell'}
Book{Title='To Kill a Mockingbird', Author='Harper Lee'}
 */
