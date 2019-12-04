package se.library;

import java.util.Scanner;

/**
 *
 * @author danny
 */
public class LogIn {

    private boolean s;
    private String personnummer;
    private String lösenord;
    Scanner sc = new Scanner(System.in);

    public boolean newUser(String personalNo) {

        Menu menu = new Menu();
        System.out.println("Ange din personnummer YYYYMMDD");
        personalNo = sc.nextLine();

        if (personalNo.length() == 8) {
            System.out.println("Inloggning lyckad..");
            menu.user();

        } else {
            System.out.println("Du har matat in ditt personnummer i fel format.");
            return false;
        }
        return true;
    }

    public boolean isS() {
        return s;
    }

    public void setS(boolean s) {
        this.s = s;
    }

    public String getPersonnummer() {
        return personnummer;
    }

    public void setPersonnummer(String personnummer) {
        this.personnummer = personnummer;
    }

    public String getLösenord() {
        return lösenord;
    }

    public void setLösenord(String lösenord) {
        this.lösenord = lösenord;
    }

}
