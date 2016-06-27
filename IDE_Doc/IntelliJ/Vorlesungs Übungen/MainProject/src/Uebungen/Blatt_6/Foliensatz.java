package Uebungen.Blatt_5.Blatt_6;

/**
 * Created by Konstantin on 21.06.2016.
 */
public class Foliensatz extends Medium {
    private String Format;

    public Foliensatz(String dozent, String lehrveranstaltung, String format) {
        super(dozent, lehrveranstaltung);
        Format = format;
    }

    @Override
    public String toString() {
        return "Foliensatz{" +
                "Format='" + Format + '\'' +
                '}';
    }
}
