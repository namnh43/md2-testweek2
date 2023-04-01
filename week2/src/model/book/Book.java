package model.book;

public abstract class Book {
    protected String bookCode;
    protected String name;
    protected long price;
    protected String author;

    public Book() {
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String bookCode, String name, long price, String author) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }
}
