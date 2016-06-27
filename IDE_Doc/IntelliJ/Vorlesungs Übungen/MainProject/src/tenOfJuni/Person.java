package tenOfJuni;

/**
 * Created by Konstantin on 10.06.2016.
 */
public  class Person {
    //Atribute
    private String name;
    private String vorname;
    private int gebJahr;

    //Konstruktor(en)

    public Person(String name, String vorname, int gebJahr){
        this.name = name;
        this.vorname = vorname;
        this.gebJahr = gebJahr;
    }


    public String getName(){
        return name;
    }
    public String getVorname(){
        return vorname;
    }
    public int getAlter(int aktJahr){
        int alter;
        alter = aktJahr - gebJahr;
        return alter;
        // return(aktJahr-gebJahr);
    }
    @Override
    public  String toString(){
    String res;
        res =   "Name: " + name + "\n" +
                "Vorname: " + vorname + "\n"+
                "Geburtsjahr: " + gebJahr + "\n";
        return res;
    }
}