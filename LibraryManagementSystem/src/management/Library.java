package management;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private int nextId;

    public Library() {
        books = new ArrayList<>();
        nextId = 1;
    }

    public void addBook(String title, String author, String isbn) {
        Book newBook = new Book(nextId++, title, author, isbn);
        books.add(newBook);
        System.out.println("Book added: " + newBook);
    }

    public void removeBook(int id) {
        books.removeIf(book -> book.getId() == id);
        System.out.println("Book removed with ID: " + id);
    }

    public void viewAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public Book searchBook(String searchTerm) {
        for (Book book : books) {
            if (book.getTitle().contains(searchTerm) || book.getAuthor().contains(searchTerm) || book.getIsbn().contains(searchTerm)) {
                return book;
            }
        }
        return null;
    }

    public void checkoutBook(int id) {
        for (Book book : books) {
            if (book.getId() == id && !book.isCheckedOut()) {
                book.checkout();
                System.out.println("Book checked out: " + book);
                return;
            }
        }
        System.out.println("Book not found or already checked out.");
    }

    public void returnBook(int id) {
        for (Book book : books) {
            if (book.getId() == id && book.isCheckedOut()) {
                book.returnBook();
                System.out.println("Book returned: " + book);
                return;
            }
        }
        System.out.println("Book not found or not checked out.");
    }
}
