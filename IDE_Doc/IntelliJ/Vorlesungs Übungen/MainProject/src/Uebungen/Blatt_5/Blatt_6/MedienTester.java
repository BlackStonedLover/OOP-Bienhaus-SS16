package Uebungen.Blatt_5.Blatt_6;

import sun.font.Script;

/**
 * Created by Konstantin on 21.06.2016.
 */
public class MedienTester {
    public static void main(String[] args) {
        Skript sOne = new Skript("Bienhaus","OOP",1.5f);
        Skript sTwo = new Skript("Just","DM",1.2f);
        Foliensatz fOne = new Foliensatz("Bienhaus", "OOP","PDF");
        Foliensatz fTwo = new Foliensatz("Just", "DM", "PDF");
        Mitschrift mOne = new Mitschrift("Bienhaus", "OOP", "Konstantin");
        Mitschrift mTwo = new Mitschrift("Just","DM","Konstantin");

        Mediathek mt = new Mediathek(2);
        mt.addSkript(sOne);
        mt.addSkript(sTwo);
        mt.addFolie(fOne);
        mt.addFolie(fTwo);
        mt.addMitschrift(mOne);
        mt.addMitschrift(mTwo);
        mt.ausgabe();
    }
}
