import javax.swing.*;
import java.awt.event.*;
public class WindowListenerExample2 implements WindowListener {
    JFrame f;
    WindowListenerExample2(){
        f=new JFrame("Window Listener");
        f.setSize(500,600);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.addWindowListener(this);
    }
    public void windowClosing(WindowEvent e){
      System.out.println("window Closing");
      f.dispose();
    }
    public void windowClosed(WindowEvent e){
      System.out.println("window closed");
      
    }
    public void windowOpened(WindowEvent e){
        System.out.println("window opened");
    }
    public void windowActivated(WindowEvent e){
        System.out.println("window Activated");
    }
    public void windowDeactivated(WindowEvent e){
        System.out.println("window Deactivated");

    }
    public void windowIconified(WindowEvent e){
        System.out.println("window Iconified");

    }
    public void windowDeiconified(WindowEvent e){
        System.out.println("window Deiconified");

    }

    public static void main(String[] args) {
        new WindowListenerExample2();
    }
}
