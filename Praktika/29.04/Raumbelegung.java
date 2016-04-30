/*
*Aufgabe 3.1
*/
import java.util.Scanner;
public class Raumbelegung {
    public static void main(String[] args) {
        int Studis;
        int Rechnerz;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben sie die Anzahl der Studierenden ein: ");
        Studis = sc.nextInt();
        System.out.println("Bitte geben sie die Anzahl der Rechner pro Raum an: " );
        Rechnerz = sc.nextInt();
        int Raum =0;
        if(Studis > Rechnerz){
            while(Studis > Rechnerz ){
                Studis -= Rechnerz;
                Raum++;
            }
        }
        
        else{
            Raum++;
        }

    System.out.println("Es werden " + Raum + " Räume benötigt.");
    System.out.println("Im letzten Raum sind " + Studis + "Rechner belegt.");
    }
}