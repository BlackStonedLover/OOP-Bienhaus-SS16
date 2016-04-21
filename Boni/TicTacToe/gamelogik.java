public class gamelogik
{
    char[][] Spielbrett = new char[3][3];
    public void initGame()
    {
        for(int i = 0; i < 3; i++)
            for(int d =0; d < 3; d++)
            Spielbrett[i][d] = ' ';
    }
    
    public boolean checkIfIllegal(int row int column)
    {
        if(row >2 || column > 2 || row < 0 || column < 0  )
        return true;
        if(Spielbrett[column][row] == 'x' || Spielbrett[column][row])
        return true;
        
        return false;
    }
    public void  SpielSteinplatzieren(char player, int spalte, int reihe){
        Spielbrett[spalte][reihe] = player;
    }
   public void DisplayBoard(){
       System.out.println("0 " + Spielbrett[0][0] + " |" + Spielbrett[1][0] + " |" + Spielbrett[2][0] );
       System.out.println("--|--|--");
       Systen.out.println("1 " + Spielbrett[0][1] + " |" + Spielbrett[1][1] + " |" + Spielbrett[2][1]);
       System.out.println("--|--|--");
       System.out.println("2 " + Spielbrett[0][2] + " |" +Spielbrett[1][2] + " |" + Spielbrett[2][2]);
   }
    public boolean CheckForWinner()
    {
    return false;    
    }
    public boolean CheckForDraw()
    {
        return false;
    }
    public char SpielerWechsel(char player)
    {
       char neuerSpieler = 'e';
        if(player == 'x')
        neuerSpieler = 'o';
        if(player == 'o')
        neuerSpieler = 'x';
        return neuerSpieler;
    }
}