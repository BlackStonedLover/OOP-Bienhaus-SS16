/*
*Aufgabe 3.4
*/
public class ZinsZins {
    public static void main(String[] args) {
        float Guthaben = 10.00f;
        for(int i =0; i < 10;i++){
            Guthaben += (Guthaben/100) * 2.5f;
         }
         System.out.println("Guthaben nach 10 Jahren: " + Guthaben);
    }
}