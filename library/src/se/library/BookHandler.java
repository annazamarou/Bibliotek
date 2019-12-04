package se.library;

import java.util.ArrayList;

/**
 * @author Stefan
 */
public class BookHandler {

    private final ArrayList<Book> books;

    public BookHandler() {

        books = new ArrayList<>();
        listOfBooks();
    }

    public void listAllBooks() {

        for (Book b : books) {
            System.out.println(b.toString());
        }
    }

    public void listOfBooks() {

        Book lotr1 = new Book("Zamarou om ringen 1", "J.R.R. Tolkien", true, true);
        books.add(lotr1);
        Book lotr2 = new Book("Zamarou om ringen 2", "J.R.R. Tolkien", true, true);
        books.add(lotr2);
        Book lotr3 = new Book("Zamarou om ringen 3", "J.R.R. Tolkien", false, true);
        books.add(lotr3);
        Book fsg = new Book("Fifty shades of Stefan", "E.L. James", true, true);
        books.add(fsg);
        Book jsfs = new Book("Java steg för steg", "Johanna Axnér", true, false);
        books.add(jsfs);
        Book got = new Book("A Game of Thrones", "Danny Targaryen", true, true);
        books.add(got);


        Book testbok = new Book("Testbok", "George R.R. Martin", true, true);
        books.add(testbok);
    }

    public void addBook(Book bookToAdd) {
        books.add(bookToAdd);
    }

    public void removeBook(Book bookToRemove) {
        books.remove(bookToRemove);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
