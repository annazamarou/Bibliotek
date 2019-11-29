
package se.library;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danny
 */
public class Admin {
    private ArrayList<String> borrower = new ArrayList<String>();
    private ArrayList<String> book = new ArrayList<String>();
    
    public void addBorrower( String name){
    
        borrower.add(name);
    }
    
    public void addBook( String bookAndAuthor){
    
        borrower.add(bookAndAuthor);
    }
    
    public void removeBorrower (int position){
        borrower.remove(position);
    }
    
    public void removeBook(int position){
        book.remove(position);
    }
}
