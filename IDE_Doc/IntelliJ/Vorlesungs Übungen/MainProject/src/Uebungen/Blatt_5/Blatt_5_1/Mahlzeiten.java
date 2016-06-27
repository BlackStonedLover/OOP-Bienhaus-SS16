package Uebungen.Blatt_5.Blatt_5_1;

/**
 * Created by Konstantin on 17.06.2016.
 */
public class Mahlzeiten {
    private Mahlzeit[][] mahlzeitenDerWoche;
    private int vegNum = 1;
    private int meaNum = 1;


public void addMeal(String Name, String Beschreibung,boolean vegetarisch){

    if(vegetarisch){
        mahlzeitenDerWoche[0][vegNum] = new Mahlzeit(Name,Beschreibung,vegetarisch);
        vegNum++;
    }
    else{
        mahlzeitenDerWoche[meaNum][0] = new Mahlzeit(Name,Beschreibung,vegetarisch);
        meaNum++;
    }
}
    public void showMeals(){
        for(int i =1; i<6;i++){
            mahlzeitenDerWoche[i][0].toString();
            mahlzeitenDerWoche[0][i].toString();
        }
    }












}
