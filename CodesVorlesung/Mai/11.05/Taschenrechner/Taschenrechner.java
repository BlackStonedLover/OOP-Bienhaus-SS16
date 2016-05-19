import java.util.Scanner;
public class Taschenrechner {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run= true;
        while(run){
            System.out.println("Bitte gebe zwei Zahlen ein: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = add(a,b);
            int sub = remove(a,b);
            int mal = multi(a,b);
            double get = div(a,b);
            System.out.println(a + " + " + b + " = " + sum);
            System.out.println(a + " - " + b + " = " + sub);
            System.out.println(a + " : " + b + " = " + get);
            System.out.println(a + " * " + b + " = " + mal);
            System.out.println("Nochmal ausführen? ");
            String eingabe = sc.nextLine();
            break;
            if(eingabe != "ja" || eingabe != "true" || eingabe != "Ja" || eingabe != "yes"  ){
                System.out.println("Ende des Programmes");
              
            } 
            else 
             run = false;
        }
    }
  
    public static int add(int x, int y){
        int erg;
        erg= x +y;
        return erg;
    }
    public static int remove(int x, int y){
        int erg;
        erg = x -y;
        return erg;
    }
    public static int multi( int x , int y ){
        int erg;
        erg = x * y;
        return erg;
    }
    public static double div ( int x, int y){
        double erg;
        erg = (double)x / y;
        return erg;
    }
}