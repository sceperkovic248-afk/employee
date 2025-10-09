package management;

import java.util.Scanner;


	public class LibraryManagementSystem {
	    private static final Scanner scanner = new Scanner(System.in);
	    private static Library library = new Library();

	    public static void main(String[] args) {
	        while (true) {
	            displayMenu();
	            int choice = scanner.nextInt();
	            scanner.nextLine();  // Consume newline

	            switch (choice) {
	                case 1:
	                    addBook();
	                    break;
	                case 2:
	                    removeBook();
	                    break;
	                case 3:
	                    viewAllBooks();
	                    break;
	                case 4:
	                    searchBook();
	                    break;
	                case 5:
	                    checkoutBook();
	                    break;
	                case 6:
	                    returnBook();
	                    break;
	                case 7:
	                    System.out.println("Exiting...");
	                    return;
	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        }
	    }

	    private static void displayMenu() {
	        System.out.println("\nLibrary Management System");
	        System.out.println("1. Add Book");
	        System.out.println("2. Remove Book");
	        System.out.println("3. View All Books");
	        System.out.println("4. Search Book");
	        System.out.println("5. Checkout Book");
	        System.out.println("6. Return Book");
	        System.out.println("7. Exit");
	        System.out.print("Enter your choice: ");
	    }

	    private static void addBook() {
	        System.out.print("Enter book title: ");
	        String title = scanner.nextLine();
	        System.out.print("Enter book author: ");
	        String author = scanner.nextLine();
	        System.out.print("Enter book ISBN: ");
	        String isbn = scanner.nextLine();
	        library.addBook(title, author, isbn);
	    }

	    private static void removeBook() {
	        System.out.print("Enter book ID to remove: ");
	        int id = scanner.nextInt();
	        library.removeBook(id);
	    }

	    private static void viewAllBooks() {
	        library.viewAllBooks();
	    }

	    private static void searchBook() {
	        System.out.print("Enter title, author, or ISBN to search: ");
	        String searchTerm = scanner.nextLine();
	        Book foundBook = library.searchBook(searchTerm);
	        if (foundBook != null) {
	            System.out.println("Book found: " + foundBook);
	        } else {
	            System.out.println("No book found.");
	        }
	    }

	    private static void checkoutBook() {
	        System.out.print("Enter book ID to checkout: ");
	        int id = scanner.nextInt();
	        library.checkoutBook(id);
	    }

	    private static void returnBook() {
	        System.out.print("Enter book ID to return: ");
	        int id = scanner.nextInt();
	        library.returnBook(id);
	    }
	}


