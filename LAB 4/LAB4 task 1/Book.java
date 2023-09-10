public class Book {
    private String title;
    private String author;
    private double price;
    private int quantity;
	
	
	 public Book() {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public Book(String title, String author, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter and setter methods for each attribute
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to display the attributes of the Book
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println();
    }
	
	public static void main(String[] args) {
        // Attempt to create an object of the Book class using the empty/default constructor
        // Note: Since we have defined a constructor that accepts parameters,
        //       the default constructor is not available unless explicitly defined.

        // Create two instances of the Book class using the empty constructor
        Book book1 = new Book();
        Book book2 = new Book();

        // Set attributes using setter methods
        book1.setTitle("Book 1");
        book1.setAuthor("Author 1");
        book1.setPrice(9.99);
        book1.setQuantity(5);

        book2.setTitle("Book 2");
        book2.setAuthor("Author 2");
        book2.setPrice(14.99);
        book2.setQuantity(10);

        // Create another two instances of the Book class using the argument constructor
        Book book3 = new Book("Book 3", "Author 3", 19.99, 3);
        Book book4 = new Book("Book 4", "Author 4", 24.99, 8);

        // Call the display() method for each Book instance
        book1.display();
        book2.display();
        book3.display();
        book4.display();

        // Use an array to store the Book instances and call the display() method only once for the entire array
        Book[] books = { book1, book2, book3, book4 };
        for (Book book : books) {
            book.display();
        }
    }
}
