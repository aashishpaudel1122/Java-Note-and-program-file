import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WindowListenerExample implements WindowListener {
    JFrame f;
    WindowListenerExample(){
        f=new JFrame("Window listener");
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.addWindowListener(this);
       // f.addWindowListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
    }
    public void windowOpened(WindowEvent e){
         System.out.println("window opened");
    }
    public void windowClosing(WindowEvent e){
        System.out.println("Window Closing");
    }
    public void windowClosed(WindowEvent e){

    }
    public void windowActivated(WindowEvent e){

    }
    public void windowDeactivated(WindowEvent e){

    }
    public void windowIconified(WindowEvent e){
       
    }
    public void windowDeiconified(WindowEvent e){
      
    }
    public static void main(String[] args) {
        new WindowListenerExample();
    }
}
