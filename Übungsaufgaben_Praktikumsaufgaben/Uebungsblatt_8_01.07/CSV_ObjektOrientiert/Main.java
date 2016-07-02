import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Diese Klasse enthält einen Einstiegspunkt, welcher die Datei ProduktlisteNetto.csv lädt, derserialisiert und wieder in die Datei ProduktlisteBrutto.csv serialisert
 * @author Lukas Luboschik
 *
 */
public class Main {
	
	/**
	 * Der Einstiegspunkt, welcher die Datei ProduktlisteNetto.csv lädt, derserialisiert und wieder in die Datei ProduktlisteBrutto.csv serialisert
	 * @param args Kommandozeilenargumente
	 */
	public static void main(String[] args) {
		//Netto File Objekt erzeugen
		File f_netto = new File("ProduktlisteNetto.csv");
		
		//Brutto File Objekt erzeugen
		File f_brutto = new File("ProduktlisteBrutto.csv");
		
		//Positionen deserialisieren
		ArrayList<Position> deserialisiertePositionen = new ArrayList<Position>();
		positionenDeserialisieren(deserialisiertePositionen, f_netto);
		
		//Positionen serialisieren
		positionenSerialisieren(deserialisiertePositionen, f_brutto);
	}

	/**
	 * Diese Methode serialisiert alle Positionen aus der Liste in eine Datei.
	 * @param positionen Die zu serialisierenden Positionen
	 * @param f Die Datei, in die die Positionen serialisert werden sollen
	 * @return Ob die Positionen erfolgreich in eine Datei serialisert wurden
	 */
	private static boolean positionenSerialisieren(ArrayList<Position> positionen, File f) {
		//Ausgabe Stream auf Datei erzeugen
		FileOutputStream fo = null;
		try {
			fo = new FileOutputStream(f);
		} catch (FileNotFoundException e) {
			System.out.println("Fehler beim Öffnen der Datei!");
			return false;
		}
		
		PrintStream ps = new PrintStream(fo);
		
		//Kopfzeile schreiben
		ps.println("Produktname; Nettobetrag;Mehrwertsteuersatz;Bruttobetrag;Waehrung");
		
		//Positionen serialisieren
		for(Position position : positionen)
		{
			position.writeToCsv(ps);
		}
		
		//Ausgabestream schließen (Stream schreiben)
		try {
			fo.close();
		} catch (IOException e) {
			System.out.println("Fehler beim Schreiben der Datei!");
		}
		
		return true;
	}
	
	/**
	 * Diese Methode deserialisert Positionen aus einer Datei und speichert diese in einer Liste.
	 * @param deserialisiertePositionen Die Liste, in der die Positionen gespeichert werden
	 * @param f Die Datei aus der die Positionen deserialisert werden sollen
	 * @return Ob die Positionen erfolgreich aus der Datei deserialisert wurden
	 */
	private static boolean positionenDeserialisieren(ArrayList<Position> deserialisiertePositionen, File f) {
		//Eingabe Stream von Datei erzeugen
		FileInputStream fi = null;
		try {
			fi = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			System.out.println("Fehler beim Öffnen der Datei!");
			return false;
		}
		
		//Scanner von Eingabestream erzeugen
		Scanner sc = new Scanner(fi);
		
		//Positionen deserialiseren
		while(sc.hasNextLine())
		{
			Position a = new Position();
			a.readFromCsv(sc);
			deserialisiertePositionen.add(a);
		}
		
		//Scanner schließen
		sc.close();
		
		//Eingabestream schließen
		try {
			fi.close();
		} catch (IOException e) {
		}
		
		return true;
	}
	
}
