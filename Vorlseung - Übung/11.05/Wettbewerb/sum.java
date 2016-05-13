import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben sie den ersten Wert ein: ");
        int a = sc.nextInt();
        System.out.println("Bitte geben sie den zweiten Wert ein: ");
        int b = sc.nextInt();
        int erg = sum(a,b);
        
        System.out.println("Der auszugebene Wert lautet: " + erg);
        
    }
    public static int sum (int a, int b){
        int erg = 0;
        if(b >= a){
            for(int i = a; i<b; i++)
            {
              erg += i;  
            }
            
        }
        else if(b < a){
            for(int i = b; i<a; i++)
            {
              erg += i;  
            }
           
        }
       // else return erg = -1;
        else if(a<0 || b <0 )
        erg = -1;
        
        return erg;
    }
}