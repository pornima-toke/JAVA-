// Book.java
class Book {
    // fields (instance variables)
    String title;
    String author;
    double price;

    // constructor to initialize book details
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

// Main class
public class LibraryBookManagement {
    public static void main(String[] args) {
        // Create two Book objects
        Book book1 = new Book("Java Programming", "James Gosling", 550.0);
        Book book2 = new Book("Python Basics", "Guido van Rossum", 450.0);

        // Compare the prices
        if (book1.price > book2.price) {
            System.out.println("More expensive book: " + book1.title);
        } else if (book2.price > book1.price) {
            System.out.println("More expensive book: " + book2.title);
        } else {
            System.out.println("Both books have the same price.");
        }
    }
}
