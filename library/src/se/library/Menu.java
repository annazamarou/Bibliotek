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
            }
        }
    }
    
    public void displayMenu(){
        System.out.println("Välkommen till Bibliotek!");
        int choise = nextInt("/n [1] Bibliotekarie"
                + "/n [2] Låntagare"
                + "/n [0] Avsluta");
    
        switch(choise){
            case 1:
                librarian();
                break;
            case 2:
                user();
                break;
            case 3:
                displayMenu();
                break;
            default:
                System.out.println("Du har angivit fel nummer. Försök igen!");
                break;
        }
    }  
    
    public void librarian(){
        int choise = nextInt("/n [1] Hantera böcker"
                + "/n [2] Hantera kundiformation"
                + "/n [0] Gå tillbaka");
    
        switch(choise){
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
        int choise = nextInt("/n [1] Lägg till böcker"
                + "/n [2] Tar bort böcker"
                + "/n [0] Gå tillbaka");
    
        switch(choise){
            case 1:
                //lägg till böcker
                break;
            case 2:
                //tar bort böcker
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
        int choise = nextInt("/n [1] Lägg till kund"
                + "/n [2] Ändra/tar bort  användaren"
                + "/n [0] Gå tillbaka");
    
        switch(choise){
            case 1:
                //lägg använadaren
                break;
            case 2:
                //tar bort användaren
                break;
            case 3:
                librarian();
                break;
            default:
                System.out.println("Du har angivit fel nummer. Försök igen!");
                break;
        }
    }  

    public void user(){
        int choise = nextInt("/n [1] Mina sida"
                + "/n [2] Visa Boklista"
                + "/n [0] Gå tillbaka");
    
        switch(choise){
            case 1:
                myPage();
                break;
            case 2:
                //boklista
                break;
            case 3:
                displayMenu();
                break;
            default:
                System.out.println("Du har angivit fel nummer. Försök igen!");
                break;
        }
    }  
     
     public void myPage(){
        int choise = nextInt("/n [1] Hantera reserverade böcker"
                + "/n [2] Återlämna lånade böcker"
                + "/n [0] Gå tillbaka");
    
        switch(choise){
            case 1:
                //hentera reservation
                break;
            case 2:
                //lämna tillbacka
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



