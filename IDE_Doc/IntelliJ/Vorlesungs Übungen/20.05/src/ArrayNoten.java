/**
 * Created by Konstantin on 20.05.2016.
 */
public class ArrayNoten {

    public static void main(String[] args) {
        double[] noten = {1.3,2.7,4.0,3.7};
        arrayAusgabe(noten);
        int posVierNull = sucheVierNull(noten);
        System.out.println("posVierNullen: " + posVierNull);
        arrayAenderung(noten, 0.3);
        arrayAusgabe(noten);
    }

    public  static  void arrayAusgabe(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Note " + i + "=" + array[i]);
        }
    }
    public static  void arrayAenderung(double[] array , double wert)
    {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] -  wert;

        }
    }


    //s  Suche nach der Note 4.0, falls gefunden, wird die Position zurückgegeben, fall nicht: Rückgabe -1

    public static  int sucheVierNull(double[] noten){
        int pos = -1;
        for(int i = 0; i < noten.length; i++){
            if (noten[i] == 4.0){
                pos = i;
            }

        }

        return  pos;
    }
}
