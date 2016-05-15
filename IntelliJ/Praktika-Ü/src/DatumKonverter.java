/**
 * Created by Konstantin on 15.05.2016.
 * Ein Programm das das Datum konventiert nach dem Schmea:
 * Eingabe 15.05.2016 → Ausgabe 15. Mai 2016
 */

import java.util.Scanner;
public class DatumKonverter {
    /**
     * Komplette Programm in der Main
     * @param args
     * Startparamter
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pl("Bitte geben sie ein Datum in ein(DD.MM.JJ): ");
        // Variablen
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        // Ist der Tag und Monat eine gültige Angabe
        //TODO: Schlatjahr überprüfung ( Falls jemand Lust hat :P)
        if(day > 0 || day < 31 ||month > 0 || month < 12) {
            pl("Das Datum das du eingegben hast lautet: ");
            System.out.println(day + "."+ month +"." + year);
            pl("Konvertiert lautet dieses: ");
            String monthS = null;
            switch (month) {            // Abhänig von dem eingegebenen Monat wird der Entsprechende Monat in einem String gespeichert damit dieser ausgegben werden kann
                case 1:
                    monthS = "Jannuar";
                    break;
                case 2:
                    monthS = "Februar";
                    break;
                case 3:
                    monthS = "Maerz";
                    break;
                case 4:
                    monthS = " April";
                    break;
                case 5:
                    monthS = "Mai";
                    break;
                case 6:
                    monthS = "Juni";
                    break;
                case 7:
                    monthS = "Juli";
                    break;
                case 8:
                    monthS = "August";
                    break;
                case 9:
                    monthS = "Oktober";
                    break;
                case 10:
                    monthS = " September";
                    break;
                case 11:
                    monthS = "November";
                    break;
                case 12:
                    monthS = "Dezember";
                    break;
                default:
                    pl("Ungültige Angabe.");

            }
            //Ausgabe
            System.out.println(day + ". " + monthS + " " + year);
        }
        //Falls Tag oder Monat auserhalb der Reichweite liegt
        else{
            pl("Ungültige Angabe.");
        }

    }

    /**
     * System.out.println vereinfachte Schreibweise!
     * @param string
     * Der auszugebene String
     */
    public  static  void  pl(String string){
        System.out.println(string);
    }
}
