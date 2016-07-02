import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Diese Klasse hat einen Einstiegspunkt, welcher Autos instanziiert, serialisiert und wieder deserialisiert.
 * @author Lukas Luboschik
 *
 */
public class Main {

	/**
	 * Der Einstiegspunkt, welcher Autos instanziiert, serialisiert und wieder deserialisiert.
	 * @param args Kommandozeilenargumente
	 */
	public static void main(String[] args) {
		ArrayList<Auto> autos = new ArrayList<Auto>();
		autos.add(new Auto("BMW", 515, "Blau", 2));
		autos.add(new Auto("BMW", 345545, "Rot", 2));
		autos.add(new Auto("Audi", 7678, "Weiß", 4));
		autos.add(new Auto("Audi", 676, "Schwarz", 2));
		autos.add(new Auto("Mercedes Benz", 8457675, "Grau", 4));
		autos.add(new Auto("VW", 54565675, "Silber", 6));
		
		System.out.println("Zu serialisierende Autos: ");
		autosAusgeben(autos);
		
		File f = new File("autos.csv");
		
		//Autos serialisieren
		autosSerialisieren(autos, f);
		
		//Autos deserialisieren
		ArrayList<Auto> deserialisierteAutos = new ArrayList<Auto>();
		autosDeserialisieren(deserialisierteAutos, f);
		
		System.out.println();
		System.out.println("Deserialisierte Autos: ");
		autosAusgeben(deserialisierteAutos);
	}
	
	/**
	 * Diese Methode serialisiert alle Autos aus der Liste in eine Datei.
	 * @param autos Die zu serialisierenden Autos
	 * @param f Die Datei, in die die Autos serialisert werden sollen
	 * @return Ob die Autos erfolgreich in eine Datei serialisert wurden
	 */
	private static boolean autosSerialisieren(ArrayList<Auto> autos, File f) {
		//Ausgabe Stream auf Datei erzeugen
		FileOutputStream fo = null;
		try {
			fo = new FileOutputStream(f);
		} catch (FileNotFoundException e) {
			System.out.println("Fehler beim Öffnen der Datei!");
			return false;
		}
		
		PrintStream ps = new PrintStream(fo);
		//Autos serialisieren
		for(Auto auto : autos)
		{
			auto.writeToCsv(ps);
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
	 * Diese Methode deserialisert Autos aus einer Datei und speichert diese in einer Liste.
	 * @param deserialisierteAutos Die Liste, in der die Autos gespeichert werden
	 * @param f Die Datei aus der die Autos deserialisert werden sollen
	 * @return Ob die Autos erfolgreich aus der Datei deserialisert wurden
	 */
	private static boolean autosDeserialisieren(ArrayList<Auto> deserialisierteAutos, File f) {
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
		
		//Autos deserialiseren
		while(sc.hasNextLine())
		{
			Auto a = new Auto();
			a.readFromCsv(sc);
			deserialisierteAutos.add(a);
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
	
	/**
	 * Diese Methode gibt alle Autos aus.
	 * @param autos Die auszugebenden Autos
	 */
	private static void autosAusgeben(ArrayList<Auto> autos) {
		for(Auto auto : autos)
		{
			System.out.println(auto.toString());
		}
	}
}
