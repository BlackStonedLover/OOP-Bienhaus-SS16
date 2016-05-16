/**
* Written by Konstantin Kühn
* Überladen von Methoden 
* Bsp: Berechne Maximum zweier Zahlen
* int main: int m = max(10,21);
* double m2 = max(2.14,2.73);
*/
public class Rechner {
    public static void main(String[] args) {
        
    }
    public static int max (int a , int b){
        int erg;
        if(a>b){
            erg = a;
        }
        else
        {
            erg = b;
        }
        return erg;
    }
        public static double max (int a , int b){
        double erg;
        if(a>b){
            erg = a;
        }
        else
        {
            erg = b;
        }
        return erg;
    }
    public static int max (int a, int b, int c){
        int erg;
        if(a>b && a>c){
            erg = a;
        }
        else if(b>a && b>c){
            erg = b;
        }
        else
        {
            erg = c;
        }
        return  erg;
    }
}