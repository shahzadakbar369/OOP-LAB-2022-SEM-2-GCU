import java.util.*;
// Library.java
public class Library {
    public Map<String, Book> booksMap;

    public Library() {

        booksMap = new HashMap<>();
    }

    public void addBook(Book book) {

        booksMap.put(book.getTitle(), book);
    }

    public void removeBook(String title) {

        booksMap.remove(title);
    }

    public void displayBooks() {
        for (Book book : booksMap.values()) {
            book.display();
        }
    }
}