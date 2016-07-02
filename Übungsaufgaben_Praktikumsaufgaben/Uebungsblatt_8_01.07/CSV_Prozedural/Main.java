import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Diese Klasse enthält einen Einstiegspunkt, welcher die Datei ProduktlisteNetto.csv lädt und den fehlenden Bruttobetrag berechnet
 * @author Lukas Luboschik
 *
 */
public class Main {
	
	/**
	 * Der Einstiegspunkt, welcher die Datei ProduktlisteNetto.csv lädt und den fehlenden Bruttobetrag berechnet
	 * @param args Kommandozeilenargumente
	 */
	public static void main(String[] args) {
		//Netto File Objekt erzeugen
		File f_netto = new File("ProduktlisteNetto.csv");
		
		//Brutto File Objekt erzeugen
		File f_brutto = new File("ProduktlisteBrutto.csv");
		
		//Eingabe Stream von Datei erzeugen
		FileInputStream fi = null;
		try {
			fi = new FileInputStream(f_netto);
		} catch (FileNotFoundException e) {
			System.out.println("Fehler beim Öffnen der Datei!");
			return;
		}
		
		//Scanner von Eingabestream erzeugen
		Scanner sc = new Scanner(fi);
		
		//Ausgabe Stream auf Datei erzeugen
		FileOutputStream fo = null;
		try {
			fo = new FileOutputStream(f_brutto);
		} catch (FileNotFoundException e) {
			System.out.println("Fehler beim Öffnen der Datei!");
			return;
		}
		
		//PrintStream von Ausgabestream erzeugen
		PrintStream ps = new PrintStream(fo);
		
		boolean firstLine = true;
		
		//Alle Zeilen durchgehen
		while(sc.hasNextLine())
		{
			String line = sc.nextLine();
			
			//Erste Zeile ist die Kopfzeile 
			if(firstLine)
			{
				ps.println(line);
				firstLine = false;
				continue;
			}
			
			//Zeile nach ";" trennen
			String[] values = line.split(";");
			
			//Es werden 5 Werte erwartet
			if(values.length != 5)
			{
				continue;
			}
			
			float nettobetrag;
			int mehrwertsteuersatz;
			
			//Numerische Werte einlesen
			try {
				//Float.parseFloat erwartet einen "." statt einem ","
				nettobetrag = Float.parseFloat(values[1].replace(",", "."));
				
				mehrwertsteuersatz = Integer.parseInt(values[2]);
			} catch(NumberFormatException e) {
				continue;
			}
			
			float mehrwertsteuersatzRel = ((float)mehrwertsteuersatz)/100.0f;
			
			//Zeile ausgeben
			ps.println(values[0] + ";" + values[1] + ";" + values[2] + ";" + String.format("%.2f", round2(nettobetrag * (1.0f+mehrwertsteuersatzRel))) + ";" + values[4]);
		}
		
		//Ausgabestream schließen (Stream schreiben)
		try {
			fo.close();
		} catch (IOException e) {
			System.out.println("Fehler beim Schreiben der Datei!");
		}
		
		//Scanner schließen
		sc.close();
		
		//Eingabestream schließen
		try {
			fi.close();
		} catch (IOException e) {
		}
	}
	
	/**
	 * Diese Methode rundet eine Zahl auf 2 Stellen
	 * @param a Die zu rundende Zahl
	 * @return Die auf 2 Stellen gerundete Zahl
	 */
	private static float round2(float a) {
		return Math.round(a*100.0f)/100.0f;
	}

}
