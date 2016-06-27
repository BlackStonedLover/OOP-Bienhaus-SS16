package twentyfourOfJuny;

import java.util.ArrayList;

/**
 * Created by Konstantin on 24.06.2016.
 */
public class Zoo {
    public static void main(String[] args) {
        Katze minzi = new Katze("Minzi");
        Hund Bello = new Hund("Bello");
        Pferd kleinerOnkel = new Pferd ("kleiner Onkel");

        ArrayList<Tier> meineTiere = new ArrayList<Tier>();
        meineTiere.add(minzi);
        meineTiere.add(Bello);
        meineTiere.add(kleinerOnkel);
        
        //Achtung: jetzt kommt Polymorphie!
        for(int i=0;i<meineTiere.size();i++){
            System.out.print(meineTiere.get(i).getName() + " macht ");
            meineTiere.get(i).gibLaut();
        }
    }
}
