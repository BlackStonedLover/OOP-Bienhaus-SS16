package twentyfourOfJuny;

/**
 * Created by Konstantin on 24.06.2016.
 */
public class Hund  extends Tier {

    public Hund(String name) {
        super(name);
    }

    @Override
    public void gibLaut() {
        System.out.println("Wau wau");

    }
    public void wedeln(){
        System.out.println("wedel wedel");
    }
}
