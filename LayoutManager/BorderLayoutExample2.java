import javax.swing.*;
import java.awt.*;
public class BorderLayoutExample2 {
    JFrame f;
    JButton b1,b2,b3,b4,b5;
    BorderLayoutExample2(){
        f=new JFrame("layout Example");
        f.setSize(800,800);
        f.setLayout(new BorderLayout(20,20));
        f.setVisible(true);
        b1=new JButton("East");
        b2=new JButton("West");
        b3=new JButton("North");
        b4=new JButton("South");
        b5=new JButton("Center");
        f.add(b1,BorderLayout.EAST);
        f.add(b2,BorderLayout.WEST);
        f.add(b3,BorderLayout.NORTH);
        f.add(b4,BorderLayout.SOUTH);
        f.add(b5,BorderLayout.CENTER);


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

    }
    public static void main(String[] args) {
        new BorderLayoutExample2();
    }
}
