/**
 * Created by Konstantin on 15.05.2016.
 * Ein Programm das mit Hilfe der Eingaben vom Nutzer ausgibt wielange die Fahrt dauer und wieviel Kraftstoff verbraucht wird
 * Keine Kommentare da selbsterklärend
 */
import java.util.Scanner;
public class Fahrtdauer {
    public static void main(String[] args) {
        pln("Bitte geben sie die Durschnittliche Geschwindigkeit ein (km/h): ");
    Scanner sc = new Scanner(System.in);
        double dGschw = sc.nextDouble();
        pln("Bitte geben sie die zu fahrende Strecke ein (km): ");
        double strecke = sc.nextDouble();
        pln("Bitte geben sie den Durchschnittlichen Verbrauch pro 100 km an in (L): ");
        double dVerb = sc.nextDouble();
        double erg = strecke/dGschw;
        double verb = strecke/100*dVerb;
        System.out.println("Die Dauer der Fahrt beträgt" + erg + "und der Verbrauch liegt bei" +  verb);


    }

    /**
     * Hilfmethode für schnellere String Ausgabe
     * @param string
     * Der auszugegeben Text
     */
    public  static  void pln(String string){
        System.out.println(string);
    }
}
