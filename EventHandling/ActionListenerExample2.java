//Action Listener Example
import javax.swing.*;
import java.awt.event.*;
public class ActionListenerExample2 implements ActionListener{
    JFrame f,home,f1;
    JButton b1,b2;


    ActionListenerExample2(){
     f=new JFrame("main");
     b1=new JButton("submit");
     b2=new JButton("Reset");
     f.setSize(500,500);
     f.setVisible(true);
     f.setLayout(null);
     b1.setBounds(50,50,100,30);
     b2.setBounds(170,50,100,30);
     f.add(b1);f.add(b2);
     b1.addActionListener(this);
     b2.addActionListener(this);
     f.setLocationRelativeTo(null);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
      System.out.println("inside Action Performed");
      if(e.getSource()==b1){
        home=new JFrame("Home page");
        home.setSize(300,300);
        home.setVisible(true);
      }
      else if(e.getSource()==b2){
         f1=new JFrame("Change Password");
         f1.setSize(600,600);
         f1.setVisible(true);
      }
    }
   public static void main(String[] args) {
    new ActionListenerExample2();
   } 
}
