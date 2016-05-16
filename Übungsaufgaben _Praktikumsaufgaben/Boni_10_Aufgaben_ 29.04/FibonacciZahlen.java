import java.util.Scanner;

/**
 * Diese Klasse fragt nach einer Zahl, gibt die Fibonacci Zahlen aus, gibt den Quotient aus Fib(n-1)/Fib(n) aus und gibt die Differenz zum Kehrwert der goldenen Zahl aus.
 * Aufgabe 10
 * @author Lukas Luboschik
 */
public class FibonacciZahlen {

	/**
	 * Der Einsteigspunkt, welcher nach einer Zahl fragt, die Fibonacci Zahlen ausgibt, den Quotient aus Fib(n-1)/Fib(n) ausgibt und die Differenz zum Kehrwert der goldenen Zahl ausgibt.
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
		
		System.out.print("Fibonacci Zahlen bis zum Index " + z + " : ");
		for(int i = 0; i <= z; i++)
		{
			if(i != 0)
			{
				System.out.print(", ");
			}
			System.out.print(fib(i));
		}
		System.out.println();
		
		double fr = (((double)fib(z-1)/(double)fib(z)));
		
		System.out.println("fib(n-1)/fib(n) : " + fr);
		
		double igs = 1.0/((Math.sqrt(5)+1.0)/2.0);
		
		System.out.println("Kehrwert der goldenen Zahl: " + igs);
		
		System.out.println("Differenz von fib(n-1)/fib(n) zum Kehrwert der goldenen Zahl: " + (fr-igs));
	}

	/**
	 * Funktion zum errechnen der Fibonacci Zahl an dem Index n.
	 * @param n Der Index der zu errechnenden Fibonacci Zahl.
	 * @return Die Fibonacci Zahl an Index n.
	 */
	public static int fib(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		else if(n == 1)
		{
			return 1;
		}
		
		return fib(n-2)+fib(n-1);
	}
}
