import java.util.Scanner;

/**
 * Diese Klasse fragt nach einer Zahl, rechnet die Wurzel nach dem Heron-Verfahren(ein Spezialfall des Newton-Verfahren) aus und gibt diese aus.
 * Aufgabe 9
 * @author Lukas Luboschik
 */
public class Wurzelberechnung {

	/**
	 * Die Tiefe der rekursiven Wurzelfunktion.
	 */
	public static final int SQRT_DEPTH = 20;
	
	/**
	 * Der Einstiegspunkt, welcher nach einer Zahl fragt und die Wurzel ausrechnet und ausgibt.
	 * @param args Kommandozeilenargumente
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double z = 0;
		
		System.out.println("Zahl eingeben!");
		
		try {
			z = sc.nextDouble();
		} catch(Exception e)
		{
			System.out.println("Falsche Eingabe!");
			return;
		}
		
		System.out.println("sqrt(n) : " + csqrt(1, z, 0));
	}

	/**
	 * Diese Funktion rechnet die Wurzel rekursiv nach dem Heron-Verfahren (welches bei der Quadratwurzel ein Spezialfall des Newton-Verfahrens ist).
	 * @param xn Beim ersten Aufruf der Startwert(sollte ungleich 0 sein), welcher dem Ergebnis bei jedem Aufruf näher kommt.
	 * @param a Die Zahl, aus der die Wurzel gezogen werden soll.
	 * @param n Die aktuelle Tiefe(wird bei rekursivem Aufruf um 1 erhöht).
	 * @return Der approximierte Wert der Wurzel.
	 */
	public static double csqrt(double xn, double a, int n)
	{
		if(n == SQRT_DEPTH)
		{
			return xn;
		}
		
		double nx = xn - (((xn*xn)-a)/(2*xn));
		
		return csqrt(nx, a, n+1);
	}
}
