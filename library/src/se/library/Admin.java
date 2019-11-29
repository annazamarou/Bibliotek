
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

 
    public void printBookList(){
    
    System.out.println("Du har "+ book.size() + " böcker i listan.");
    for ( String i : book){
    System.out.println(book.indexOf(i)+1 + ". " + i);
    }
    }
    
    public void printBorrowerList(){
    
    System.out.println("Du har "+ borrower.size() + " låntagare i listan.");
    for ( String i : borrower){
    System.out.println(borrower.indexOf(i)+1 + ". " + i);
    }
    }
    
   
   
    public void addBorrower( String name){
    
        borrower.add(name);
    }
    
    public void addBook( String bookAndAuthor){
    
        book.add(bookAndAuthor);
    }
    
    public void removeBorrower (int position){
        borrower.remove(position);
    }
    
    public void removeBook(int position){
        book.remove(position);
    }
}
