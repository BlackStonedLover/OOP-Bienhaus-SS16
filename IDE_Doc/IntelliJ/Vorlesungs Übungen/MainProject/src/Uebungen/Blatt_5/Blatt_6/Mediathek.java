package Uebungen.Blatt_5.Blatt_6;

/**
 * Created by Konstantin on 21.06.2016.
 */
public class Mediathek {
    private int maxAnz;

    private Skript[] scripts = new Skript[maxAnz];
    private Foliensatz[] folien = new Foliensatz[maxAnz];
    private Mitschrift[] mitschriften = new Mitschrift[maxAnz];

    public Mediathek(int maxAnz) {
        this.maxAnz = maxAnz;
    }
private int ScC =0;
    public void addSkript(Skript sc){
System.out.println("Skripts"+ ScC);
            scripts[ScC] = sc;
ScC++;
    }
private int foC;
    public   void addFolie(Foliensatz fo){
        System.out.println("Folie"+ foC);
                folien[foC] = fo;
foC++;
    }
private  int msC = 0;
    public void  addMitschrift(Mitschrift ms){
        System.out.println("Mitschriften"+ msC);
                mitschriften[msC] = ms;
msC++;
    }
public  void ausgabe(){
    for(int i =0; i<maxAnz;i++){
        scripts[i].toString();
        mitschriften[i].toString();
        folien[i].toString();
    }
}

}
