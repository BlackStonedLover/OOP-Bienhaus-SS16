package Blatt_7;

/**
 * Created by Dijivu on 27.06.2016.
 */
public abstract class Auto {
    private String kennzeichen;
    private int kilometerstand;
    private int sitzplätze;

    public Auto(int sitzplätze, String kennzeichen) {
        this.sitzplätze = sitzplätze;
        this.kennzeichen = kennzeichen;
        this.kilometerstand = 0;
    }

    public Auto(int sitzplätze) {
        this.sitzplätze = sitzplätze;
        this.kilometerstand =0;
        this.kennzeichen = "GI TH 1";
    }

    public Auto(String kennzeichen) {
        this.kennzeichen = kennzeichen;
        this.kilometerstand =0;
        this.sitzplätze = 5;
    }
}
