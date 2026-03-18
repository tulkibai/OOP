package lab_2.problem_1.b;

public class LibraryTest {
    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell", 1949, 328, "dystopian novel");

        System.out.println(book);
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Publication year: " + book.getPublicationYear());
        System.out.println("Number of pages: " + book.getNumberOfPages());
        System.out.println("Genre: " + book.getGenre());
        System.out.println("Item type: " + book.getItemType());
    }
}
