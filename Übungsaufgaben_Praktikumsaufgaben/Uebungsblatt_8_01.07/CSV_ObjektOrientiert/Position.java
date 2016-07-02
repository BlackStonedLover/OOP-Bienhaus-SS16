import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Diese Klasse stellt eine Position dar.
 * @author Lukas Luboschik
 *
 */
public class Position implements CsvSerialisierbar {
	private String produktName;
	private float nettoBetrag;
	private int mehrwertsteuerSatz;
	private float bruttoBetrag;
	private String waehrung;
	
	private boolean initialisiert;
	
	/**
	 * Dieser Konstruktor erzeugt eine ungültige Position, welches durch die Methode {@link #readFromCsv(InputStream)} initialisiert werden muss.
	 */
	public Position() {
		super();
		this.initialisiert = false;
	}

	/**
	 * Dieser Konstruktor erzeugt eine gültige Position und berechnet den Bruttobetrag
	 * @param produktName Der Produktname
	 * @param nettoBetrag Der Nettobetrag
	 * @param mehrwertsteuerSatz Der Mehrwertsteuersatz
	 * @param waehrung Die Währung
	 */
	public Position(String produktName, float nettoBetrag,
			int mehrwertsteuerSatz, String waehrung) {
		super();
		this.produktName = produktName;
		this.mehrwertsteuerSatz = mehrwertsteuerSatz;
		this.waehrung = waehrung;
		
		initBetragNetto(nettoBetrag);
		
		this.initialisiert = true;
	}
	
	/**
	 * Dieser Konstruktor erzeugt eine gültige Position und berechnet den Nettobetrag
	 * @param produktName Der Produktname
	 * @param mehrwertsteuerSatz Der Mehrwertsteuersatz
	 * @param bruttoBetrag Der Bruttobetrag
	 * @param waehrung Die Währung
	 */
	public Position(String produktName,
			int mehrwertsteuerSatz, float bruttoBetrag, String waehrung) {
		super();
		this.produktName = produktName;
		this.mehrwertsteuerSatz = mehrwertsteuerSatz;
		this.waehrung = waehrung;
		
		initBetragBrutto(bruttoBetrag);
		
		this.initialisiert = true;
	}

	/**
	 * Diese Methode berechnet den Bruttobetrag und initialisiert den Nettobetrag
	 * @param nettoBetrag Der Nettobetrag
	 */
	private void initBetragNetto(float nettoBetrag) {
		this.nettoBetrag = nettoBetrag;
		float mehrwertsteuersatzRel = ((float)mehrwertsteuerSatz)/100.0f;
		this.bruttoBetrag = nettoBetrag * (1.0f + mehrwertsteuersatzRel);
	}
	
	/**
	 * Diese Methode berechnet den Nettobetrag und initialisiert den Bruttobetrag
	 * @param bruttoBetrag Der Bruttobetrag
	 */
	private void initBetragBrutto(float bruttoBetrag) {
		this.bruttoBetrag = bruttoBetrag;
		float mehrwertsteuersatzRel = ((float)mehrwertsteuerSatz)/100.0f;
		this.nettoBetrag = bruttoBetrag * (1.0f - mehrwertsteuersatzRel);
	}

	/**
	 * Diese Methode gibt den Produktnamen zurück.
	 * @return
	 */
	public String getProduktName() {
		return produktName;
	}

	/**
	 * Diese Methode gibt den Nettobetrag zurück.
	 * @return
	 */
	public float getNettoBetrag() {
		return nettoBetrag;
	}

	/**
	 * Diese Methode gibt den Mehrwertsteuersatz zurück.
	 * @return Der Mehrwertsteuersatz
	 */
	public int getMehrwertsteuerSatz() {
		return mehrwertsteuerSatz;
	}

	/**
	 * Diese Methode gibt den Bruttobetrag zurück.
	 * @return Der Bruttobetrag
	 */
	public float getBruttoBetrag() {
		return bruttoBetrag;
	}

	/**
	 * Diese Methode gibt die Währung zurück.
	 * @return Die Währung
	 */
	public String getWaehrung() {
		return waehrung;
	}

	/**
	 * Diese Methode gibt zurück, ob diese Position gültig ist.
	 * @return Ob diese Position gültig ist.
	 */
	public boolean istGueltig() {
		return initialisiert;
	}

	/**
	 * Diese Methode liest eine Position aus einem Stream, welcher ein CSV Format bereitstellt.
	 */
	@Override
	public void readFromCsv(Scanner sc) {
		//Wenn diese Position bereits initalisiert wurde, wird der Scanner nicht verändert.
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
		
		//Es werden 5 Werte erwartet
		if(values.length != 5)
		{
			return;
		}
		
		Float nettobetrag = null;
		Float bruttobetrag = null;
		
		//Numerische Werte einlesen
		int mehrwertsteuersatz;
		
		try {
			mehrwertsteuersatz = Integer.parseInt(values[2]);
		} catch(NumberFormatException e) {
			return;
		}
		
		try {
			//Float.parseFloat erwartet einen "." statt einem ","
			nettobetrag = Float.parseFloat(values[1].replace(",", "."));
		} catch(NumberFormatException e) {
		}
		
		try {
			//Float.parseFloat erwartet einen "." statt einem ","
			bruttobetrag = Float.parseFloat(values[3].replace(",", "."));
		} catch(NumberFormatException e) {
		}
		
		if(nettobetrag == null && bruttobetrag == null)
		{
			return;
		}
		
		this.produktName = values[0];
		this.mehrwertsteuerSatz = mehrwertsteuersatz;
		this.waehrung = values[4];
		
		if(nettobetrag == null)
		{
			initBetragBrutto(bruttobetrag);
		}
		else
		{
			initBetragNetto(nettobetrag);
		}
		
		initialisiert = true;
	}
	
	/**
	 * Diese Methode schreibt eine Position in ein CSV Format und gibt diese auf einem Stream aus.
	 */
	@Override
	public void writeToCsv(PrintStream stream) {
		//Wenn diese Position noch nicht initalisiert wurde, kann dieses auch nicht serialisiert werden.
		if(!initialisiert)
		{
			return;
		}
		stream.println(produktName + ";" + String.format("%.2f", round2(nettoBetrag)) + ";" + Integer.toString(mehrwertsteuerSatz) + ";" + String.format("%.2f", round2(bruttoBetrag)) + ";" + waehrung);
	}
	
	/**
	 * Diese Methode rundet eine Zahl auf 2 Stellen
	 * @param a Die zu rundende Zahl
	 * @return Die auf 2 Stellen gerundete Zahl
	 */
	private static float round2(float a) {
		return Math.round(a*100.0f)/100.0f;
	}

	/**
	 * Diese Methode wandelt die Position in eine Zeichenkette
	 */
	@Override
	public String toString() {
		return "Position [produktName=" + produktName + ", nettoBetrag="
				+ nettoBetrag + ", mehrwertsteuerSatz=" + mehrwertsteuerSatz
				+ ", bruttoBetrag=" + bruttoBetrag + ", waehrung=" + waehrung
				+ ", gueltig=" + initialisiert + "]";
	}
}
