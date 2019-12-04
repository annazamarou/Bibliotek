/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.library;

import java.awt.print.Book;
import java.util.ArrayList;

public class Customer {
    private String name;
    private String personalNo;
    private String email;
    private String password;
    private String libraryCardNo;
    private ArrayList<Book> borrowedBooks = new ArrayList<Book>();
    private ArrayList<CustomerContainer> newBorrower = new ArrayList<>();

    //private ArrayList<Book> reservedBooks = new ArrayList<Book>();
    public Customer(){
    }
    
    public Customer(String name, String personalNo, String email, String password, String libraryCardNo) {
        this.name = name;
        this.personalNo = personalNo;
        this.email = email;
        this.password = password;
        this.libraryCardNo = libraryCardNo;
    }

    public String getName() {
        return name;
    }

    public String getPersonalNo() {
        return personalNo;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getLibraryCardNo() {
        return libraryCardNo;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", personalNo='" + personalNo + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", libraryCardNo='" + libraryCardNo + '\'' +
                ", borrowedBooks=" + borrowedBooks;
    }

    public boolean isOver18(String personalNo) {
        String dateOfBirth = personalNo.substring(0, 3);
        int thisYear = 2019;
        int checkDateOfBirth = Integer.parseInt(dateOfBirth);
        if (checkDateOfBirth - thisYear >= 18) {
            return true;
        } else
            return false;
    }
}

