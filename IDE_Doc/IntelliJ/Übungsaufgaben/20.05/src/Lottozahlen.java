/**
 * Created by Dijivu on 21.05.2016.
 */

import java.util.Random;
public class Lottozahlen {
    static  int[] zahlen = new int[100];
    static  int[] doppelteZahlen =new int[50];

    public static void main(String[] args) {
        initArray();

        ausgabeArray(zahlen);
        System.out.println("Maximalwert: "+maxWert());
        System.out.println("Minimalwert: "+minWert());
        System.out.println("Mittelwert: "+midWert());


        sucheDoppelte();
        System.out.println("Auswertung: ");
        ausgabeArray(doppelteZahlen);
        System.out.println("Erste doppelte Zahl bei:  " + indexErsteDoppelte(zahlen));
    }

    public static  void  sortin(){

        for(int s=0;s<=zahlen.length-1;s++){
            for(int k=0;k<=zahlen.length-2;k++){
                if(zahlen[k]>zahlen[k+1]){   //comparing array values

                    int temp=0;
                    temp=zahlen[k];     //storing value of array in temp variable

                    zahlen[k]=zahlen[k+1];    //swaping values
                    zahlen[k+1]=temp;    //now storing temp value in array


                }    //end if block
            }  // end inner loop
        }
    }
    public  static  int indexErsteDoppelte(int[] z){
        int index=-1;
        for(int i =0;i<zahlen.length; i++){
            for(int j=i+1;j<zahlen.length-1;j++){
                if(zahlen[i] == zahlen[j]){
                    index = i;
                    return index;

                }
            }
        }
        return index;
    }
    public  static  void sucheDoppelte(){
        int indexDopp =0;
        int [] doubleZ = new int[1000];
        System.out.println("Suche nach doppelten");
        for(int i =0;i<zahlen.length; i++){
            for(int j=i+1;j<zahlen.length-1;j++){
                if(zahlen[i] == zahlen[j]){
                    doubleZ[indexDopp] = zahlen[j];
                    System.out.println(doubleZ[indexDopp]);
                    indexDopp++;
                    break;
                }
            }
        }
        int inx = 0;
        for(int i = 0; i<49;i++){

            for(int j =0;j <doubleZ.length;j++){
                if(doubleZ[j] == i){
                    doppelteZahlen[inx] = doubleZ[j];
                    inx++;
                    break;
                }
            }
        }
    }

    public  static  void initArray() {
        Random randomGenerator = new Random();
        for(int i = 0; i< zahlen.length;i++){
            int randomInt = randomGenerator.nextInt(48);
            randomInt++;
            zahlen[i] = randomInt;
        }
    }

    public  static  void ausgabeArray(int[] z){
        for(int i =0; i<z.length;i++){
            System.out.println("Index: " + i + "; Wert: " + z[i]);
        }
    }
    public  static  int maxWert(){
        int max = -1;
        for(int i =0; i < zahlen.length;i++){
            if(zahlen[i] > max){
                max = zahlen[i];
            }
        }
        return max;
    }

    public  static  int minWert(){
        int min = 100;
        for(int i =0; i < zahlen.length;i++){
            if(zahlen[i] < min){
                min = zahlen[i];
            }
        }
        return min;
    }

    public  static  int midWert(){
        int mid = 0;
        for(int i =0; i < zahlen.length;i++){

                mid += zahlen[i];

        }
        mid /= zahlen.length;
        return mid;
    }

}
