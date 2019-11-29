/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.library;



public class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    private boolean isAgeRestricted;
    //  private ArrayList<Customer> reservations=new ArrayList <>();


    public Book(String title, String author, boolean isAvailable, boolean isAgeRestricted) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
        this.isAgeRestricted = isAgeRestricted;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean isAgeRestricted() {
        return isAgeRestricted;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                ", isAgeRestricted=" + isAgeRestricted +
                '}';
    }
}

    
}
