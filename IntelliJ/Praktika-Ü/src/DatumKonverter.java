import java.util.Scanner;

/**
 * Ein Programm das das Datum konventiert nach dem Schmea:
 * Eingabe 15.05.2016 → Ausgabe 15. Mai 2016
 * 
 * @author Konstantin
 * 15.05.2016
 */

public class DatumKonverter {
    /**
     * Einstiegspunkt
     * @param args Startparamter
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben sie ein Datum in ein(DD.MM.JJJJ): ");
        
        String input = sc.nextLine();
        int[] dmy = textDatumZuZahl(input);
        if(dmy == null)
        {
        	System.out.println("Ungültige Angabe.");
        	return;
        }
        
        // Variablen
        int day = dmy[0];
        int month = dmy[1];
        int year = dmy[2];
        
        //Prüfung ob der Tag und Monat eine gültige Angabe sind
        if(day > 0 && day <= berechneAnzahlTage(month, year) && month > 0 && month <= 12) {
        	
        	System.out.println("Das Datum das du eingegeben hast lautet: ");
            System.out.println(lPadZ2(day) + "."+ lPadZ2(month) +"." + year);
            
            /* Abhänig von dem eingegebenen Monat wird der entsprechende Monat
             * in einem String gespeichert damit dieser ausgegeben werden kann.
             */
            String monthS = monatZuText(month);
            
        	//Ausgabe
            System.out.println("Konvertiert lautet dieses: ");
            System.out.println(lPadZ2(day) + ". " + monthS + " " + year);
        }
        else{
        	//Falls Tag oder Monat auserhalb der Reichweite liegt
        	System.out.println("Ungültige Angabe.");
        }

    }
    
    /**
     * Diese Methode konvertiert eine Zahl (Tag, Monat) in eine Zeichenkette mit evtl. führenden Nullen(max 2).
     * @param n Die Zahl, welche umgewandelt werden soll.
     * @return Eine Zeichenkette mit evtl. führenden Nullen.
     */
    public static String lPadZ2(int n)
    {
    	String ret = Integer.toString(n);
    	while(ret.length() < 2)
    	{
    		ret = "0" + ret;
    	}
    	return ret;
    }
    
    /**
     * Konvertiert eine Zeichenkette im Format TT.MM.JJJJ in ein Array von Ganzzahlen
     * @param date Eine Zeichenkette im Format TT.MM.JJJJ.
     * @return Ein Array von Ganzzahlen im Format {T, M, J} oder null im Fehlerfall.
     */
    public static int[] textDatumZuZahl(String date)
    {
    	//Nach . trennen
        String[] inDate = date.split("\\.");
        //Überprüfen ob drei mit Punkt getrennte Segmente übrig geblieben sind
        if(inDate.length != 3)
        {
        	return null;
        }
        //Einzelne Segmente prüfen: Tag 2 Stellen, Monat 2 Stellen
        if(inDate[0].length() > 2 || inDate[1].length() > 2)
        {
        	return null;
        }
        
        int day = -1;
        int month = -1;
        int year = -1;
        
        //Einzelne Textsegmente in Ganzzahlen wandeln
        
        try {
        	day = Integer.parseInt(inDate[0]);
        } catch(NumberFormatException e) {
        }
        
        try {
        	month = Integer.parseInt(inDate[1]);
        } catch(NumberFormatException e) {
        }
        
        try {
        	year = Integer.parseInt(inDate[2]);
        } catch(NumberFormatException e) {
        }
        
        //Prüfen ob das Umwandeln erfolgreich war
        if(day == -1 || month == -1 || year == -1)
        {
        	return null;
        }
        
        return new int[]{day, month, year};
    }
    
    /**
     * Diese Methode konvertiert die Zahl eines Monats zu einem Text.
     * @param monat Der Monat als Zahl.
     * @return Der Name des Monat.
     */
    public static String monatZuText(int monat) {
    	String monthS = null;
    	switch (monat) {
	        case 1:
	            monthS = "Januar";
	            break;
	        case 2:
	            monthS = "Februar";
	            break;
	        case 3:
	            monthS = "März";
	            break;
	        case 4:
	            monthS = "April";
	            break;
	        case 5:
	            monthS = "Mai";
	            break;
	        case 6:
	            monthS = "Juni";
	            break;
	        case 7:
	            monthS = "Juli";
	            break;
	        case 8:
	            monthS = "August";
	            break;
	        case 9:
	            monthS = "September";
	            break;
	        case 10:
	            monthS = "Oktober";
	            break;
	        case 11:
	            monthS = "November";
	            break;
	        case 12:
	            monthS = "Dezember";
	            break;
	        default:
	        	monthS = null;
    	}
    	return monthS;
    }
    
    /**
     * Diese Methode berechnet die Anzahl der Tage anhand von einem Monat.
     * @param monat Der Monat.
     * @param jahr Das Jahr, welches verwendet wird um die Anzahl der Tage im Februar herauszufinden.
     * @return Die Anzahl der Tage in dem gegebenen Monat.
     */
    public static int berechneAnzahlTage(int monat, int jahr)
    {
    	switch(monat)
    	{
    	case 2:
    		return istSchaltjahr(jahr) ? 29 : 28;
    	case 1:
    	case 3:
    	case 5:
    	case 7:
    	case 8:
    	case 10:
    	case 12:
    		return 31;
    	case 4:
    	case 6:
    	case 9:
    	case 11:
    		return 30;
		default:
			return -1;
    	}
    }
    
    /**
     * Diese Methode berechnet ob ein Jahr ein Schaltjahr ist.
     * @param jahr Das Jahr.
     * @return Ob das angegebene Jahr ein Schaltjahr ist.
     */
    public static boolean istSchaltjahr(int jahr)
    {
    	if(jahr % 4 == 0)
    	{
    		if(jahr % 100 == 0)
    		{
    			if(jahr % 400 == 0)
    			{
    				return true;
    			}
    			else
    			{
    				return false;
    			}
    		}
    		else
    		{
    			return true;
    		}
    	}
    	else
    	{
    		return false;
    	}
    }
}
