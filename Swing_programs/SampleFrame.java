import javax.swing.*;
import java.awt.event.*;
public class SampleFrame {
    JFrame main;
    JLabel message;
    JButton ok;
     JComboBox country;
    SampleFrame(){
        main=new JFrame("Main");
        main.setSize(500,500);
        main.setLayout(null);
        message=new JLabel();
        message.setHorizontalAlignment(JLabel.CENTER);
        message.setSize(400,100);

        ok=new JButton("OK");
        ok.setBounds(200,150,70,30);
        String c[]={"Nepal","China","India","Srilanka","Bhutan","Bangaladesh"};
       country=new JComboBox(c);
       country.setBounds(100,150,70,30);
       main.add(country);main.add(message);main.add(ok);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setLocationRelativeTo(null);
        main.setVisible(true);

        ok.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
            String msg="country selected is:"+country.getItemAt(country.getSelectedIndex());
            message.setText(msg);
          }  
        });
        main.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                main.dispose();
                JOptionPane.showMessageDialog(null,"window closed");
            }
            public void windowOpened(WindowEvent e){
                JOptionPane.showMessageDialog(null,"window Opened");
            }
        });
    }
 
    public static void main(String[] args) {
        new SampleFrame();
    }
    
}
