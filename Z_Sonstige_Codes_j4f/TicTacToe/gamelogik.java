public class gamelogik
{
    char[][] Spielbrett = new char[3][3];
    public void initGame()
    {
        for(int i = 0; i < 3; i++)
            for(int d =0; d < 3; d++)
            Spielbrett[i][d] = ' ';
    }
    
    public boolean checkIfIllegal(int row, int column)
    {
        if(row >2 || column > 2 || row < 0 || column < 0)
		{
        return true;
		}
        else if(Spielbrett[column][row] == 'x' || Spielbrett[column][row] == 'o')
		{
			return true;
		}
        
        return false;
    }
    public void  SpielSteinplatzieren(char player, int spalte, int reihe){
        Spielbrett[spalte][reihe] = player;
    }
   public void DisplayBoard(){
       System.out.println("0 " + Spielbrett[0][0] + "| " + Spielbrett[1][0] + "|" + Spielbrett[2][0] );
       System.out.println(" --|--|--");
       System.out.println("1 " + Spielbrett[0][1] + "| " + Spielbrett[1][1] + "|" + Spielbrett[2][1]);
       System.out.println(" --|--|--");
       System.out.println("2 " + Spielbrett[0][2] + "| " +Spielbrett[1][2] + "|" + Spielbrett[2][2]);
	   System.out.println(" 0  1  2");
   }
    public boolean CheckForWinner()
    {
        if(Spielbrett[0][0] == Spielbrett[1][0] && Spielbrett[1][0] == Spielbrett[2][0] && (Spielbrett[0][0] == 'x' || Spielbrett[0][0] == 'o'))
       {System.out.println("1"); return true;}
        else if(Spielbrett[0][1] == Spielbrett[1][1] && Spielbrett[1][1] == Spielbrett[2][1] &&(Spielbrett[0][1] == 'x' || Spielbrett[0][1] == 'o'))
        {System.out.println("2"); return true;}
        else if(Spielbrett[0][2] == Spielbrett[1][2] && Spielbrett[1][2] == Spielbrett[2][2] && (Spielbrett[0][2] == 'x' || Spielbrett[0][2] == 'o' ))   
        {System.out.println("3"); return true;}
        else if(Spielbrett[0][0] == Spielbrett[0][1] && Spielbrett[0][1] == Spielbrett[0][2] && (Spielbrett[0][0] == 'x' || Spielbrett[0][0] == 'o' ))   
        {System.out.println("3"); return true;}
        else if(Spielbrett[1][0] == Spielbrett[1][1] && Spielbrett[1][1] == Spielbrett[1][2] && (Spielbrett[1][0] == 'x' || Spielbrett[1][0] == 'o' ))   
        {System.out.println("3"); return true;}
        else if(Spielbrett[2][0] == Spielbrett[2][1] && Spielbrett[2][1] == Spielbrett[2][2] && (Spielbrett[2][0] == 'x' || Spielbrett[2][0] == 'o' ))   
        {System.out.println("3"); return true;}
        else if(Spielbrett[0][0] == Spielbrett[1][1] && Spielbrett[1][1] == Spielbrett[2][2] && (Spielbrett[0][0] == 'x' || Spielbrett[0][0] == 'o' ))   
        {System.out.println("3"); return true;}
        else if(Spielbrett[2][0] == Spielbrett[1][1] && Spielbrett[1][1] == Spielbrett[0][2] && (Spielbrett[2][0] == 'x' || Spielbrett[2][0] == 'o' ))   
        {System.out.println("3"); return true;}
    return false; 
    }
    public boolean CheckForDraw()
    {
     	for(int i =0; i <3;i++)
		for(int p = 0; p <3;p++)
			if(Spielbrett[i][p] == ' ')
				return false;
			
	
				return true;
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
    public void ClearField()
    {
           for (int i=0; i<25; i++)
             System.out.println();
    }
}