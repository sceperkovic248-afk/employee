package management;

	public class Book {
	    private int id;
	    private String title;
	    private String author;
	    private String isbn;
	    private boolean isCheckedOut;

	    public Book(int id, String title, String author, String isbn) {
	        this.id = id;
	        this.title = title;
	        this.author = author;
	        this.isbn = isbn;
	        this.isCheckedOut = false;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public String getIsbn() {
	        return isbn;
	    }

	    public boolean isCheckedOut() {
	        return isCheckedOut;
	    }

	    public void checkout() {
	        isCheckedOut = true;
	    }

	    public void returnBook() {
	        isCheckedOut = false;
	    }

	    @Override
	    public String toString() {
	        return "ID: " + id + ", Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Checked Out: " + (isCheckedOut ? "Yes" : "No");
	    }
	}

