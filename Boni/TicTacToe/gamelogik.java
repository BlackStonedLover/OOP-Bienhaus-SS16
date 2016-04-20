public class gamelogik
{
    char[][] Spielbrett = new char[3][3];
    public void initGame()
    {
        for(int i = 0; i < 3; i++)
            for(int d =0; d < 3; d++)
            Spielbrett[i][d] = ' ';
    }
}