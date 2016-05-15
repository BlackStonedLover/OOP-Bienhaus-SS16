import java.util.Scanner;

/**
 * Diese Klasse fragt nach zwei Zahlen und rechnet den größten gemeinsamen Teiler aus und gibt diesen aus.
 * Aufgabe 8
 * @author Lukas Luboschik
 */
public class GroessterGemeinsamerTeiler {

	/**
	 * Der Einstiegspunkt, welcher nach zwei Zahlen fragt und den größten gemeinsamen Teiler ausrechnet und ausgibt.
	 * @param args Kommandozeilenargumente
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int z1 = 0;
		int z2 = 0;
		
		System.out.println("Zahl1 eingeben!");
		
		try {
			z1 = sc.nextInt();
		} catch(Exception e)
		{
			System.out.println("Falsche Eingabe!");
			return;
		}
		
		System.out.println("Zahl2 eingeben!");
		
		try {
			z2 = sc.nextInt();
		} catch(Exception e)
		{
			System.out.println("Falsche Eingabe!");
			return;
		}
		
		System.out.println("ggt(Zahl1, Zahl2) : " + ggt(z1, z2));
	}

	/**
	 * Diese Methode rechnet den größten gemeinsamen Teiler rekursiv aus.
	 * @param a Zahl1
	 * @param b Zahl2
	 * @return Der größte gemeinsame Teiler von Zahl1 und Zahl2.
	 */
	public static int ggt(int a, int b)
	{
		if(a < b)
		{
			return ggt(a, b-a);
		}
		else if(a > b)
		{
			return ggt(a-b, b);
		}
		else
		{
			return a;
		}
	}
}
