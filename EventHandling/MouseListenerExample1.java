import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MouseListenerExample1 implements MouseListener,MouseMotionListener {
    JFrame f;
    JButton b;
    MouseListenerExample1(){
        f=new JFrame("Mouse Event Handling");
        f.setSize(400,400);
        f.setLayout(null);
        b=new JButton("click me");
        b.setBounds(50,100,100,30);
        f.add(b);
        b.addMouseListener(this);
        f.addMouseMotionListener(this);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void mouseClicked(MouseEvent e){
     JFrame f1=new JFrame("home");
     f1.setSize(600,600);
     f1.setVisible(true);
    }
    public void mouseEntered(MouseEvent e){
        System.out.println("Mouse Entered");
    }
    public void mouseExited(MouseEvent e){
        System.out.println("Mouse Exited");
    }
    public void mousePressed(MouseEvent e){
        System.out.println("Mouse pressed");
    }
    public void mouseReleased(MouseEvent e){
        System.out.println("Mouse released");
    }
    public void mouseDragged(MouseEvent e){
      System.out.println("Mouse Dragged");
    }
    public void mouseMoved(MouseEvent e){
        System.out.println("Mouse Moved");
    }
    public static void main(String[] args) {
        new MouseListenerExample1();
    }
}
