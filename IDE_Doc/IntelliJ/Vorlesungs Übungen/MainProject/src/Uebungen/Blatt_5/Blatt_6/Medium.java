package Uebungen.Blatt_5.Blatt_6;

/**
 * Created by Konstantin on 21.06.2016.
 */
public class Medium {
    private String Lehrveranstaltung;
    private String Dozent;

    public Medium(String dozent, String lehrveranstaltung) {
        Dozent = dozent;
        Lehrveranstaltung = lehrveranstaltung;
    }

    @Override
    public String toString() {
        return "Medium{" +
                "Dozent='" + Dozent + '\'' +
                ", Lehrveranstaltung='" + Lehrveranstaltung + '\'' +
                '}';
    }
}
