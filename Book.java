public class Book {

    private String bookId;
    private String bookName;
    private String author;
    private int quantity;

    public Book(String bookId, String bookName, String author, int quantity) {

        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.quantity = quantity;

    }

    public String getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}