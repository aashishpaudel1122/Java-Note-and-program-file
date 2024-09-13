
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseAdapterExample1 {
    JFrame f;
    MouseAdapterExample1(){
        f=new JFrame("Window Adapter");
        f.setSize(500,500);
        f.addWindowListener(new WindowAdapter() {
            public void windowIconified(WindowEvent e){
                System.out.println("Window Opened");
            }
        });
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[]){
        new MouseAdapterExample1();
    }
    
}
