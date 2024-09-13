import java.applet.*;
import java.awt.*;
import javax.swing.*;
public class AppletExample extends Applet {
    public void paint(Graphics g){
        JFrame f=new JFrame();
        f.setVisible(true);
        f.setSize(100,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g.drawString("hello",50,100);
    }
}
