import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MouseAdapterExample {
    JFrame f;
    MouseAdapterExample(){
       f=new JFrame("Mouse Adapter");
       f.setSize(400,400);
       f.setVisible(true);
       f.addMouseListener(new MouseAdapter(){
          public void mouseClicked(MouseEvent e){
            System.out.println("Mouse Clicked");
          }
       });
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setLocationRelativeTo(null);

    }
    public static void main(String[] args) {
        new MouseAdapterExample();
    }
    
}
