public class Teilbarkeit {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z;
        z = x%y;
        if((z == 0)){
            System.out.println("Es ist kein Rest vorhanden");
         }
         else{
             System.out.println("Es ist ein Rest vorhanden: " + z);
         }
    }
    
}