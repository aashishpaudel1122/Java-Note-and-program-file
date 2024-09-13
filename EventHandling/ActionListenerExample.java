import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ActionListenerExample implements ActionListener {
    JFrame f;
    JButton b,b1;
    ActionListenerExample(){
        f=new JFrame("Action Listener Example");
        f.setSize(400,400);
        b=new JButton("click1");
        b.setBounds(100,100,100,30);
        f.add(b);
        b.addActionListener(this);
        b1=new JButton("Click2");
        b1.setBounds(200,200,200,30);
        f.add(b1);
        b1.addActionListener(this);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b){
            JOptionPane.showMessageDialog(null,"Button is clicked");
        }
        else if(e.getSource()==b1){
                JOptionPane.showMessageDialog(null, "button 1 is clicked");
            }
        
        
    }
    
    public static void main(String[] args) {
        new ActionListenerExample();
    }
}
