/**
 * Created by Konstantin on 13.05.2016.
 */

public class Methodenueberladung {

    public  static  int sum ( int a, int b){
        int erg;
        erg = a+b;
        return  erg;
    }

    public  static  int sum ( int a, int b, int c){
        int erg;
        erg = a+b+c;
        return  erg;
    }

    public  static  double sum (double a, double b){
        double erg;
        erg = a+b;
        return erg;
    }

    // Variable Arugmentanzahl
    public  static  int sum (int ... werte){
        int erg= 0;
        for(int aktWert: werte)
        {
            erg = erg + aktWert;
            System.out.println("aktWert: " +aktWert);
        }
        return  erg;
    }

    public static void main(String[] args) {
        int erg;
        erg = sum (11,22);
        System.out.println(erg);
        System.out.println(sum(1.15422, 3.259));
        System.out.println(sum(5,6,9));
        int Werte[] ={1,5,6,9,8,5};
        System.out.println(sum(Werte));
        //Alternativ:
        //System.out.println(sum(1,2,5,9,5));
    }
}
