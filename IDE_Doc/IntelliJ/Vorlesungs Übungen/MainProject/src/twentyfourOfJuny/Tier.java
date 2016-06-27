package twentyfourOfJuny;

/**
 * Created by Konstantin on 24.06.2016.
 */
public abstract class Tier {
    private  String name;

    public Tier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void gibLaut();
}
