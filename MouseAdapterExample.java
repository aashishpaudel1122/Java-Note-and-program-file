import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MouseAdapterExample {
    JFrame f;
    JButton b;
    MouseAdapterExample(){
        f=new JFrame("Mouse Adapter Example");
        f.setSize(500,500);
        f.setLayout(null);
        b=new JButton("Mouse click");
        b.setBounds(100,50,100,30);
        f.add(b);
        f.setVisible(true);
        b.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("mouse is clicked");
            }
        });

    }
    public static void main(String[] args) {
        new MouseAdapterExample();
    }
}
