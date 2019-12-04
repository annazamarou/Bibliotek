package se.library;

import java.util.ArrayList;

/**
 *
 * @author Stefan
 */
public class BookHandler {

    private final ArrayList<Book> books;

    public BookHandler() {
        books = new ArrayList<>();
    }

    public static void listAllBooks() {
        BookHandler bl = new BookHandler();
        bl.listOfBooks();
        for (Book b : bl.books) {
            System.out.println(b);
        }
    }

    public void listOfBooks() {

        Book lotr1 = new Book("Sagan om ringen 1", "J.R.R. Tolkien", true, true);
        books.add(lotr1);
        Book lotr2 = new Book("Sagan om ringen 2", "J.R.R. Tolkien", true, true);
        books.add(lotr2);
        Book lotr3 = new Book("Sagan om ringen 3", "J.R.R. Tolkien", false, true);
        books.add(lotr3);
        Book fsg = new Book("Fifty shades of Grey", "E.L. James", true, true);
        books.add(fsg);
        Book jsfs = new Book("Java steg för steg", "Jan Skansholm", true, false);
        books.add(jsfs);
        Book got = new Book("A Game of Thrones", "George R.R. Martin", true, true);
        books.add(got);
    }
}
