/**
 * Aufgabe 3.1
 * Bisher ohne Kommentierung (folgt)
 * Created by Konstantin on 15.05.2016.
 * Dies ist ein Programm, dass zwei int Werte x und y einliest
 * und den Benutzer fragt welche Rechenoperation durchgeführt werden soll.
 * Anschließend das Ergebnis ausgibt und fragt ob noch eine Berechnung durchgeführt werden soll.
 */

import java.util.Scanner;

public class Taschenrechner {
    /**
     * Einstieg des Programmes, sowie Ablaufsteurerung des Spieles
     * Über die var bool vT 'brechnung' und mithilfe while, wird gesteuert ob man eine erneute Berechnung durchführen möchte oder nicht
     * Ein durchlauf erfolgt mindestens
     *
     * @param args
     * Startargumente
     */
    public static void main(String[] args) {

        boolean berechnung = true;                       //Solange true neue Berechnung
        Scanner sc = new Scanner(System.in);

        /*
         * Nachfolgender Code wiederholt sich bei jedem Durchlauf
         */

        while (berechnung) {
            int x, y;
            pl("Bitte geben sie zwei Ganzzahlen ein um fortzufahren: ");
            x = sc.nextInt();
            y = sc.nextInt();
            pl("Bitte geben sie den Code der gewünschten Operation ein: ");
            pl("Addition(1) ; Subtraktion (2) ; Division (3) ; Multiplikation (4) ; x hoch y (5) ; Fakultaet x(6) ; Fakultaet y (7)");
            int Operation = sc.nextInt();
            /*
             * Welche Operation durchgeführt werden soll wird hier bestimmt
             */
            switch (Operation) {
                //Addition
                case 1:
                    pl("Die Berechnung:");
                    System.out.println(x + " + " + y + " = " + addi(x, y));
                    break;
                //Subtraktion
                case 2:
                    pl("Die Berechnung:");
                    System.out.println(x + " - " + y + " = " + subt(x, y));
                    break;
                //Division
                case 3:
                    pl("Die Berechnung:");
                    System.out.println(x + " % " + y + " = " + divi(x, y));
                    break;
                //Multiplikation
                case 4:
                    pl("Die Berechnung:");
                    System.out.println(x + " * " + y + " = " + multi(x, y));
                    break;
                //x hoch y
                case 5:
                    pl("Die Berechnung:");
                    System.out.println(x + " ^ " + y + " = " + xy(x, y));
                    xy(x, y);
                    break;
                // Fakultät von x
                case 6:
                    pl("Die Berechnung:");
                    System.out.println(" Fakultät von " + x + " = " + fak(x));
                    break;
                //Fakultät von y
                case 7:
                    pl("Die Berechnung:");
                    System.out.println(" Fakultät von " + y + " = " + fak(y));
                    break;
                //Wenn keine zulässige Zahl eingegeben wird
                default:
                    pl("Dies ist keine Korrekte Eingabe! bitte versuchen sie es erneut!");
                    break;

            }
            boolean beantwortet = false;        // Wenn true wurde mit einer güligen Antwort geantwortet
            pl("Möchten sie noch eine Berechnung ausführen?");

            while(!beantwortet){
                String antwort = sc.nextLine();         // Usereingabe
                //verlasse schleife und fange mit while(1) neu an
                if(antwort.equals("ja")){
                    beantwortet = true;
                }
                // Wenn nein, dann breche das Porgramm komplett ab indem while(1) false geschaltet wird
                else if (antwort.equals("nein")){
                    beantwortet = true;
                    berechnung = false;
                }
                // Wenn keine der beiden gültigen Eingabe Frage erneut nach
                else{
                    pl("Keine gültige Eingabe.  Möchten sie noch eine Berechnung ausführen ? (ja) (nein)");
                }
            }
        }
    }

    /**
     * Eine Methode die das Ausgeben von Strings vereinfacht durch verkürzte Schreibweise.
     * @param string
     * Der angegebene String wird als Text per System.out.println ausgegeben in der Konsole
     */
    public  static  void pl(String string){
        System.out.println(string);
    }

    /**
     * Addition von zwei Ganzzahlen
     * @param x
     * Wert 1
     * @param y
     * Wert 2
     * @return
     * Das Ergebnis wird zurückgegeben
     */
    public  static  int addi(int x, int y){
        int erg = x+y;
        return  erg;
    }

    /**
     * Subtraktion zweier Ganzzahlen
     * @param x
     * Wert 1
     * @param y
     * Wert 2
     * @return
     * Das Ergebnis wird zurückgegeben
     */
    public  static  int subt(int x, int y){
        int erg = x-y;
        return  erg;
    }

    /**
     * Multiplikation zweier Ganzzahlen
     * @param x
     * Wert 1
     * @param y
     * Wert 2
     * @return
     * Das Ergebnis wird zurückgegeben
     */
    public  static int multi(int x,int y){
        int erg = x*y;
        return erg;
    }

    /**
     * Division zweier Ganzzahlen
     * @param x
     * Wert 1
     * @param y
     * Wert 2
     * @return
     * Das Ergebnis wird zurückgegeben
     */
    public  static  int divi(int x,int y){
        int erg = x/y;
        return erg;
    }

    /**
     * x hoch y
     * @param x
     * Basis
     * @param y
     * Exponent
     * @return
     * Das Ergebnis wird zurückgegeben
     */
    public  static  int xy(int x,int y){
        int erg = x;
        for(int i = 1; i <y;i++){

            erg *= x;
        }
        return  erg;
    }

    /**
     * Fakultät einer Zahl
     * @param z
     * Der Wert zu dem die Fakultät gebildet werden soll
     * @return
     * Das Ergebnis wird zurückgegeben
     */
    public static  int fak(int z){

        if(z==0){
            return 1;
        }
        return  z * fak(z-1);
    }
}
