/** Aufgabe 2.1
*@author: Konstantin
*@version: 0.1
*@date: 24.04.2016
*@describtion: Ein Programm das den Nutzer fragt, ob er etwas ein oder auszahlen möchte, diesen Wert mit dem Guthaben
*              verrechnet und den anschließend verbleibenden Guthaben ausgeben.
*/

import java.util.Scanner;

public class Kontofuehrung{
    
 

    public static void main(String[] args){
 
       float Kontostand = 1000f;
    
        Scanner sc = new Scanner(System.in);  
        while(true){      
        System.out.println("Ihr Kontostand beträgt: " + Kontostand + " Euro");
       // System.out.println("Möchten sie etwas einzahlen(1) oder abheben(2)?");
        System.out.println("Möchten sie etwas einzahlen oder abheben?");
        //int eingabe = 0;
        int eingabe = sc.nextInt();
        //String nutzerEingabe = sc.next();
        String nutzerEingabe = null;
        System.out.println(nutzerEingabe);
        if(eingabe == 1 || nutzerEingabe == "einzahlen" || nutzerEingabe == "Einzahlen"){
        System.out.println("Welchen Betrag möchten sie den Einzahlen? ");
        float zuBerechnen = sc.nextFloat();
        Kontostand += zuBerechnen;
        }
        else if (eingabe ==2 ||nutzerEingabe == "abheben" || nutzerEingabe == "Abheben"){
        System.out.println("Welchen Betrag möchten sie den abheben? ");
        float zuBerechnen = sc.nextFloat();
        if(zuBerechnen > Kontostand){
        System.out.println("Der Betrag den du auszahlen möchtest ist größer als dein aktuelles Guthaben.");
        }else{
        Kontostand -= zuBerechnen;
        }
        }
        else{
            System.out.println("Dies ist kein Korrekter Befehl!");
        }
          //   System.out.println("Ihr Kontostand beträgt: " + Kontostand + " Euro");
        
        
    }
    }
    
}