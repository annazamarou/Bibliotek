
package se.library;

/**
 *
 * @author danny
 */
public class LogIn {
    private boolean s ;
    private String personnummer ;
    private String lösenord ;
    public void Test( String personnummer){
        personnummer = this.personnummer;
     if ( this.personnummer.length() != 8)
         System.out.println("Fel inmatning!");
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
