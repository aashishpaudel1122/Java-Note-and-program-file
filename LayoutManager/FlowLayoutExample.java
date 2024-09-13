import javax.swing.*;
import java.awt.*;
public class FlowLayoutExample {
    JFrame f;
    JButton one,two,three,four,five, six,seven;
    FlowLayoutExample(){
        f=new JFrame("Flow Layout");
        one=new JButton("1");
        two=new JButton("2");
        three=new JButton("3");
        four=new JButton("4");
        five=new JButton("5");
        six=new JButton("6");
        f.add(one);f.add(two);f.add(three);
        f.add(four);f.add(five);f.add(six);
        f.setLayout(new GridLayout(3,3,5,5));
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}
