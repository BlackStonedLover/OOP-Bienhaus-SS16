package Uebungen.Blatt_5.Array;

import java.util.*;

/**
 * Created by Konstantin on 24.06.2016.
 */
public class reverseArray {
    private static char[] Name = new char[10];
    private static char[] reverseName = new char[10];
     static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Bitte geben sie ein Wort mit 10 zeichen ein: ");
        String Wort = sc.nextLine();
        if(!Wort.isEmpty()){
            char[] Name = Wort.toCharArray();
            reverseName =createReverse(Name);

                System.out.println(new String(Name));


                System.out.println(new String(reverseName));


        }


    }

    public static char[] createReverse(char[] getWord ){
        char[] tmp = new char[10];
        int tmpin= 9;

        for(int i =0;i< getWord.length;i++){
            System.out.println();
            tmp[tmpin] = getWord[i];
            //getWord[i] = tmp[tmpin];
            tmpin--;
        }

        return tmp;
    }

}
