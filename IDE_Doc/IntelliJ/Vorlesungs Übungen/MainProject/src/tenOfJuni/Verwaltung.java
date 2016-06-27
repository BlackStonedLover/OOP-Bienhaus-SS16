package tenOfJuni;

/**
 * Created by Konstantin on 10.06.2016.
 */
public class Verwaltung {
    public static void main(String[] args) {
    Katze miau = new Katze("miau", "Schwarz");
       // miau.getName();
        miau.fuettern(1);
        miau.fuettern(3);

    }

    public void Person(){
        Person anna = new Person("Meier","Anna",1999);
        System.out.println(anna.getVorname() + " ist " + anna.getAlter(2016) + " Jahre alt" );
        System.out.println(anna);
    }
}
