package Uebungen.Blatt_5.Blatt_6;

/**
 * Created by Konstantin on 21.06.2016.
 */
public class Mitschrift extends Medium {
    private String Autor;

    public Mitschrift(String dozent, String lehrveranstaltung, String autor) {
        super(dozent, lehrveranstaltung);
        Autor = autor;
    }

    @Override
    public String toString() {
        return "Mitschrift{" +
                "Autor='" + Autor + '\'' +
                '}';
    }
}
