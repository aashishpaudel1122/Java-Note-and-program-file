import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WindowListenerExample1  {
      JFrame f;
      WindowListenerExample1(){
        f=new JFrame("Window Listener");
        f.setSize(400,400);
       f.addWindowListener(new WindowAdapter(){
         public void windowClosing(WindowEvent e){
            System.out.println("window Closed");
            f.dispose();
         }
       });
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
      }
      
    public static void main(String[] args) {
        new WindowListenerExample1();
    }
}
