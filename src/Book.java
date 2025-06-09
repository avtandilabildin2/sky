public class Book {
    private String title;
    private Author author;
    private int dateCreated;

    public void setDateCreated(int dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getDateCreated() {
        return dateCreated;
    }

    public Book(String title, Author author, int dateCreated) {
        this.title = title;
        this.author = author;
        this.dateCreated = dateCreated;
    }
}
