import java.util.*;


// LibraryApp.java
public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

        // Create several instances of the Book class
        Book book1 = new Book("Book 1", "Author 1", 9.99, 5);
        Book book2 = new Book("Book 2", "Author 2", 14.99, 10);
        Book book3 = new Book("Book 3", "Author 3", 19.99, 3);
        Book book4 = new Book("Book 4", "Author 4", 24.99, 8);

        // Add Book instances to the Library's booksMap
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // Remove a book from the Library's booksMap
        library.removeBook("Book 2");

        // Display the details of all the books in the library
        library.displayBooks();

        // Create a HashSet to store the unique authors of the books in the library
        Set<String> authorsSet = new HashSet<>();

        // Add the authors of each book to the authorsSet
        for (Book book : library.booksMap.values()) {
            authorsSet.add(book.getAuthor());
        }

        // Print out the unique authors in the library
        System.out.println("Unique Authors in the Library:");
        for (String author : authorsSet) {
            System.out.println(author);
        }
    }
}
