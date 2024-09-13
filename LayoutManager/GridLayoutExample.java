import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GridLayoutExample  implements ActionListener{
    JFrame f;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    GridLayoutExample(){
        f=new JFrame("Layout Example ");
        f.setSize(500,600);
        b1=new JButton("Button1");
        b2=new JButton("Button2");
        b3=new JButton("Button3");
        b4=new JButton("Button4");
        b5=new JButton("Button5");
        b6=new JButton("Button6");
        b7=new JButton("Button7");
        b8=new JButton("Button8");
        b9=new JButton("Button9");

        f.setLayout(new GridLayout(3,3,30,30));

        f.add(b1);f.add(b2);f.add(b3);f.add(b4);
        f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1)
            JOptionPane.showMessageDialog(null,"button1 clicked");
        else if(e.getSource()==b2)
            JOptionPane.showMessageDialog(null, "button 2 is clicked");
        else if(e.getSource()==b3)
            JOptionPane.showMessageDialog(null, "button3 is clicked");
    }
    
    public static void main(String[] args) {
        new GridLayoutExample();
    }

}