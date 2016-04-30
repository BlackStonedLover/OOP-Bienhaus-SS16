/*
*Aufgabe 3.6
*/
import java.util.Scanner;
class Binaerkodierung {
    public static void main(String[] args) {
        int Wert;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben sie die Zahl ein die umgewandelt werden soll: ");
        Wert = sc.nextInt();
        String Ausgabe;
        Ausgabe = convertToBin(Wert);
        System.out.println(Ausgabe);
    }
    
    
    public static String convertToBin(int zahl){
        String Bin = " ";
        char one = '1';
        char zero = '0';
        char space = ' ';
		for (int i = 31; i >= 0; --i) {
			if ((zahl & (1 << i)) != 0)
				Bin += one;
			else
				Bin += zero;
			if (i % 8 == 0)
				Bin += space;
		}
        return Bin;
    }
    
    
    
}