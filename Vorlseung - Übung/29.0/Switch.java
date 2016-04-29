
public class Switch{
   public static void main (String [] args){
       int zahl = 4;
       
       switch (zahl){
           case 6:
           case 8:
           System.out.println("Knapp daneben");
           break;
           case 7:
           System.out.println("Treffer");
           break;
           default:
           System.out.println("Weit daneben");
           break;
       }
   } 
   
}