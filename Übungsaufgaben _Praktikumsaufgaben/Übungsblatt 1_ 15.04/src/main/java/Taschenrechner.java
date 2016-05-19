/*
*Aufgabe 1.3
*/
import java.util.Scanner;

public class Taschenrechner
{

    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Bitte geben sie zwei Zahlen, getrennt durch Leerzeichen ein: ");
        a = sc.nextInt();
        b = sc.nextInt();
        
       int s  = a+b;
       int d  = a-b;
       int p = a*b;
       int q =  a/b;
       System.out.println("Die Summe der von dir eingegebenen Zahlen ist " + s);
       System.out.println("Die Differenz der von dir eingegebenen Zahlen ist " + d);
       System.out.println("Das  Produkt  der von dir eingegebenen Zahlen ist " + p);
       System.out.println("Der Quotient der von dir eingegebenen Zahlen ist " + q);            
     }    
}