package lab_2.problem_1.b;

public class Book extends LibraryItem {
    private int numberOfPages;
    private String genre;

    public Book (String title, String author, int publicationYear, int numberOfPages_, String genre_) {
        super(title, author, publicationYear);

        this.numberOfPages = numberOfPages_;
        this.genre = genre_;
    }

    public void setNumberOfPages (int numberOfPages_) {
        this.numberOfPages = numberOfPages_;
    }
    public int getNumberOfPages () {
        return numberOfPages;
    }

    public void setGenre (String genre_) {
        this.genre = genre_;
    }
    public String getGenre () {
        return genre;
    }

    @Override
    public String toString () {
        return "[title: " + getTitle() +
                ", author: " + getAuthor() +
                ", publication year: " + getPublicationYear() +
                ", number of pages: " + numberOfPages +
                ", genre: " + genre +
                "]";
    }

    @Override
    public String getItemType () {
        return "Book";
    }
}
