/**
 * Created by Konstantin on 20.05.2016.
 */
public class ArrayQuadrahtzahle {

    public static void main(String[] args) {
        int max = 100;
        int[] quadrahtzahem = new int[max];
        //Füllen des Arrays mit den Quadrahtahlen
        for(int i = 0; i <quadrahtzahem.length;i++){
                quadrahtzahem[i] = i*i;
        }
        // Ausgabe
        for(int i = 0; i <quadrahtzahem.length;i++){
            int position = i+1;
            System.out.println("ArrayIndex: "+ position + "; " + "Wert: " + quadrahtzahem[i]);
        }
    }
}
