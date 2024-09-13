import javax.swing.*;
import java.awt.*;
public class BorderLayoutExample1 {
    JFrame f;
    JButton east,west,south,north,center;
    BorderLayoutExample1(){
        f=new JFrame("Border Layout");
        east=new JButton("East");
        west=new JButton("West");
        south=new JButton("South");
        north=new JButton("North");
        center =new JButton("Center");
        f.setLayout(new BorderLayout(5,5));
        f.add(east,BorderLayout.EAST);
        f.add(west,BorderLayout.WEST);
        f.add(south,BorderLayout.SOUTH);
        f.add(north,BorderLayout.NORTH);
        f.add(center,BorderLayout.CENTER);
        
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new BorderLayoutExample1();
    }
}
