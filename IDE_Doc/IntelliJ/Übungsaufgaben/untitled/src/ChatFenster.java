import javax.naming.event.NamespaceChangeListener;
import javax.swing.*;
import javax.xml.soap.Text;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dijivu on 08.06.2016.
 */
public class ChatFenster {
    private JTextArea Chatverlauf;
    private JTextField Texteingabe;
    private JButton SendButton;
    private JPanel chat_area;
    private History his = new History();
    public static void main(String[] args) {
        JFrame frame = new JFrame("ChatFenster");
        frame.setContentPane(new ChatFenster().chat_area);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public ChatFenster() {
        SendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    his.save(Texteingabe.getText());
                    Texteingabe.setText("");
                    Chatverlauf.setText(his.load());
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Es ist ein Fehler aufgetreten.");

                }
            }
        });
    }
}

