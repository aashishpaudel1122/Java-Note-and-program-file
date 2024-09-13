import java.awt.*;
import java.awt.event.*;
public class SampleFrame implements MouseListener, MouseMotionListener{
    Frame f;
    Button b;
    SampleFrame(){
        f=new Frame("Home Page");
        b=new Button("login");
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        b.setBounds(50,100,100,50);
        f.add(b);
        b.addMouseListener(this);
        f.addMouseMotionListener(this);
    }
    public void mouseClicked(MouseEvent e){
       System.out.println("mouse Clicked");
    }
    public void mousePressed(MouseEvent e){

    }
    public void mouseEntered(MouseEvent e){

    }
public void mouseExited(MouseEvent e){

}
public void mouseReleased(MouseEvent e){

}
public void mouseDragged(MouseEvent e){
  System.out.println("mouse dragged");
}
public void mouseMoved(MouseEvent e){
System.out.println("mouse moved");
}
 public static void main(String[] args) {
    new SampleFrame();
 }
}