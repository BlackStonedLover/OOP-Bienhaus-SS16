import java.util.Scanner;
public class start
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Game g = new Game();
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
           g.CheckForWinner();
           g.CheckForDraw();
           g.SpielerWechsel(Spieler);
        }
    }
}