import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MouseListenerExample implements MouseListener,MouseMotionListener {
    JFrame f;
    JButton b;
    MouseListenerExample(){
        f=new JFrame("Mouse Listener");
        f.setSize(400,400);
        f.setLayout(null);
        b=new JButton("click me");
        b.setBounds(50,100,100,30);
        f.add(b);
        b.addMouseListener(this);
        //f.addMouseListener(this);
        //f.addMouseMotionListener(this);
        f.setVisible(true);
    }
    public void mouseClicked(MouseEvent e){
       System.out.println("Mouse Clicked");
       JFrame f1=new JFrame("Home");
       f1.setSize(600,600);
       f1.setVisible(true);
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void mouseEntered(MouseEvent e){
        System.out.println("Mouse Entered");
    }
    public void mouseExited(MouseEvent e){
        System.out.println("Mouse Exit");
    }
    public void mouseReleased(MouseEvent e){
        System.out.println("Mouse Released");
    }
    public void mousePressed(MouseEvent e){
        System.out.println("Mouse pressed");
    }
    public void mouseDragged(MouseEvent e){
        System.out.println("Mouse dragged");
    }
    public void mouseMoved(MouseEvent e){
        System.out.println("Mouse moved");
    }
    public static void main(String[] args) {
        new MouseListenerExample();
    }
}
