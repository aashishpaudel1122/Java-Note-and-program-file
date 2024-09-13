import javax.swing.*;
import java.awt.*;
public class FlowLayoutExample2 {
    JFrame f;
    JButton b1,b2,b3,b4,b5;
    FlowLayoutExample2(){
        f=new JFrame("layout Example");
        f.setSize(800,800);
        f.setLayout(new FlowLayout(10,20,20));
        f.setVisible(true);
        b1=new JButton("button1");
        b2=new JButton("button2");
        b3=new JButton("button3");
        b4=new JButton("button4");
        b5=new JButton("button5");
        f.add(b1);
        f.add(b5);
        f.add(b3);
        f.add(b4);
        f.add(b2);


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

    }
    public static void main(String[] args) {
        new FlowLayoutExample2();
    }
}
