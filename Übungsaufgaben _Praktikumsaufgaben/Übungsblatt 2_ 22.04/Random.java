/** Aufgabe 2.3
*@author: Konstantin
*@version: 0.1
*@date: 24.04.2016
*@description: Ein programm das zwischen 0 und 1 20 Zufällige Werte auswählt und in ein Array speichert. Von den ermittelten Werten
*              ermittelt er zugleich den höchsten Wert und gibt diesen zusätzlich am Ende des Programmes aus.              
*/
import java.lang.Math;
public class Random {
    
    public static void main(String[] args) {
      double[] randomWert = new double[20];
      double maxWert =0;
      System.out.println("Alle Zufallswerte: \n");
       for(int i =0; i<20;i++){
        randomWert[i] = Math.random();
        System.out.println(randomWert[i]);
       if(randomWert[i]> maxWert){
           //System.out.println("Der groeßere Wert lautet: "+ randomWert[i] + " > " + maxWert);
              maxWert = randomWert[i];
              
          } 
       }
       

      System.out.println("Der hoechste Wert ist: " + maxWert);
     }
}