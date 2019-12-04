
package se.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author danny
 */
public class Admin {
    private ArrayList<String> borrowerList = new ArrayList<String>();
    private ArrayList<Book> bookList = new ArrayList<Book>();
    Scanner sc = new Scanner(System.in);


    public void printBookList() {

        System.out.println("Du har " + bookList.size() + " böcker i listan.");
        for (Book i : bookList) {
            System.out.println(bookList.indexOf(i) + 1 + ". " + i);
        }
    }

    public void printBorrowerList() {

        System.out.println("Du har " + borrowerList.size() + " låntagare i listan.");
        for (String i : borrowerList) {
            System.out.println(borrowerList.indexOf(i) + 1 + ". " + i);
        }
    }


    public void addBorrower(String name) {

        borrowerList.add(name);
    }

    public Book addBook() {

        sc = new Scanner(System.in);
        System.out.print("Ange titeln: ");
        String t = sc.nextLine();
        System.out.print("Ange författern: ");
        String a = sc.nextLine();

        return new Book(t, a);


        //  bookList.add(new Book( title,author,isAvailable,isAgeRestricted));
    }

    public void removeBorrower(int position) {
        borrowerList.remove(position - 1);
    }

    public Book removeBook(BookHandler bookHandler) {
        System.out.print("Ange titeln: ");
        String title = sc.nextLine();

        for (Book book : bookHandler.getBooks()) {
            if (book.getTitle().equals(title)) {
                return book;
            }

        }
        System.out.println("Titeln du angav finns inte");
        return null;
    }
}
