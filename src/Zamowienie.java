
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Zamowienie extends JFrame 

{
    public Zamowienie (JFrame parent){
        
        initComponents();
        
        int szer = (int)parent.getBounds().getWidth(); //300
     
       int wys = (int)parent.getBounds().getHeight();//200
       
       int szerRamki = this.getSize().width;//250
       int wysRamki = this.getSize().height;//75
       this.setLocation(parent.getBounds().x+(szer-szerRamki)/2,parent.getBounds().y+ (wys-wysRamki)/2);
        
    }
    public void initComponents ()
    {
        this.setTitle("Nowe Zamówienie");
        this.setBounds(500, 550, 500, 500);
        panelWpisywaniaZamowienia.add(daneZamowinia);
        panelPrzyciskow.add(wyslij);
        

           
        
    }
    
    JTextArea daneZamowinia = new JTextArea();
    JPanel panelPrzyciskow = new JPanel();
    JPanel panelWpisywaniaZamowienia = new JPanel();
    JButton wyslij = new JButton ("Wyślij");
    
    public static void main(String[] args) {
        
       
      
    }
    
}
