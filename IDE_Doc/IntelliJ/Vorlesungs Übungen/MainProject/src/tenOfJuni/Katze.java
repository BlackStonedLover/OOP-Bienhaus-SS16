package tenOfJuni;

/**
 * Created by Konstantin on 10.06.2016.
 */
public class Katze {
    private String name;
    private String fellFarbe;


    Katze(String fellFarbe){
        this.fellFarbe = fellFarbe;
    }
    Katze(String name, String fellFarbe){
        this.name = name;
        this.fellFarbe = fellFarbe;
    }

    public String getName() {
        return name;
    }

    public String getFellFarbe() {
        return fellFarbe;
    }

    public void fuettern(int menge){
    if(menge <3){
        menge ++;
    }
        else{
        schnurr();
    }
    }
    private void fauch(){
        System.out.println("Fauch kratz");
    }

    private void schnurr(){
        System.out.println("schnurr schnurr schnurr");
    }
}
