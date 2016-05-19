/**
*Aufgabe 2.2
*/
import java.lang.Math;
import java.util.Scanner;
public class Berechnung {
    
    public static void main(String[] args) {
        double umfangDose, hoeheDose;
        final double PI = Math.PI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben sie den Umfang der Dose an: ");
        umfangDose = sc.nextFloat();
        System.out.println("Bitte geben sie die Höhe der Dose an: ");
        hoeheDose = sc.nextFloat();
        
        double durchmesserBoden, flächeBoden, flächeMantel, flächeGesamt, volumen;
        //Berechnungen
        durchmesserBoden = umfangDose / PI;
        flächeBoden = PI * (durchmesserBoden/2) * (durchmesserBoden/2);
        flächeMantel = umfangDose *hoeheDose;
        flächeGesamt  = 2 * flächeBoden + flächeMantel;
        volumen = flächeBoden* hoeheDose;
        
        
        
        System.out.println("Umfang der Dose: " + umfangDose);
        System.out.println("Hoehe der Dose: " + hoeheDose);
        System.out.println("Durchmesser des Dosenbodens: " + durchmesserBoden);
        System.out.println("Flaeche des Dosenbodens: " + flächeBoden);
        System.out.println("Mantelflaeche der Dose: " + flächeMantel);
        System.out.println("Gesamtflaeche der Dose: " + flächeGesamt);
        System.out.println("Volumen der Dose: " + volumen);
            
                    
    }
    
}