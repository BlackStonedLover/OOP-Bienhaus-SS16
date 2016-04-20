/*
*Ein kleines Programm um ein Strichmännchen zu bewegen
*/
public class galgen{
    
    public static void main(String[] args) 
    {
                   
        while(true){
            
                 for (int i=0; i<25; i++)
                System.out.println();
                
                System.out.println(" o ");
                System.out.println("/|\\ ");
                System.out.println("/ \\ ");   
            try 
            {
                Thread.sleep(180);
            } 
            catch(InterruptedException e)
            {
                // this part is executed when an exception (in this example InterruptedException) occurs
            }
                for (int i=0; i<25; i++)
                System.out.println();
                
                System.out.println(" \\ o / ");
                System.out.println("   | ");
                System.out.println("  / \\ ");   
                       try 
            {
                Thread.sleep(180);
            } 
            catch(InterruptedException e)
            {
                // this part is executed when an exception (in this example InterruptedException) occurs
            }
        }
    }
}