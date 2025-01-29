import java.util.*;

class Book {
    private String title;
    private String author;
    private double price;
    private int stock;
    private String genre;
    private int publishedYear;

    public Book(String title, String author, double price, int stock, String genre, int publishedYear) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
        this.genre = genre;
        this.publishedYear = publishedYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getGenre() {
        return genre;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void updateStock(int quantity) {
        this.stock -= quantity;
    }

    @Override
    public String toString() {
        return String.format("Title: %s, Author: %s, Price: $%.2f, Stock: %d, Genre: %s, Year: %d", 
                              title, author, price, stock, genre, publishedYear);
    }
}

class Library {
    private Map<String, Book> books;

    public Library() {
        books = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public void removeBook(String title) {
        books.remove(title);
    }

    public Book searchBookByTitle(String title) {
        return books.get(title);
    }

    public List<Book> searchBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> searchBooksByGenre(String genre) {
        List<Book> result = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getGenre().equalsIgnoreCase(genre)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> sortBooksByPrice() {
        List<Book> bookList = new ArrayList<>(books.values());
        bookList.sort(Comparator.comparingDouble(Book::getPrice));
        return bookList;
    }

    public List<Book> sortBooksByPublishedYear() {
        List<Book> bookList = new ArrayList<>(books.values());
        bookList.sort(Comparator.comparingInt(Book::getPublishedYear));
        return bookList;
    }

    public void displayAllBooks() {
        for (Book book : books.values()) {
            System.out.println(book);
        }
    }
}

class User {
    private String name;
    private String username;
    private String password;

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }
}

class Transaction {
    private User user;
    private Book book;
    private int quantity;
    private double totalPrice;
    private Date date;

    public Transaction(User user, Book book, int quantity) {
        this.user = user;
        this.book = book;
        this.quantity = quantity;
        this.totalPrice = book.getPrice() * quantity;
        this.date = new Date();
    }

    public void displayTransactionDetails() {
        System.out.println("\nTransaction Details:");
        System.out.println("User: " + user.getUsername());
        System.out.println("Book: " + book.getTitle());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Date: " + date);
    }
}

class LibrarySystem {
    private Library library;
    private List<User> users;
    private List<Transaction> transactions;

    public LibrarySystem() {
        library = new Library();
        users = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    public void addBookToLibrary(Book book) {
        library.addBook(book);
    }

    public void removeBookFromLibrary(String title) {
        library.removeBook(title);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User authenticateUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.authenticate(password)) {
                return user;
            }
        }
        return null;
    }

    public void processTransaction(User user, Book book, int quantity) {
        if (book.getStock() >= quantity) {
            book.updateStock(quantity);
            Transaction transaction = new Transaction(user, book, quantity);
            transactions.add(transaction);
            transaction.displayTransactionDetails();
        } else {
            System.out.println("Not enough stock available.");
        }
    }

    public void displayLibraryBooks() {
        library.displayAllBooks();
    }

    public void searchBooksByTitle(String title) {
        Book book = library.searchBookByTitle(title);
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book not found.");
        }
    }

    public void searchBooksByAuthor(String author) {
        List<Book> books = library.searchBooksByAuthor(author);
        if (books.isEmpty()) {
            System.out.println("No books found by author: " + author);
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void searchBooksByGenre(String genre) {
        List<Book> books = library.searchBooksByGenre(genre);
        if (books.isEmpty()) {
            System.out.println("No books found in genre: " + genre);
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void displayBooksSortedByPrice() {
        List<Book> sortedBooks = library.sortBooksByPrice();
        for (Book book : sortedBooks) {
            System.out.println(book);
        }
    }

    public void displayBooksSortedByYear() {
        List<Book> sortedBooks = library.sortBooksByPublishedYear();
        for (Book book : sortedBooks) {
            System.out.println(book);
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibrarySystem system = new LibrarySystem();

        // Adding books to library
        system.addBookToLibrary(new Book("Java Programming Basics", "John Doe", 39.99, 10, "Programming", 2020));
        system.addBookToLibrary(new Book("Advanced Java Concepts", "Jane Smith", 49.99, 5, "Programming", 2021));
        system.addBookToLibrary(new Book("Mastering Java", "Alice Brown", 59.99, 3, "Programming", 2022));
        system.addBookToLibrary(new Book("Learn Data Structures", "John Doe", 29.99, 20, "Computer Science", 2019));

        // Adding users
        system.addUser(new User("Alice", "alice123", "password1"));
        system.addUser(new User("Bob", "bob456", "password2"));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Display All Books");
            System.out.println("2. Search Book by Title");
            System.out.println("3. Search Books by Author");
            System.out.println("4. Search Books by Genre");
            System.out.println("5. Sort Books by Price");
            System.out.println("6. Sort Books by Published Year");
            System.out.println("7. User Login");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    system.displayLibraryBooks();
                    break;
                case 2:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    system.searchBooksByTitle(title);
                    break;
                case 3:
                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();
                    system.searchBooksByAuthor(author);
                    break;
                case 4:
                    System.out.print("Enter genre: ");
                    String genre = scanner.nextLine();
                    system.searchBooksByGenre(genre);
                    break;
                case 5:
                    system.displayBooksSortedByPrice();
                    break;
                case 6:
                    system.displayBooksSortedByYear();
                    break;
                case 7:
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    User user = system.authenticateUser(username, password);
                    if (user != null) {
                        System.out.println("Login successful!");
                        System.out.print("Enter book title to purchase: ");
                        String bookTitle = scanner.nextLine();
                        Book book = system.searchBookByTitle(bookTitle);
                        if (book != null) {
                            System.out.print("Enter quantity: ");
                            int quantity = scanner.nextInt();
                            system.processTransaction(user, book, quantity);
                        } else {
                            System.out.println("Book not found.");
                        }
                    } else {
                        System.out.println("Invalid credentials.");
                    }
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 8);

        scanner.close();
    }
}
