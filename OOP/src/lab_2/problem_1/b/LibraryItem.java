package lab_2.problem_1.b;

public abstract class LibraryItem {
    private String title;
    private String author;
    private int publicationYear;

    public LibraryItem (String title_, String author_, int publicationYear_) {
        this.title = title_;
        this.author = author_;
        this.publicationYear = publicationYear_;
    }

    public void setTitle (String t) {
        this.title = t;
    }
    public String getTitle () {
        return title;
    }

    public void setAuthor (String author) {
        this.author = author;
    }
    public String getAuthor () {
        return author;
    }

    public void setPublicationYear (int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public int getPublicationYear () {
        return publicationYear;
    }

    @Override
    public String toString () {
        return "[title: " + title +
                ", author: " + author +
                ", publication year: " + publicationYear +
                "]";
    }

    public abstract String getItemType ();
}
