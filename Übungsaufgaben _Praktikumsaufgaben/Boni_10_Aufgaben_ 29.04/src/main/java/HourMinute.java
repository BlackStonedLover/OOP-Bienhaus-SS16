/*
*Aufgabe 3.3
*/
import java.util.Scanner;
public class HourMinute {
    public static void main(String[] args) {
        int startHour,startMinute;
        int endHour,endMinute;
        int KlausurZeit = 0;
        startHour = 10;
        startMinute = 30;
        endHour = startHour;
        endMinute = startMinute;
        Scanner sc = new Scanner (System.in);
        System.out.println("Bitte geben sie die Klausurdauer an: ");
        KlausurZeit = sc.nextInt();
        if(KlausurZeit == 90 || KlausurZeit == 120 || KlausurZeit ==150)
        {
            endMinute +=KlausurZeit;
            System.out.println("Debug endMinute+ KlausurZeit");
                while(endMinute >= 60)
                {
                    endHour++;
                    endMinute = endMinute - 60;
                    System.out.println("Eine Stunde erhöht");
                }
            
        }
          else
            System.out.println("Dies ist keine gültige Klausurdauer.");
          
         System.out.println("Startuhrzeit: " + startHour + ":" + startMinute + " Endzeit: " + endHour + ":" +endMinute );
    }
    

}