package twentyfourOfJuny;

/**
 * Created by Konstantin on 24.06.2016.
 */
public class Katze extends Tier {
    public Katze(String name) {
        super(name);
    }

    @Override
    public void gibLaut() {
        System.out.println("Meow meow");
    }
    public  void kratzen(){
        System.out.println("kratz kratz");
    }
}
