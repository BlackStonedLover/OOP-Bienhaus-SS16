/*
* Aufgabe 1.2
*/

import java.util.*;

public class Wahlberechtigung
{
    public static void main ( String [] args)
    {
       Scanner sc = new Scanner (System.in);
       System.out.print("Bitte geben sie ihren Vornamen ein: ");
       String vorname = sc.next();
       System.out.print("Bitte geben sie ihren Nachnamen ein: ");
       String nachname = sc.next();
       System.out.print("Hallo, " + vorname + " " + nachname + " !\n");
       System.out.print("Bitte Alter eingeben: ");
       int alter = sc.nextInt();
       if(alter >= 18){
          
           System.out.print("Sie sind wahlberechtigt. ");
       }
       else{
          
           System.out.print("Sie sind noch nicht wahlberechtigt.");
       }
    }
}