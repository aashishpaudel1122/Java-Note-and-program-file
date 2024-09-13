
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KeyListenerExample implements KeyListener{
    JFrame f;
    JTextArea a;
    KeyListenerExample(){
        f=new JFrame("KeyListener Example");
        f.setSize(500,500);
        f.setLayout(null);
        a=new JTextArea();
        a.setBounds(50,50,300,300);
        f.add(a);
        a.addKeyListener(this);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
    }
    public void keyTyped(KeyEvent e){
      System.out.println("key typed");

    }
    public void keyPressed(KeyEvent e){
       System.out.println("key pressed");
    }
    public void keyReleased(KeyEvent e){
       System.out.println("key released");
    }
    public static void main(String[] args) {
        new KeyListenerExample();
    }
}
