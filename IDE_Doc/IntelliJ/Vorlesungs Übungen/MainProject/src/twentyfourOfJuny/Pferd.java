package twentyfourOfJuny;

/**
 * Created by Konstantin on 24.06.2016.
 */
public class Pferd extends Tier{
    public Pferd(String name) {
        super(name);
    }

    @Override
    public void gibLaut() {
        System.out.println("whier whier");
    }

    public  void galoppieren(){
        System.out.println("galoppie gallpoie");
    }
}
