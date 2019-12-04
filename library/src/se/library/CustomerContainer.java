package se.library;

import java.util.ArrayList;

/**
 * @author Consultant Johan Lind.
 * 49 hours - hourly rate $200 - total 9 800USD.
 */
public class CustomerContainer {

    ArrayList<Customer> customerList = new ArrayList<>();
    int nextLibraryCardNumber;

    public CustomerContainer() {
        nextLibraryCardNumber = 1;
        readInCustomers();

    }

    private void readInCustomers() {
        Customer tempCustomer = new Customer("Erik", "471130-4425", "Erik@newton.se", "safepassword123", "" + nextLibraryCardNumber);
        getCustomerDeepCopyOf(tempCustomer);
        customerList.add(getCustomerDeepCopyOf(tempCustomer));
        nextLibraryCardNumber += 1;

        tempCustomer = new Customer("David B", "131030-4125", "Davidb@newton.se", "qwertysafepassword", "" + nextLibraryCardNumber);
        getCustomerDeepCopyOf(tempCustomer);
        customerList.add(getCustomerDeepCopyOf(tempCustomer));
        nextLibraryCardNumber += 1;

    }

    public void addCustomerToLibrary(Customer customerToAdd) {
        customerToAdd.setLibraryCardNo("" + nextLibraryCardNumber);
        customerList.add(customerToAdd);
        nextLibraryCardNumber += 1;
    }

    public boolean removeCustomerFromLibrary(String customerLibraryCard) {
        if (doesCustomerExist(customerLibraryCard)) {
            for (Customer customer : customerList) {
                if (customer.getLibraryCardNo().equals(customerLibraryCard)) {
                    customerList.remove(customer);
                    System.out.println("Kund: " + customer.getName() + " är borttagen ur systemet");
                    return true;
                }
            }
        }

        System.out.println("Bibliotekskortsnumret finns inte, kunden togs inte bort!");
        return false;

    }

    private boolean doesCustomerExist(String libraryCardNumberToRemove) {
        for (Customer customer : customerList) {
            if (customer.getLibraryCardNo().equals(libraryCardNumberToRemove)) {
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

    public Customer login(String libraryCardNumber, String password) {
        if (doesCustomerExist(libraryCardNumber)) {
            for (Customer customer : customerList) {
                if (customer.getLibraryCardNo().equals(libraryCardNumber) && isPassordCorrect(customer, password)) {
                    System.out.println("Login Success");
                    return customer;
                }
            }
        }

        System.out.println("I'm Sorry but you either entered wrong password or librarycard number");
        return null;
    }

    private boolean isPassordCorrect(Customer customer, String password) {
        if (customer.getPassword().equals(password)) {
            return true;
        }

        System.out.println("Wrong password");
        return false;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public int getNextLibraryCardNumber() {
        return nextLibraryCardNumber;
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
