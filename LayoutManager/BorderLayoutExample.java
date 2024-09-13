import javax.swing.*;
import java.awt.*;
public class BorderLayoutExample {
    JFrame f;
    JButton north, south, east, west, center;
    BorderLayoutExample(){
        f=new JFrame("Border Layout");
        f.setSize(400,400);
        f.setVisible(true);
        east=new JButton("East");
        west=new JButton("West");
        south=new JButton("South");
        north=new JButton("North");
        center=new JButton("Center");
        f.setLayout(new BorderLayout(10,10));
        f.add(east,BorderLayout.EAST);
        f.add(west,BorderLayout.WEST);
        f.add(north,BorderLayout.NORTH);
        f.add(south,BorderLayout.SOUTH);
        f.add(center,BorderLayout.CENTER);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
