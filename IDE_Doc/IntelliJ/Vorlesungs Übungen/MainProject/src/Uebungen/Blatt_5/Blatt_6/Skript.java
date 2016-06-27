package Uebungen.Blatt_5.Blatt_6;

/**
 * Created by Konstantin on 21.06.2016.
 */
public class Skript extends Medium {
    private float Version;

    public Skript(String dozent, String lehrveranstaltung, float version) {
        super(dozent, lehrveranstaltung);
        Version = version;
    }

    @Override
    public String toString() {
        return "Skript{" +
                "Version=" + Version +
                '}';
    }
}
