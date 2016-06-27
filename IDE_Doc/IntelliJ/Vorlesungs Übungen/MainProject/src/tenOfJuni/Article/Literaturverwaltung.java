package tenOfJuni.Article;

import java.util.ArrayList;

/**
 * Created by Konstantin on 10.06.2016.
 */
public class Literaturverwaltung {
    public static void main(String[] args) {
        Article javaForDummies = new Article("Müller, M.", "Java for Dummies", "Java Spekrum", 2016);

        javaForDummies.setMonth("Mai");
        Article cppForAll = new Article("Bienhaus D.", "C++ für Alle", "Art of Programming", 2016, "Juni");

        Article grillen = new Article("Hensler", "Grill den Hensler", "Grilljournal", 2015, "Juli");
        Article[] meineLiteratur = new Article[3];
        meineLiteratur[0] = javaForDummies;
        meineLiteratur[1] = cppForAll;
        meineLiteratur[2] = grillen;

        for(int i =0; i<meineLiteratur.length; i++){
            System.out.println(meineLiteratur[i]);
        }

        // Lösung mit ArrayList
        ArrayList<Article> dynLitVerawaltung = new ArrayList<Article>();
        dynLitVerawaltung.add(grillen);
        dynLitVerawaltung.add(javaForDummies);
        dynLitVerawaltung.add(cppForAll);
        dynLitVerawaltung.add(new Article("Kunz","hinz und Kunz", "Giessener Anzeige", 2016 , "Mai"));
        for( int i = 0; i< dynLitVerawaltung.size();i++){
            System.out.println("Artkl Nr: " + i + " = >" + dynLitVerawaltung.get(i));
        }
        for(Article a : dynLitVerawaltung){
            System.out.println(a);
        }
    }
}
