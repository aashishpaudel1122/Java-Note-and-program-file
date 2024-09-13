import javax.swing.*;
import java.awt.*;
public class FlowLayoutExample1 {
    JFrame f;
    JButton one, two, three, four, five, six;
    FlowLayoutExample1(){
        f=new JFrame("Flow Layout");
        f.setSize(400,400);
        one=new JButton("1");
        two=new JButton("2");
        three=new JButton("3");
        four=new JButton("4");
        five=new JButton("5");
        six=new JButton("6");
        f.setLayout(new GridLayout(3,3,10,10));
        f.add(one);f.add(two);f.add(three);
        f.add(four);f.add(five);f.add(six);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        
    }
    public static void main(String[] args) {
        new FlowLayoutExample1();
    }
}
