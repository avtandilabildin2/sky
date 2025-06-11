import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int dateCreated;

    public void setDateCreated(int dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;

        return dateCreated == book.dateCreated && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(title);
        result = 31 * result + Objects.hashCode(author);
        result = 31 * result + dateCreated;
        return result;
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

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
