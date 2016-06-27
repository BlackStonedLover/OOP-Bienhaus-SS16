/**
 * Created by Dijivu on 08.06.2016.
 */
public class History {
    String History = "";

    void save(String input){
        History += input +"\n";
    }

    String load( ){
        return History;
    }

}
