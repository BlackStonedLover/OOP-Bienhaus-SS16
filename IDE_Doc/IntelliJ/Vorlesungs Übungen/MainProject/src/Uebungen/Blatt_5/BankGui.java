package Uebungen.Blatt_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Konstantin on 16.06.2016.
 */
public class BankGui {
    private JTextField vorname;
    private JTextField nachname;
    private JTextField geldeinzahlen;
    private JButton confirm;
    private JTextField Kontonummer;
    private JTextField userInput;
    private JButton einzahlen;
    private JButton auszahlen;
    private JButton displayKontostand;
    private JPanel guipanel;
    private JTextPane Kontoanzeigen;
    private JTextPane kontoNummern;
    private int Kontonummern =0;
    public ArrayList<BankKonto> bk = new ArrayList<BankKonto>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("BankGui");
        frame.setPreferredSize(new Dimension(600,600));
        frame.setContentPane(new BankGui().guipanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public BankGui() {


        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Vor = vorname.getText();
                String Last = nachname.getText();
                float einzahlen = Float.valueOf( geldeinzahlen.getText());
                if(geldeinzahlen.getText().isEmpty()){
                    bk.add(new BankKonto(Last,Vor,Kontonummern));

                }
                else {
                    bk.add(new BankKonto(Last, Vor, einzahlen, Kontonummern,0));
                }
                Kontonummern++;
                vorname.setText("");
                nachname.setText("");
                geldeinzahlen.setText("");
                String displayKontos = "";
                for(BankKonto b : bk){
                    int itmp = b.getKontoNummer();
                    displayKontos += itmp + "\n";
                }
                kontoNummern.setText(displayKontos);
            }
        });

        einzahlen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String wantk = Kontonummer.getText();
                for(BankKonto b : bk){
                    String kn = b.getKontoNummer() + "";
                    if(kn.equals(wantk)){
                        float in = Float.valueOf(userInput.getText());
                        b.einzahlen(in);
                        Kontoanzeigen.setText(b.toString());
                        break;
                    }
                }
                Kontonummer.setText("");
                userInput.setText("");
            }
        });

        auszahlen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String wantk = Kontonummer.getText();
                for(BankKonto b : bk){
                    String kn = b.getKontoNummer() + "";
                    if(kn.equals(wantk)){
                        float out = Float.valueOf(userInput.getText());
                        b.auszahlen(out);
                        Kontoanzeigen.setText(b.toString());
                        break;
                    }
                }
                Kontonummer.setText("");
                userInput.setText("");
            }
        });
        displayKontostand.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String wantk = Kontonummer.getText();
                for(BankKonto b : bk){
                    String kn = b.getKontoNummer() + "";
                    if(kn.equals(wantk)){
                        Kontoanzeigen.setText(b.toString());
                        break;
                    }
                }
                Kontonummer.setText("");
                userInput.setText("");
            }
        });
    }
}
