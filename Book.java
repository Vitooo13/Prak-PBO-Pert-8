public class Book {
    private String title;
    private String author;
    private String isbn;
    public static int totalBooks = 0;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++;
    }

    public static void displayTotalBooks() {
        System.out.println("Total books: " + totalBooks);
    }

    public static void main(String[] args) {
        // Menambahkan 3 objek Book dengan data yang ditentukan
        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "978-3-16-148410-0");
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", "978-0-261-10221-0");
        Book book3 = new Book("1984", "George Orwell", "978-0-452-28423-4");
       
        // Menampilkan total buku
        Book.displayTotalBooks();
    }
}