 public class Person {
    //Atribute
    privat String name;
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
        Alter = aktJahr - gebJahr;
        return alter;
       // return(aktJahr-gebJahr);
    }
}