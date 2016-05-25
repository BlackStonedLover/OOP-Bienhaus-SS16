import java.util.Random;

/**
 * Diese Klasse erzeugt Pseudo-Zufallszahlen, gibt diese aus, rechnet Minimum, Maximum und Mittel aus und gibt dieses aus und sucht nach doppelten und gibt diese aus und berechnet und gibt den Index der ersten doppelten Zahl aus.
 * Übung 4, Aufgabe 1
 * @author Lukas Luboschik
 */
public class Lottozahlen {
	/**
	 * Array, welches die Pseudo-Zufallszahlen enthält.
	 */
	static int[] zahlen = new int[100];
	/**
	 * Array, welches die Anzahl der Zahl Index+1 in "zahlen" enthält.
	 */
	static int[] doppelteZahlen = new int[49];
	/* Bei 1 - 49 existieren 49 mögliche Werte
	 * Größe war in Aufgabenstellung 50 -> geändert auf 49
	 */
	
	/**
	 * Instanz der Random Klasse, womit Pseudo-Zufallszahlen erzeugt werden können.
	 */
	static Random random = new Random();

	/**
	 * Der Einstiegspunkt, welcher Pseudo-Zufallszahlen erzeugt, diese ausgibt, Minimum, Maximum und Mittel ausrechnet und ausgibt und nach doppelten sucht und diese ausgibt und den Index der ersten doppelten Zahl ausgibt.
	 * @param args Kommandozeilenargumente
	 */
	public static void main(String[] args) {
		// initialisiere mit Zufallszahlen zwischen 1 und 49
		initArray();
		// Ausgabe eines Arrays: Index und Wert
		ausgabeArray(zahlen);
		// Ausgabe von Maximal-, Minimal- und Durchschnitwert
		System.out.println("Maximalwert: " + maxWert());
		System.out.println("Minimalwert: " + minWert());
		System.out.println("Mittelwert: " + midWert());
		// Suche nach doppelten Zahlen
		sucheDoppelte();
		// Ausgabe wie oft die Zahlen zwischen 1 und 49 bei den 100
		// Zufallszahlen vorkommt
		System.out.println("Auswertung");
		ausgabeArray(doppelteZahlen);
		// Suche nach dem erstmaligen Vorkommen einer doppelten Zahl
		// Ausgabe der Position
		System.out.println("Erste doppelte Zahl bei: " + indexErsteDoppelte(zahlen));
	}
	
	/**
	 * Diese Funktion generiert Pseudo-Zufallszahlen zwischen 1(inklusive) und 49(inklusive) und speichert diese im Array "zahlen".
	 * Außerdem initialisiert sie "doppelteZahlen" mit 0.
	 */
	private static void initArray() {
		for(int i = 0; i < zahlen.length; i++) {
			zahlen[i] = random.nextInt(49)+1;
		}
		
		for(int i = 0; i < doppelteZahlen.length; i++) {
			doppelteZahlen[i] = 0;
		}
	}
	
	/**
	 * Diese Funktion gibt ein Array aus (Index, Wert).
	 * @param array Das auszugebende Array.
	 */
	private static void ausgabeArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println("Index: " + i + " Wert: " + array[i]);
		}
	}
	
	/**
	 * Diese Funktion rechnet den Maximalwert von "zahlen" aus und gibt diesen zurück.
	 * @return Der Maximalwert von "zahlen".
	 */
	private static int maxWert() {
		int ret = Integer.MIN_VALUE; //Auf den kleinstmöglichen Wert initialisieren
		for(int wert : zahlen) {
			if(wert > ret) {
				ret = wert;
			}
		}
		return ret;
	}
	
	/**
	 * Diese Funktion rechnet den Minimalwert von "zahlen" aus und gibt diesen zurück.
	 * @return Der Minimalwert von "zahlen".
	 */
	private static int minWert() {
		int ret = Integer.MAX_VALUE; //Auf den größtmöglichen Wert initialisieren
		for(int wert : zahlen) {
			if(wert < ret) {
				ret = wert;
			}
		}
		return ret;
	}
	
	/**
	 * Diese Funktion rechnet den Mittelwert von "zahlen" aus und gibt diesen zurück.
	 * @return Der Mittelwert von "zahlen".
	 */
	private static float midWert() {
		int sum = 0;
		for(int wert : zahlen) {
			sum += wert;
		}
		return ((float)sum)/((float)zahlen.length);
	}
	
	/**
	 * Diese Funktion prüft, wie oft die Zahlen 1-49 in "zahlen" enthalten sind und speichert dies in "doppelteZahlen".
	 */
	private static void sucheDoppelte() {
		for(int wert : zahlen) {
			doppelteZahlen[wert-1]++;
		}
	}
	
	/**
	 * Diese Funktion sucht den Index der ersten Zahl, welche doppelt in "zahlen" vorkommt.
	 * @param zahlen Das zu durchsuchende Array.
	 * @return Den Index der ersten doppelten Zahl oder -1 falls keine Zahl doppelt vorkam.
	 */
	private static int indexErsteDoppelte(int[] zahlen) {
		int[] tmpDoppelteZahlen = new int[49];
		for(int i = 0; i < tmpDoppelteZahlen.length; i++) {
			tmpDoppelteZahlen[i] = 0;
		}
		
		int ret = -1;
		for(int i = 0; i < zahlen.length; i++) {
			if(tmpDoppelteZahlen[zahlen[i]-1] > 0) {
				ret = i;
				break;
			}
			tmpDoppelteZahlen[zahlen[i]-1]++;
		}
		return ret;
	}
}
