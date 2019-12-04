package se.library;

import java.util.ArrayList;

public class CustomerList {
	
private ArrayList <Customer> customers=new ArrayList<Customer>();

public void addOriginalCustomers() {
	Customer customer1=new Customer("Arne Arnesson", "650505", "arne@arnesson.com", 
			"abcdef","1");
	customers.add(customer1);
}

public CustomerList() {
	
}

public ArrayList<Customer> getCustomers() {
	return customers;
}

@Override
public String toString() {
	return "CustomerList [customers=" + customers + "]";
}



}
