/**
 * Created by Konstantin on 13.05.2016.
 */
public class Fakultaetsberechnung {
    // Fakultät iteraktiv
    public  static  int fakIter(int n)
    {

        int erg = 1; // lokale Var für das ergebnis
            for(int i = 1; i<=n; i++){
                erg = erg * i;
                System.out.println("i = " + i + " erg = " + erg);
            }

        return  erg;
    }

    public static  int fakRek(int n){



        System.out.println("in FakRek ist n =" + n);
        if(n==0){
            return 1;
        }

        return  n * fakRek(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fakIter(6));

        System.out.println(fakRek(6));

    }
}
