package se.library;

import java.util.ArrayList;

/**
 *
 * @author Stefan
 */
public class customerContainer {
    
    private String name;
    private String personalNo;
    private String email;
    private String password;
    private String libraryCardNo;
    
    ArrayList <String> customerList = new ArrayList<>();

        public customerContainer(String name, String personalNo, String email, String password, String libraryCardNo) {
        this.name = name;
        this.personalNo = personalNo;
        this.email = email;
        this.password = password;
        this.libraryCardNo = libraryCardNo;
    }
    
    public void newCustomer(String personalNo) {
        customerList.add(personalNo);
    }
    public void removeCustomer(){
        
    }
}
