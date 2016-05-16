/**
 * Created by Konstantin on 13.05.2016.
 *  Berechnung von Funktionen
 *
 */
public class Funktionen {
    public  static  int quadrat(int x){
        return  x*x;
    }

    public static  int zweiHoch(int x){
        int erg = 1;
            for(int i = 0; i <x; i++){
                erg = erg * 2;
            }
        return erg;
    }

    public static void main(String[] args) {
        int max =10;
        for(int i = 1; i <= max; i++){
            System.out.println(i + " ; " + quadrat(i) + " ; " + zweiHoch(i));
        }
      //  System.out.println(a + " Quadrat = " + quadrat(a) );
     //   System.out.println(a + " Zwei hoch "+a+ " = " + zweiHoch(a) );
    }
}
