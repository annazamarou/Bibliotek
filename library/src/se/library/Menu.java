/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.library;

import java.util.Scanner;

/**
 *
 * @author nikos
 */

public class Menu {

    Scanner sc = new Scanner(System.in);
    
    //Tvingar användaren att skriva in ett nummer och return nummret som användaren har skrivit in
    public int nextInt(String description) {
        while (true) {
            System.out.println(description);
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException nFE) {
                System.out.println("Mata in endast in siffror");
                //
            }
        }
    }
    
    public void displayMenu(){
        while(true){
        System.out.println("Välkommen till Bibliotek!");
        int choice = nextInt("\n[1] Bibliotekarie"
                + "\n[2] Låntagare"
                + "\n[3] Avsluta");
    
        switch(choice){
            case 1:
                librarian();
                break;
            case 2:
                userChoice();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Du har angivit fel nummer. Försök igen!");
                break;
        }
        }
    }  
    
    public void librarian(){
        int choice = nextInt("\n[1] Hantera böcker"
                + "\n[2] Hantera kundiformation"
                + "\n[3] Gå tillbaka");
    
        switch(choice){
            case 1:
                bookHandling();
                break;
            case 2:
                userHandling();
                break;
            case 3:
                displayMenu();
                break;
            default:
                System.out.println("Du har angivit fel nummer. Försök igen!");
                break;
        }
    }  
    
    public void bookHandling(){
        int choice = nextInt("\n[1] Lägg till böcker"
                + "\n[2] Tar bort böcker"
                + "\n[3] Gå tillbaka");
    
        switch(choice){
            case 1:
                Admin addBook= new Admin();
                addBook.addBook();
                break;
            case 2:
                Admin removeBook = new Admin();
                removeBook.removeBook(sc.nextInt());
                sc.close();
                break;
            case 3:
                librarian();
                break;
            default:
                System.out.println("Du har angivit fel nummer. Försök igen!");
                break;
        }
    }  
    
     public void userHandling(){
        int choice = nextInt("\n[1] Lägg till kund"
                + "\n[2] Ändra/tar bort  användaren"
                + "\n[3] Gå tillbaka");
    
        switch(choice){
            case 1:
                Admin newUser = new Admin();
                newUser.addBorrower(sc.nextLine());
                sc.close();
                break;
            case 2:
                Admin removeUser = new Admin();
                removeUser.removeBorrower(sc.nextInt());
                sc.close();
                break;
            case 3:
                librarian();
                break;
            default:
                System.out.println("Du har angivit fel nummer. Försök igen!");
                break;
        }
    }  
     
    public int userChoice(){
        int choice = nextInt("\n[1]Log in"
                + "\n[2]Skapa ny konto"
                + "\n[3] Gå tillbaka");
    
        switch(choice){
            case 1:
                System.out.println("Ange din personnummer");
                String personnummer = sc.nextLine();
                LogIn inloggning = new LogIn();
                inloggning.Test(personnummer);
                user();
                break;
            case 2:
                Customer newUser = new Customer("name", "personalNo", "email", "password", "libraryCardNo");
                System.out.println("Name: ");
                String name = sc.nextLine();
                System.out.println("Personnummer: ");
                String personalNo = sc.nextLine();
                System.out.println("Email: ");
                String email = sc.nextLine();
                System.out.println("Password: ");
                String password = sc.nextLine();     
                newUser.addNewBorrower(sc.nextLine());
                sc.close();
                break;
            case 3:
                displayMenu();
                break;
            default:
                System.out.println("Du har angivit fel nummer. Försök igen!");
                break;
        }
        return choice;
    }  

    public void user(){
        int choice = nextInt("\n[1] Mina sida"
                + "\n[2] Visa Boklista"
                + "\n[3] Gå tillbaka");
    
        switch(choice){
            case 1:
                myPage();
                break;
            case 2:
                BookList.listAllBooks();
                user();
                break;
            case 3:
                userChoice();
                break;
            default:
                System.out.println("Du har angivit fel nummer. Försök igen!");
                break;
        }
    }  
     
     public void myPage(){
        int choice = nextInt("\n[1] Hantera reserverade böcker"
                + "\n[2] Återlämna lånade böcker"
                + "\n[3] Gå tillbaka");
    
        switch(choice){
            case 1:
                //hantera reservation
                break;
            case 2:
                //lämna tillbaka
                break;
            case 3:
                user();
                break;
            default:
                System.out.println("Du har angivit fel nummer. Försök igen!");
                break;
        }
    }  
    
}



