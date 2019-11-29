
package se.library;

import java.util.ArrayList;

/**
 *
 * @author Stefan
 */
public class BookList {
    private ArrayList<String> books;
        
    public BookList() {
        books = new ArrayList<>();    
    }
    
    public void listOfBooks() {
        Book lotr = new Book("Titel: " + "Sagan om ringen" + '\n'
        + "Författare: " + "J.R.R. Tolkien"); 
        books.add();
        
        
        books.add("Titel: " + "Sagan om ringen" + '\n' 
                + "Författare: " + "J.R.R. Tolkien");
        books.add("Titel: " + "Sagan om ringen" + '\n' 
                + "Författare: " + "J.R.R. Tolkien");
        books.add("Titel: " + "Sagan om ringen" + '\n' 
                + "Författare: " + "J.R.R. Tolkien");
        books.add("Titel: " + "Sagan om ringen" + '\n' 
                + "Författare: " + "J.R.R. Tolkien");
        books.add("Titel: " + "Sagan om ringen" + '\n' 
                + "Författare: " + "J.R.R. Tolkien");
        books.add("Titel: " + "Sagan om ringen" + '\n' 
                + "Författare: " + "J.R.R. Tolkien");
        
        
        return null;
    }
    
}
