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

    public static void main(String[] args) {

        boolean berechnung = true;
        Scanner sc = new Scanner(System.in);
        while (berechnung) {
            int x, y;
            pl("Bitte geben sie zwei Ganzzahlen ein um fortzufahren: ");
            x = sc.nextInt();
            y = sc.nextInt();
            pl("Bitte geben sie den Code der gewünschten Operation ein: ");
            pl("Addition(1) ; Subtraktion (2) ; Division (3) ; Multiplikation (4) ; x hoch y (5) ; Fakultaet x(6) ; Fakultaet y (7)");
            int Operation = sc.nextInt();
            switch (Operation) {
                case 1:
                    pl("Die Berechnung:");
                    System.out.println(x + " + " + y + " = " + addi(x, y));

                    break;
                case 2:
                    pl("Die Berechnung:");
                    System.out.println(x + " - " + y + " = " + subt(x, y));


                    break;
                case 3:
                    pl("Die Berechnung:");
                    System.out.println(x + " % " + y + " = " + divi(x, y));
                    break;
                case 4:
                    pl("Die Berechnung:");
                    System.out.println(x + " * " + y + " = " + multi(x, y));

                    break;
                case 5:
                    pl("Die Berechnung:");
                    System.out.println(x + " ^ " + y + " = " + xy(x, y));
                    xy(x, y);
                    break;
                case 6:
                    pl("Die Berechnung:");
                    System.out.println(" Fakultät von " + x + " = " + fak(x));
                    break;
                case 7:
                    pl("Die Berechnung:");
                    System.out.println(" Fakultät von " + y + " = " + fak(y));

                    break;
                default:
                    pl("Dies ist keine Korrekte Eingabe! bitte versuchen sie es erneut!");
                    break;

            }
            boolean beantwortet = false;
            pl("Möchten sie noch eine Berechnung ausführen?");

            while(!beantwortet){
                String antwort = sc.nextLine();
                if(antwort.equals("ja")){
                    beantwortet = true;
                }
                else if (antwort.equals("nein")){
                    beantwortet = true;
                    berechnung = false;
                }
            }
        }
    }

    public  static  void pl(String string){
        System.out.println(string);
    }


    public  static  int addi(int x, int y){
        int erg = x+y;
        return  erg;
    }

    public  static  int subt(int x, int y){
        int erg = x-y;
        return  erg;
    }

    public  static int multi(int x,int y){
        int erg = x*y;
        return erg;
    }

    public  static  int divi(int x,int y){
        int erg = x/y;
        return erg;
    }

    public  static  int xy(int x,int y){
        int erg = x;
        for(int i = 1; i <y;i++){

            erg *= x;
        }
        return  erg;
    }

    public static  int fak(int z){




        if(z==0){
            return 1;
        }

        return  z * fak(z-1);
    }
}
