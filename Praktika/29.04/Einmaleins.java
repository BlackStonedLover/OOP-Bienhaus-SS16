/**
*Aufgabe 3.5
*
*/


public class Einmaleins {
    public static void main(String[] args) {
            System.out.println("Das kleine Ein mal Eins:");
            System.out.println();
           System.out.println("_*_|" + "_1__" + "|" + "__2__" + "|" + "__3__" + "|" + "__4__" + "|" + "__5__" + "|" + "__6__" + "|" + "__7__" + "|" + "__8__" + "|" + "__9__" + "|" + "_10_"  );
        for(int i = 1; i<11; i++){
            
            if(i ==1)
            System.out.println(" 1 | " + i*1 + "  |  " + i * 2 + "  |  " + i * 3 + "  |  " + i * 4 + "  |  " + i * 5 + "  |  " + i * 6 + "  |  " + i * 7 + "  |  " + i * 8 + "  |  " + i * 9 + "  | " + i * 10  );
            else if (i == 2)
            System.out.println(" 2 | " + i*1 + "  |  " + i * 2 + "  |  " + i * 3 + "  |  " + i * 4 + "  | " + i * 5 + "  | " + i * 6 + "  | " + i * 7 + "  | " + i * 8 + "  | " + i * 9 + "  | " + i * 10  );
            else if(i ==3)
            System.out.println(" 3 | " + i*1 + "  |  " + i * 2 + "  |  " + i * 3 + "  | " + i * 4 + "  | " + i * 5 + "  | " + i * 6 + "  | " + i * 7 + "  | " + i * 8 + "  | " + i * 9 + "  | " + i * 10  );
            else if(i == 4)
            System.out.println(" 4 | " + i*1 + "  |  " + i * 2 + "  | " + i * 3 + "  | " + i * 4 + "  | " + i * 5 + "  | " + i * 6 + "  | " + i * 7 + "  | " + i * 8 + "  | " + i * 9 + "  | " + i * 10  );
            else if(i !=10 || i < 4)
            System.out.println(" "+i+" | " + i*1 + "  | " + i * 2 + "  | " + i * 3 + "  | " + i * 4 + "  | " + i * 5 + "  | " + i * 6 + "  | " + i * 7 + "  | " + i * 8 + "  | " + i * 9 + "  | " + i * 10  );
            else
            System.out.println(" "+i+"| " + i*1 + " | " + i * 2 + "  | " + i * 3 + "  | " + i * 4 + "  | " + i * 5 + "  | " + i * 6 + "  | " + i * 7 + "  | " + i * 8 + "  | " + i * 9 + "  | " + i * 10  );

        }
    }
}

/*   Kurze  Variante ohne Tabellenlinien =>

    System.out.println("Das kleine Ein mal Eins:");

    for(int i = 1; i<=10; i=i+1){

      for(int j = 1; j<=10; j =j+1){

        System.out.print(i*j + "\t");
      }
      System.out.println();
    }
    
*/