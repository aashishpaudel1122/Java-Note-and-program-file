import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KeyListenerExample implements KeyListener {
    JFrame f;
    JTextField a;
    KeyListenerExample(){
        f=new JFrame("Key Listener");
        f.setSize(500,500);
        a=new JTextField();
        f.setLayout(null);  
        a.setBounds(100,100,300,200);
        a.addKeyListener(this);
        f.add(a);
        f.setVisible(true);
         
    }
    public void keyPressed(KeyEvent e){
         System.out.println("key pressed");
      
    }
    public void keyReleased(KeyEvent e){
        System.out.println("key released");
    }
    public void keyTyped(KeyEvent e){
     System.out.println("key typed"+e.getKeyChar());
    }
    public static void main(String[] args) {
        new KeyListenerExample();
    }
}
