public class Fabinatiae {
    public static void main(String[] args) {
        double erg =0;
        erg= kla();
       System.out.println("Ergbins " + erg);
    }
    public static double kla(){
        double a;
        double erg = 0;
        for(int i=1; i <2; i++){
        a = 1+(1/i);
        erg = expo(a,i);
        System.out.println(a);
        
        }
        //if(erg == 3)
        return erg;
        //else return 0;
        
    }
    public static double expo(double a, double b){
        double erg =a;
        
        for(int i=1; i <b; i++ ){
            erg *= a;
        }
        System.out.println("Aktuelles Ergbinslautet: " + erg);
        return erg;
    }
    

}