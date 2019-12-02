/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.library;

/**
 *
 * @author Stefan
 */
public class Main {
    public static void main(String[] args) {
        
//        Menu menu = new Menu();
//        menu.displayMenu();
    	CustomerList cl=new CustomerList();
    	cl.addOriginalCustomers();
    	
    	for (Customer i:cl.customers){
    		System.out.println(i);
    	}
    	
    }
    
}
