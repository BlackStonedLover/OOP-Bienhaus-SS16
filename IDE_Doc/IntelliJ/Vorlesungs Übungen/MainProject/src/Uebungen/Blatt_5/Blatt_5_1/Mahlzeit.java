package Uebungen.Blatt_5.Blatt_5_1;

/**
 * Created by Konstantin on 17.06.2016.
 */
public class Mahlzeit {

    private String name;
    private String beschreibung;
    private float preis = 2.50f;
    private boolean vegetarisch;

    public Mahlzeit(String beschreibung, String name, float preis, boolean vegetarisch) {
        new Mahlzeit(name,beschreibung,vegetarisch);
        this.preis = preis;

    }

    public Mahlzeit(String name, String beschreibung, boolean vegetarisch) {
        this.name = name;
        this.beschreibung = beschreibung;
        this.vegetarisch = vegetarisch;
    }

    public boolean isVegetarisch() {
        return vegetarisch;
    }

    public float gibPreisStudent(){

        return preis;
    }
    public  float gibPreisMitarbeiter(){
        float tmp = preis +2f;
        return  tmp;
    }
    public  float gibPreisGast(){
        float tmp = preis + 2.5f;
        return tmp;
    }
}
