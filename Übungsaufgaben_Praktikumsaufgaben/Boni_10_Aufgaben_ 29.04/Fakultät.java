import java.util.Scanner;

/**
 * Diese Klasse fragt nach einer Zahl und rechnet die Fakultät aus und gibt sie aus.
 * Aufgabe 7
 * @author Lukas Luboschik
 */
public class Fakultät {

	/**
	 * Der Einstiegspunkt, welcher nach einer Zahl fragt und die Fakultät dieser ausrechnet und ausgibt.
	 * @param args Kommandozeilenargumente
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int z = 0;
		
		System.out.println("Zahl eingeben!");
		
		try {
			z = sc.nextInt();
		} catch(Exception e)
		{
			System.out.println("Falsche Eingabe!");
			return;
		}
		
		int f = fact(z);
		
		System.out.println("n! : " + (f == -1 ? "undefiniert" : f));
	}

	/**
	 * Diese Methode rechnet die Fakultät einer Zahl aus.
	 * @param n Die Zahl, aus der die Fakultät ausgerechnet werden soll.
	 * @return Die Fakultät des Parameter n oder -1 wenn das Ergebnis undefiniert ist.
	 */
	public static int fact(int n)
	{
		if(n < 0)
		{
			return -1;
		}
		if(n == 0)
		{
			return 1;
		}
		int ret = 1;
		for(int i = 1; i <= n; i++)
		{
			ret = ret * i;
		}
		return ret;
	}
}
