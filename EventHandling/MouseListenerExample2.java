import javax.swing.*;
import java.awt.event.*;
public class MouseListenerExample2 implements MouseListener,MouseMotionListener {
    JFrame f;
    JButton b;
    MouseListenerExample2(){
       f=new JFrame("listener example");
       f.setSize(500,500);
       b=new JButton("click me");
       b.setBounds(200,300,100,50);
       f.add(b);
       f.setVisible(true);
       f.setLayout(null);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setLocationRelativeTo(null);
       f.addMouseMotionListener(this);
       b.addMouseListener(this);


    }
    public void mouseClicked(MouseEvent e){
        System.out.println(e.getClickCount());
    }
    public void mouseEntered(MouseEvent e){
        System.out.println("mouse Entered");
    }
    public void mouseExited(MouseEvent e){
        System.out.println("mouse Exited");
    }
    public void mouseReleased(MouseEvent e){
        System.out.println("Mouse Released");
    }
    public void mousePressed(MouseEvent e){
        System.out.println("mouse pressed");
    }
    public void mouseMoved(MouseEvent e){
        System.out.println("mouse moved");
    }
    public void mouseDragged(MouseEvent e){
        System.out.println("mouse Dragged");
    }
    public static void main(String[] args) {
        new MouseListenerExample2();
    }
    
}
