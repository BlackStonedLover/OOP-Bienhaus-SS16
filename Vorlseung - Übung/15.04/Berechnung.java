/*
* Eine Klasse die zwei Zahlen addiert und in einer Variable speichert.
* Diese Variable wird dann ausgegeben in der Konsole.
*/
public class Berechnung 
{
    public static void main (String [] args)
    {
        int i;          // Variable definieren, Variable i vom Typ int ( integer, Größe: 32 bit ) 
        i = 3+4;        // Varibale i wird  zugewiesen 3+4 => 7 somit wird 7 abgespeichert.
        System.out.println(i);    // Ausgabe von der Variable i => 7  => Konsole gibt aus 7
    }    
    
    /*
    * Weitere Beispiele und Möglichkeiten in folgendem ohne Ausgabe, sowie ohne durchführung im Programm:
    */
    
    public void bsp1 ()
    {
     int i = 5;         // Variable definieren, sowie einen Wert zuweisen in einer Zeile
     int k = 6;         // Variable definieren, " " 
     int e;             //Variable definieren ohne Zuweisung!  


       e = i + k;       // Die Variable e ist i + k !
    }
    
        public void bsp2 ()
    {
     int i = 5;         // Variable definieren, sowie einen Wert zuweisen in einer Zeile
     int k = 6;         // Variable definieren, " " 
    

     i += k;            // Zu der Variable i wird nun der Wert der Variable k addiert.
     
    }
}

