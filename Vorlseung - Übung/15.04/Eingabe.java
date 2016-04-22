/**
* In dieser Klasse wird der Nutzer aufgefordert Zahlen einzugeben, welche danach addiert werden
*/

import java.util.Scanner;   // Hier wird ein tool von Java Importiert um dieses im nachfolgedenen Code nutzen zu könnnen

public class Eingabe 
{
    public static void main (String [] args)
    {
     int i;         // Variable Definieren
     int j;         // Variable Definieren
     int e;         // Variable Definieren
     Scanner sc = new Scanner ( System.in);                     // Ein Scanner der Sachen einlesen kann wird als Object unter dem Objektnamen sc erstellt
     System.out.println("Ziffer Eingeben, die addiert werden sollen, trennen durch Leerzeichen:");                    // Der Nutzer wird aufgefordert Ziffern einzugeben
     
     i = sc.nextInt();              // Variable i ist die erste eingelesene Zahl 
     j = sc.nextInt();              // Variable j ist die darauf folgende Zahl
      e = i + j;
     System.out.println("Eingegeben wurde: " + i + " und " + j + ". Das Ergebnis lautet: " + e );   // Ausgabe von den beiden Ziffern
    }
}