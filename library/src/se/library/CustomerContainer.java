package se.library;

import java.util.ArrayList;

/**
 *
 * @author Consultant Johan Lind.
 * 49 hours - hourly rate $200 - total 9 800USD.
 *
 */
public class CustomerContainer {

    ArrayList <Customer> customerList = new ArrayList<>();
    int nextLibraryCardNumber;

        public CustomerContainer() {
            nextLibraryCardNumber = 1;
            readInCustomers();

        }

    private void readInCustomers() {
        Customer tempCustomer = new Customer("Kalle Svensson", "471130-4425", "kalle@svensson.se", "password123", "" + nextLibraryCardNumber);
        getCustomerDeepCopyOf(tempCustomer);
        customerList.add(getCustomerDeepCopyOf(tempCustomer));
        nextLibraryCardNumber += 1;

        tempCustomer = new Customer("Erik Andersson", "131030-4125", "Erik@andersson.se", "qwertysafepassword", "" + nextLibraryCardNumber);
        getCustomerDeepCopyOf(tempCustomer);
        customerList.add(getCustomerDeepCopyOf(tempCustomer));
        nextLibraryCardNumber += 1;

    }

    public CustomerContainer(ArrayList<Customer> newBorrower) {
        this.customerList = newBorrower;
    }

    public void addCustomerToLibrary(Customer customerToAdd) {
        customerList.add(customerToAdd);
        nextLibraryCardNumber += 1;
    }

    public boolean removeCustomerFromLibrary(String customerLibraryCard) {
            if(doesCustomerExist(customerLibraryCard)) {
                for (Customer customer : customerList) {
                    if(customer.getLibraryCardNo().equals(customerLibraryCard)) {
                        customerList.remove(customer);
                        return true;
                    }
                }
            }

            System.out.println("Customer does not exist");
            return false;

    }

    private boolean doesCustomerExist(String libraryCardNumberToRemove) {
            for(Customer customer:customerList) {
                if(customer.getLibraryCardNo().equals(libraryCardNumberToRemove)) {
                    return true;
                }
            }

            return false;
    }

    private Customer getCustomerDeepCopyOf(Customer tempCustomer) {
        // Not sure if this method is needed in this particular program. This method makes a deep copy, which
        // means that if you update the the objects data, you just manipulate data for this particulat object. A deep
        // copy is useful if you pass the same object around and update the data but want to store data of the object in
        // a particular state. For example in readInCustomers, if a deep copy is not made of every object all customers
        // will have the same details since one object is used to fill the list with customers.

        Customer deepCopy =
                new Customer(tempCustomer.getName(), tempCustomer.getPersonalNo(), tempCustomer.getEmail(),
                        tempCustomer.getPassword(), tempCustomer.getLibraryCardNo());

        return deepCopy;
    }

    @Override
    public String toString() {

        String stringToReturn = "";
        for (Customer customer : customerList) {
            stringToReturn += "Name: " + customer.getName() + "\n" + "PersonalNumber: " + customer.getPersonalNo()
                    + "\n" + "Email: " + customer.getEmail() + "\n" + "Password: " + customer.getPassword() + "\n" +
                    "LibraryCard: " + customer.getLibraryCardNo() + "\n" + "\n =============================\n";
        }

        return stringToReturn;
    }
    
}
