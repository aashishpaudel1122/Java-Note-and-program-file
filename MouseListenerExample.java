import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MouseListenerExample implements MouseListener,MouseMotionListener{
  JFrame f;
  JButton b;
  MouseListenerExample(){
    f=new JFrame("Mouse Listener Example");
    f.setSize(500,500);
    b=new JButton("click me");
    b.setBounds(100,100,100,30);
    f.add(b);
    b.addMouseListener(this);
    f.addMouseMotionListener(this);
    f.setLayout(null);
    f.setLocationRelativeTo(null);
    f.setVisible(true);
  }
  public void mouseExited(MouseEvent e){
       System.out.println("mouse Exited");
  }
  public void mousePressed(MouseEvent e){

  }
  public void mouseReleased(MouseEvent e){

  }
  public void mouseClicked(MouseEvent e){
      System.out.println("mouse Clicked");
      JFrame main=new JFrame("new J Frame");
      main.setSize(600,600);
      main.setVisible(true);
      f.setVisible(false);

  }
  public void mouseEntered(MouseEvent e){

  }
  public void mouseDragged(MouseEvent e){
         System.out.println("mouse Dragged");
  }
  public void mouseMoved(MouseEvent e){

  }
  public static void main(String[] args) {
     new MouseListenerExample();
  }
}