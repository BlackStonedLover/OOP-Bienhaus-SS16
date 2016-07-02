import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Diese Klasse stellt ein Auto dar.
 * @author Lukas Luboschik
 *
 */
public class Auto implements CsvSerialisierbar {

	private String hersteller;
	private int fahrzeugnummer;
	private String farbe;
	private int anzahlSitze;
	
	private boolean initialisiert;
	
	/**
	 * Dieser Konstruktor erzeugt ein ungültiges Auto, welches durch die Methode {@link #readFromCsv(InputStream)} initialisiert werden muss.
	 */
	public Auto() {
		super();
		this.hersteller = null;
		this.fahrzeugnummer = 0;
		this.farbe = null;
		this.anzahlSitze = 0;
		this.initialisiert = false;
	}

	/**
	 * Dieser Konstruktor erzeugt ein gültiges Auto, welches nicht durch die Methode {@link #readFromCsv(InputStream)} verändert werden kann.
	 * @param hersteller Der Hersteller
	 * @param fahrzeugnummer Die Fahrzeugnummer
	 * @param farbe Die Farbe
	 * @param anzahlSitze Die Anzahl der Sitze
	 */
	public Auto(String hersteller, int fahrzeugnummer, String farbe,
			int anzahlSitze) {
		super();
		this.hersteller = hersteller;
		this.fahrzeugnummer = fahrzeugnummer;
		this.farbe = farbe;
		this.anzahlSitze = anzahlSitze;
		this.initialisiert = true;
	}
	
	/**
	 * Diese Methode gibt den Hersteller zurück.
	 * @return Der Hersteller
	 */
	public String getHersteller() {
		return hersteller;
	}

	/**
	 * Diese Methode gibt die Fahrzeugnummer zurück.
	 * @return Die Fahrzeugnummer
	 */
	public int getFahrzeugnummer() {
		return fahrzeugnummer;
	}

	/**
	 * Diese Methode gibt die Farbe zurück.
	 * @return Die Farbe
	 */
	public String getFarbe() {
		return farbe;
	}

	/**
	 * Diese Methode gibt die Anzahl der Sitze zurück.
	 * @return Die Anzahl der Sitze
	 */
	public int getAnzahlSitze() {
		return anzahlSitze;
	}

	/**
	 * Diese Methode gibt zurück, ob dieses Auto gültig ist.
	 * @return Ob dieses Auto gültig ist
	 */
	public boolean istGueltig()
	{
		return initialisiert;
	}

	/**
	 * Diese Methode liest die Attribute eines Auto aus einem Stream, welcher ein CSV Format bereitstellt.
	 */
	@Override
	public void readFromCsv(Scanner sc) {
		//Wenn dieses Auto bereits initalisiert wurde, wird der Scanner nicht verändert.
		if(initialisiert)
		{
			return;
		}
		
		//Aktuelle Zeile einlesen
		String line = null;
		if(sc.hasNextLine())
		{
			line = sc.nextLine();
		}
		
		if(line == null)
		{
			return;
		}
		
		//Zeile nach ";" trennen
		String[] values = line.split(";");
		
		//Es werden 4 Werte erwartet
		if(values.length != 4)
		{
			return;
		}
		
		int fahrzeugnummer;
		int anzahlSitze;
		
		//Numerische Werte einlesen
		try {
			fahrzeugnummer = Integer.parseInt(values[1]);
			anzahlSitze = Integer.parseInt(values[3]);
		} catch(NumberFormatException e) {
			return;
		}
		
		this.hersteller = values[0];
		this.fahrzeugnummer = fahrzeugnummer;
		this.farbe = values[2];
		this.anzahlSitze = anzahlSitze;
		
		initialisiert = true;
	}

	/**
	 * Diese Methode wandelt die Attribute aus einem Auto in ein CSV Format und gibt diese auf einem Stream aus.
	 */
	@Override
	public void writeToCsv(PrintStream stream) {
		//Wenn dieses Auto noch nicht initalisiert wurde, kann dieses auch nicht serialisiert werden.
		if(!initialisiert)
		{
			return;
		}
		
		stream.println(hersteller + ";" + Integer.toString(fahrzeugnummer) + ";" + farbe + ";" + Integer.toString(anzahlSitze));
	}

	/**
	 * Diese Methode wandelt das Auto in eine Zeichenkette
	 */
	@Override
	public String toString() {
		return "Auto [hersteller=" + hersteller + ", fahrzeugnummer="
				+ fahrzeugnummer + ", farbe=" + farbe + ", anzahlSitze="
				+ anzahlSitze + ", gueltig=" + initialisiert + "]";
	}
}
