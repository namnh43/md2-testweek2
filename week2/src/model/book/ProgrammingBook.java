package model.book;

public class ProgrammingBook extends Book{
    private String language;
    private String framework;

    public ProgrammingBook() {
    }

    public ProgrammingBook(String bookCode, String name, long price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

}
