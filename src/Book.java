public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String printInfo() {
        return "Book: Harry Potter, Rowling, 500 pages";
    }
}
