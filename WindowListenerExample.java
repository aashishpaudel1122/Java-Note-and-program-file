import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WindowListenerExample implements WindowListener {
    JFrame f;
    //JTextField a;
    WindowListenerExample(){
        f=new JFrame("Key Listener");
        f.setSize(500,500);
       // a=new JTextField();
        f.setLayout(null);  
        //a.setBounds(100,100,300,200);
        f.addWindowListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f.add(a);
        f.setVisible(true);     
    }
    public void windowOpened(WindowEvent e){
       System.out.println("Window Opened");
    }
    public void windowClosed(WindowEvent e){
      System.out.println("Window Closed");
    }
    public void windowClosing(WindowEvent e){
         System.out.println("Window Closing");
    }
    public void windowIconified(WindowEvent e){
       System.out.println("Window Iconified");
    }
    public void windowDeiconified(WindowEvent e){
       System.out.println("Window DeIconified");
    }
    public void windowActivated(WindowEvent e){
       System.out.println("Window Activated");
    }
    public void windowDeactivated(WindowEvent e){
        System.out.println("Window Deactivated");
    }
    public static void main(String[] args) {
        new WindowListenerExample();
    }   
}
