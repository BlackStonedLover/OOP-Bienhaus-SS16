import java.util.Scanner;
public class start
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        gamelogik g = new gamelogik();
        g.initGame();
        
        char Spieler = 'x';
        int reihe,spalte;
        while(true)
        {
            System.out.println("Spieler " + Spieler + " ist jetzt an der Reihe: ");
            System.out.println("Bitte Feld eingeben: ");
            spalte = sc.nextInt();
            reihe = sc.nextInt();
         
            while(g.checkIfIllegal(reihe, spalte))
            {
                System.out.println("Dieser Zug ist ungültig bitte neuen Zug eingeben: ");
                spalte = sc.nextInt();
                reihe = sc.nextInt();
            }
           g.SpielSteinplatzieren(Spieler, spalte, reihe);
           g.DisplayBoard();
          if(g.CheckForWinner())
		  {
			  System.out.println("Spieler " + Spieler + " hat gewonnen!");
			  break;
		  }
           if(g.CheckForDraw())
		   {
			   System.out.println("Das Spiel ist unentschieden! Kein Spielzug mehr möglich!");
			   break;
		   }
           Spieler = g.SpielerWechsel(Spieler);
        }
    }
}