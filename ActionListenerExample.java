//Action lIstener Example Program
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ActionListenerExample implements ActionListener {
    JFrame f;
    JButton b1;
    JButton b2;
    ActionListenerExample(){
        f=new JFrame("Action Listener");
        f.setSize(500,500);
        f.setLayout(null);
        b1=new JButton("reset");
        b1.setBounds(100,50,100,30);
        f.add(b1);
        b2=new JButton("login");
        b2.setBounds(100,250,100,30);
        f.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
          if(e.getSource()==b1){
            JOptionPane.showMessageDialog(null,"this is button 1");
          }
          else if(e.getSource()==b2){
            JOptionPane.showMessageDialog(null,"this is button 2");
          }
          else{
            JOptionPane.showMessageDialog(null,"Error");

          }
    }
    public static void main(String[] args) {
        new ActionListenerExample();
    }
}
