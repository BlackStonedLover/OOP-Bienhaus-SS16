import java.io.PrintStream;
import java.util.Scanner;

/**
 * Schnittstelle, welche Methoden definiert, worüber ein Objekt in ein CSV Format umgewandelt werden kann.
 * @author Lukas Luboschik
 *
 */
public interface CsvSerialisierbar {
	/**
	 * Diese Methode soll die Attribute eines Objekts aus einem Stream lesen, welcher ein CSV Format bereitstellt.
	 * @param scanner Der Scanner, der einen Stream verwendet, auf dem gelesen werden soll
	 */
	void readFromCsv(Scanner scanner);
	
	/**
	 * Diese Methode soll die Attribute aus einem Objekt in ein CSV Format wandeln und auf einem Stream ausgeben.
	 * @param stream Der Stream, auf dem ausgegeben werden soll
	 */
	void writeToCsv(PrintStream stream);
}
