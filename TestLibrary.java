// 8. You are building a library management system. Design an interface named "LibraryItem" with the following methods:

// String getTitle() to retrieve the title of the library item

// String getAuthor() to retrieve the author of the library item

// int getYear() to retrieve the publication year of the library item

// boolean isAvailable() to check if the library item is currently available for borrowing.
interface LibraryItem {
    String getTitle();
    String getAuthor();
    int getYear();
    boolean isAvailable();
}

class Book implements LibraryItem {
    private String title, author;
    private int year;
    private boolean available;

    public Book(String title, String author, int year, boolean available) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return available;
    }
}

public class TestLibrary {
    public static void main(String[] args) {
        LibraryItem book = new Book("Java Programming", "James Gosling", 1995, true);
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Year: " + book.getYear());
        System.out.println("Available: " + book.isAvailable());
    }
}