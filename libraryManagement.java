import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrow() {
        isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }

    @Override
    public String toString() {
        return title + " by " + author + (isAvailable ? " (Available)" : " (Not Available)");
    }
}

class Library {
    private List<Book> books;
    private HashMap<String, List<Book>> borrowedBooks;

    public Library() {
        books = new ArrayList<>();
        borrowedBooks = new HashMap<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(String title, String user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                book.borrow();
                borrowedBooks.putIfAbsent(user, new ArrayList<>());
                borrowedBooks.get(user).add(book);
                System.out.println("You have borrowed: " + book);
                return;
            }
        }
        System.out.println("Book not available or does not exist.");
    }

    public void returnBook(String title, String user) {
        if (borrowedBooks.containsKey(user)) {
            List<Book> userBooks = borrowedBooks.get(user);
            for (Book book : userBooks) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    book.returnBook();
                    userBooks.remove(book);
                    System.out.println("You have returned: " + book);
                    return;
                }
            }
        }
        System.out.println("You have not borrowed this book.");
    }

    public void viewAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Adding some books to the library
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. View Available Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    library.viewAvailableBooks();
                    break;
                case 2:
                    System.out.print("Enter the title of the book to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    System.out.print("Enter your name: ");
                    String borrowerName = scanner.nextLine();
                    library.borrowBook(borrowTitle, borrowerName);
                    break;
                case 3:
                    System.out.print("Enter the title of the book to return: ");
                    String returnTitle = scanner.nextLine();
                    System.out.print("Enter your name: ");
                    String returnerName = scanner.nextLine();
                    library.returnBook(returnTitle, returnerName);
                    break;
                case 4:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
