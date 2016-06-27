package Uebungen.Blatt_5;

/**
 * Created by Konstantin on 16.06.2016.
 */
public class BankKonto {
    private String bankKontoInhaberVor;
    private String bankKontoInhaberNach;
    private int kontoNummer;
    private float kontostand = 0;
    private float kontolimit = 0;

    public BankKonto(String bankKontoInhaberNach, String bankKontoInhaberVor, float kontolimit, int kontoNummer, float kontostand) {
        this.bankKontoInhaberNach = bankKontoInhaberNach;
        this.bankKontoInhaberVor = bankKontoInhaberVor;
        this.kontolimit = kontolimit * -1;
        this.kontoNummer = kontoNummer;
        this.kontostand = kontostand;
    }

    public BankKonto(String bankKontoInhaberNach, String bankKontoInhaberVor, int kontoNummer, float kontostand) {
        this.bankKontoInhaberNach = bankKontoInhaberNach;
        this.bankKontoInhaberVor = bankKontoInhaberVor;
        this.kontoNummer = kontoNummer;
        this.kontostand = kontostand;
    }

    public BankKonto(String bankKontoInhaberNach, String bankKontoInhaberVor, int kontoNummer) {
        this.bankKontoInhaberNach = bankKontoInhaberNach;
        this.bankKontoInhaberVor = bankKontoInhaberVor;
        this.kontoNummer = kontoNummer;
    }

    public int getKontoNummer() {
        return kontoNummer;
    }

    @Override
    public String toString() {
        return "BankKonto{\n" +
                "bankKontoInhaberNach='" + bankKontoInhaberNach + '\'' + "\n"+
                ", bankKontoInhaberVor='" + bankKontoInhaberVor + '\'' + "\n"+
                ", kontoNummer=" + kontoNummer + "\n"+
                ", kontostand=" + kontostand + "\n"+
                ", kontolimit=" + kontolimit + "\n"+
                '}' + "\n";
    }

    public void einzahlen(float eingezahlterGeldbetrag){
        kontostand += eingezahlterGeldbetrag;
        System.out.println("Der Kontostand liegt jetzt bei " + kontostand + " Euro. ");
    }
    public void auszahlen(float auszuzahlenderGeldbetrag){
        float tmp = auszuzahlenderGeldbetrag;
        float konto = this.kontostand;
        konto -= tmp;
        System.out.println("Konto tmp beträgt: " + konto + " Limit: " + kontolimit);
        if(konto < kontolimit){
            System.out.println("Kontolimmit erschöpft");
            kontolimit kl = new kontolimit();
            kl.start();
        }
        else{
            kontostand = konto;
        }
    }

    public void kontostand(){
        System.out.println("Der Kontostand beträgt " + kontostand + " Euro.");
    }
}
